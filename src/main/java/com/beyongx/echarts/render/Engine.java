package com.beyongx.echarts.render;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import com.beyongx.echarts.Option;
import com.beyongx.echarts.Chart;

import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

public abstract class Engine {

    public static String dist = "https://cdn.jsdelivr.net/npm/echarts@5.2.0/dist"; //echarts.min.js
    public static String version = "5.2.0";
    
    protected String distType = ""; // Empty is full, other options: simple, common
    
    protected boolean minify = true; // Whether or not load minify js file

    public String echartsJsVar = ""; //ECharts实例的js变量名

    protected Map<String, String> extraScript = new HashMap<String, String>();

    //图标渲染接口
    abstract public String render(String id, Option option, String theme, 
        Map<String, String> attribute, Map<String, String> events);

    public String render(String id, Option option) {
        return this.render(id, option, "", null, null);
    }

    //获取渲染引擎名称
    public String getName() 
    {
        return this.getClass().getName();
    }

    public void addExtraScript(String file, String dist)
    {
        if (dist == null || dist.trim() == "") {
            dist = Engine.dist;
        }
        this.extraScript.put(file, dist);
    }


    protected String _renderScript(String src)
    {
        // if (!isset(this.scripts[src])) {
        //     responseJs .= '<script type="text/javascript" src="' . src . '"></script>';
        //     this.scripts[src] = true;
        // }

        return "<script type=\"text/javascript\" src=\"" + src + "\"></script>";
    }

    protected String _require(Option option)
    {
        String requireString = "'echarts',";
        List<Chart> series = option.getSeries();
        if (series != null) {
            for (Chart v : series) {
                if (v.getType() != null) {
                    requireString += "'echarts/chart/" + v.getType() + "',";
                }
            }

            requireString = StringUtils.substring(requireString, 0, requireString.length() - 1);
        }

        return requireString;
    }

    protected String _renderAttribute(Map<String, String> attribute)
    {
        String attributeString = "";

        if (!attribute.containsKey("style")) {
            attribute.put("style", "height:400px");
        }

        for (String k : attribute.keySet()) {
            String v = attribute.get(k);
            attributeString += " " + k + "=\"" + this._h(v) + "\"";
        }

        return attributeString;
    }

    protected String _h(String string)
    {
        return StringEscapeUtils.escapeHtml4(string);
    }
}