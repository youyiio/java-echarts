package com.beyongx.echarts;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.beyongx.echarts.charts.Line;
import com.beyongx.echarts.charts.MapChart;
import com.beyongx.echarts.options.Title;
import com.beyongx.echarts.options.Tooltip;
import com.beyongx.echarts.options.XAxis;
import com.beyongx.echarts.options.YAxis;
import com.beyongx.echarts.options.radar.Name;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;


public class MapTest 
{

    @Test
    public void testHtml()
    {
        ECharts echarts = ECharts.init("#myChart");

        Option option = new Option();
        Title title = new Title();
        title.setText("世界国家安全指数");
        title.setLeft("center");
        option.title(title);

        Tooltip tooltip = new Tooltip();
        tooltip.setTrigger("item");
        tooltip.setFormatter("{a}<br>{b}  {c}");
        option.tooltip(tooltip);

        XAxis xAxis = new XAxis();
        xAxis.setData(new String[]{"衬衫", "羊毛衫", "雪纺衫", "裤子", "高跟鞋", "袜子"}); //["衬衫", "羊毛衫", "雪纺衫", "裤子", "高跟鞋", "袜子"]
        option.xAxis(xAxis);
        option.yAxis(new YAxis());

        MapChart chart = new MapChart();
        chart.setNameMap(Counties.nameMap());

        Map<String, Object> d1 = new HashMap<>();
        d1.put("name", "CN");
        d1.put("value", 100);
        Map<String, Object> d2 = new HashMap<>();
        d2.put("name", "RU");
        d2.put("value", 82);
        Map<String, Object> d3 = new HashMap<>();
        d3.put("name", "JP");
        d3.put("value", 86);
        chart.data(d1, d2, d3);

        Map<String, Object> label = new HashMap<>();
        Map<String, Object> emphasis = new HashMap<>();
        emphasis.put("show", true);
        emphasis.put("textStyle", "['color' => '#fff']");
        label.put("emphasis", emphasis);
        chart.setLabel(label);

        chart.setRoam(true);

        option.addSeries(chart);

        echarts.option(option);

        echarts.addExtraScript("world.js", "https://www.xiaoqu.net.cn/theme/xiaoqu/static/js");
        String content = echarts.render();
        System.out.println(content);
        assertTrue("ok", StringUtils.isNotBlank(content));

        //浏览器打开网页
        String filePath = System.getProperty("user.dir");
        String chartFile = filePath + "/examples/log/map.html";
        try {
            FileUtils.write(new File(chartFile), content, "utf-8");
            //启动网页
            Runtime.getRuntime().exec("cmd /c start " + chartFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
    }
}
