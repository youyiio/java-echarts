package com.beyongx.echarts;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import com.beyongx.echarts.charts.Line;
import com.beyongx.echarts.options.Title;
import com.beyongx.echarts.options.XAxis;
import com.beyongx.echarts.options.YAxis;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;


public class LineTest 
{

    @Test
    public void testHtml()
    {
        ECharts echarts = ECharts.init("#myChart");

        Option option = new Option();
        Title title = new Title();
        title.setText("ECharts 5.0 入门示例");
        title.setLeft("center");
        option.title(title);

        XAxis xAxis = new XAxis();
        xAxis.setData(new String[]{"衬衫", "羊毛衫", "雪纺衫", "裤子", "高跟鞋", "袜子"}); //["衬衫", "羊毛衫", "雪纺衫", "裤子", "高跟鞋", "袜子"]
        option.xAxis(xAxis);
        option.yAxis(new YAxis());

        Line chart = new Line();
        chart.data(5, 20, 36, 10, 10, 20); //[5, 20, 36, 10, 10, 20]
        chart.setSmooth(true);

        option.addSeries(chart);

        echarts.option(option);

        String content = echarts.render();
        System.out.println(content);
        assertTrue("ok", StringUtils.isNotBlank(content));

        //浏览器打开网页
        String filePath = System.getProperty("user.dir");
        String chartFile = filePath + "/examples/log/line.html";
        try {
            FileUtils.write(new File(chartFile), content, "utf-8");
            //启动网页
            Runtime.getRuntime().exec("cmd /c start " + chartFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
    }
}
