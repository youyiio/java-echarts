package com.beyongx.echarts;

import com.beyongx.echarts.charts.Bar;
import com.beyongx.echarts.options.Title;
import com.beyongx.echarts.options.XAxis;
import com.beyongx.echarts.options.YAxis;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.File;
import java.lang.Runtime;
import java.io.IOException;

public class BarTest {
    
    @Before
    public void tearup() {

    }

    @After
    public void tearDown() {

    }

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

        Bar chart = new Bar();
        chart.data(5, 20, 36, 10, 10, 20); //[5, 20, 36, 10, 10, 20]
        

        option.addSeries(chart);

        echarts.option(option);

        String content = echarts.render();
        System.out.println(content);
        Assert.assertTrue("ok", StringUtils.isNotBlank(content));

        //浏览器打开网页
        String filePath = System.getProperty("user.dir");
        String chartFile = filePath + "/examples/log/bar.html";
        try {
            FileUtils.write(new File(chartFile), content, "utf-8");
            //启动网页
            Runtime.getRuntime().exec("cmd /c start " + chartFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
    }
}
