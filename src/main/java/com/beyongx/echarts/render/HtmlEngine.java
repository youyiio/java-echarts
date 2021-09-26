package com.beyongx.echarts.render;

import java.util.Map;
import java.util.UUID;
import java.util.HashMap;
import com.beyongx.echarts.Option;
import com.google.gson.Gson;

import org.apache.commons.lang3.StringUtils;

public class HtmlEngine extends Engine {

    public Map<String, String> method = new HashMap<String, String>();
    

    public String render(String id, Option option, String theme, 
        Map<String, String> attribute, Map<String, String> events) {
        String attributeStr = this._renderAttribute(attribute);
        if (StringUtils.isEmpty(theme)) {
            theme = "null";
        }

        String responseJs = "";
        
        Map<String, String> extraScript = this.extraScript;
        if (extraScript.containsKey("echarts")
            || extraScript.containsKey("echarts.js")
            || extraScript.containsKey("echarts.min.js")) {
            String echartsSrc = extraScript.containsKey("echarts") ? extraScript.get("echarts") : 
                (extraScript.containsKey("echarts.js") ? extraScript.get("echarts.js") : extraScript.get("echarts.min.js"));

            responseJs += this._renderScript(echartsSrc);

            extraScript.remove("echarts");
            extraScript.remove("echartsjs");
            extraScript.remove("echarts.min.js");
        } else {
            String echartsSrc = Engine.dist + "/echarts" + (StringUtils.isNotEmpty(this.distType) ? "." + this.distType : "") + (this.minify ? ".min" : "") + ".js";
            responseJs += this._renderScript(echartsSrc);
        }
        

        if (extraScript.size() > 0) {
            for (String k : extraScript.keySet()) {
                String v = extraScript.get(k);
                String src = v + "/" + k;
                responseJs += this._renderScript(src);
            }
        }
        

        String echartsJsVar = this.echartsJsVar;
        String optionJson = this.jsonEncode(option);

        StringBuffer response = new StringBuffer();
        if (StringUtils.compare(Engine.version, "3.0.0") < 0) {
            //String dist = Engine.dist;
            String require = this._require(option);
            
            
//**************多行文本输出 start            
response.append("")
.append("<div id=\"{$id}\" {$attribute}></div>")
.append("$responseJs")
.append("<script type=\"text/javascript\">")
.append("    require.config({")
.append("        paths: {")
.append("            echarts: \"{$dist}\"")
.append("        }")
.append("    });")
.append("    require(")
.append("        [")
.append("            ").append(require)
.append("        ],")
.append("        function (ec) {")
.append("            var myChart = ec.init(document.getElementById(\"{$id}\"), \"{$theme}\");")
.append("            var option = {$option};")
.append("            myChart.setOption(option);")
.append("        }")
.append("    );")
.append("</script>");

//**************多行文本输出 end 

        } else {
            String eventsHtml = "";

            if (events.size() > 0) {
                for (String event : events.keySet()) {
                    String call = events.get(event);
                    eventsHtml += echartsJsVar + ".on(\"" + event + "\", function (params) {" + call + "});";
                }
            }

            
//**************多行文本输出 start            
response.append("")
.append("<div id=\"{$id}\" {$attribute}></div>")
.append("{$responseJs}")
.append("<script type=\"text/javascript\">")
.append("    var {$echartsJsVar} = echarts.init(document.getElementById(\"{$id}\"), \"{$theme}\");")
.append("    {$echartsJsVar}.setOption({$option});")
.append("    ").append(eventsHtml)
.append("</script>");

//**************多行文本输出 end

        }

        String renderHtml = response.toString();
        renderHtml = renderHtml.replace("{$id}", id).replace("{$attribute}", attributeStr).replace("{$theme}", theme);
        renderHtml = renderHtml.replace("{$echartsJsVar}", echartsJsVar).replace("{$responseJs}", responseJs);
        renderHtml = renderHtml.replace("{$dist}", Engine.dist).replace("{$option}", optionJson);

        return renderHtml;
    }

    public String jsExpr(String string)
    {
        return this._jsMethod(string);
    }

    private String _jsMethod(String value)
    {
        String uuid = "{%" + "java_echarts_func_" + UUID.randomUUID().toString() + "%}";
        this.method.put("\"" + uuid + "\"", value);
        return uuid;
    }

    // 替换js的function
    public void optionMethod(Map<String, Object> option)
    {
        for (String k : option.keySet()) {
            Object v = option.get(k);
            if (v instanceof String) {
                String replace = (String) v;
                replace = replace.replace("\t", "");
                replace = replace.replace("\r", "");
                replace = replace.replace("\n", "");
                replace = replace.replace("\0", "");
                replace = replace.replace("\\x0B", "");
                replace = replace.replace(" ", "");
                if (replace.indexOf("function(") == 0) {
                    option.put(k, this._jsMethod(replace));
                }
            } else if (v instanceof Map<?, ?>) {
                this.optionMethod((Map<String, Object>)v);
            }
        }
    }

    public String eventMethod(String name)
    {
        return name + "(params);";
    }

    // 替换回js的函数
    public String jsonEncode(Option option)
    {
        String optionJson = new Gson().toJson(option);
        if (this.method.size() > 0) {
            for (String k : method.keySet()) {
                String v = method.get(k);
                optionJson = optionJson.replace(k, v);
            }
        }
        return optionJson;
    }
}
