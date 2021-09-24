package com.beyongx.echarts;

import java.util.Map;
import java.util.HashMap;
import java.util.UUID;

import com.beyongx.echarts.render.Engine;
import com.beyongx.echarts.render.HtmlEngine;
import com.beyongx.echarts.options.*;

public class ECharts {

    private String id; //echarts dom id
    private Engine engine; // render engine;

    private Option optionObj; //echarts option;

    public Map<String, String> _events = new HashMap<String, String>();

    protected String echartsJsVar; //ECharts实例的js变量名

        /**
     * 私有构造函数
     */
    private ECharts(String id)
    {
        this.id = id;
        this.optionObj = new Option();        
    }

    //ECharts初始化入库，与ECharts.js一致
    public static ECharts init(String id)
    {
        ECharts instance = new ECharts(id);
        instance.use(new HtmlEngine());

        return instance;
    }

    public void use(Engine engine)
    {
        if (engine == null) {
            engine = new HtmlEngine();
        }
        this.engine = engine;

        this.setEChartsJsVar("");
    }

    //渲染输出
    public String render(Map<String, String> attribute, String theme)
    {
        return this.engine.render(this.id, this.optionObj, theme, attribute, this._events);
    }

    //添加script导入
    public void addExtraScript(String file, String dist)
    {
        this.engine.addExtraScript(file, dist);
    }

    public void on(String event, String callback)
    {
        this._events.put(event, callback);
    }

    //指定ECharts实例的js变量名
    public void setEChartsJsVar(String name)
    {
        if (name == null || name.trim().equals("")) {
            this.engine.echartsJsVar = "java_echarts_" + UUID.randomUUID().toString().replace("-", "");
        } else {
            this.engine.echartsJsVar = name;
        }

        this.echartsJsVar = this.engine.echartsJsVar;
    }
 
    //获取ECharts实例的js变量名
    public String getEChartsJsVar()
    {
        return this.echartsJsVar;
    }

    //============option及相关属性设置================================================

    public void option(Option option)
    {
        this.optionObj = option;
    }

    public void series(Chart[] charts)
    {
        this.optionObj.series(charts);
    }

    public void addSeries(Chart chart)
    {
        this.optionObj.addSeries(chart);
    }

    public void title(Title title)
    {
        this.optionObj.title(title);
    }

    public void legend(Legend legend)
    {
        this.optionObj.legend(legend);
    }

    public void grid(Grid grid)
    {
        this.optionObj.grid(grid);
    }

    public void xAxis(XAxis xAxis)
    {
        this.optionObj.xAxis(xAxis);
    }

    public void yAxis(YAxis yAxis)
    {
        this.optionObj.yAxis(yAxis);
    }

    public void polar(Polar polar)
    {
        this.optionObj.polar(polar);
    }

    public void radiusAxis(RadiusAxis radiusAxis)
    {
        this.optionObj.radiusAxis(radiusAxis);
    }

    public void angleAxis(AngleAxis angleAxis)
    {
        this.optionObj.angleAxis(angleAxis);
    }

    public void radar(Radar radar)
    {
        this.optionObj.radar(radar);
    }

    // public void dataZooms(DataZoom[] dataZooms)
    // {
    //     this.optionObj.dataZooms(dataZooms);
    // }

    // public void addDataZoom(DataZoom dataZoom)
    // {
    //     this.optionObj.addDataZoom(dataZoom);
    // }

    // public void visualMaps(Object[] visualMaps)
    // {
    //     this.optionObj.visualMaps(visualMaps);
    // }

    // public void addVisualMap(Object visualMap)
    // {
    //     this.optionObj.addVisualMap(visualMap);
    // }

    public void tooltip(Tooltip tooltip)
    {
        this.optionObj.tooltip(tooltip);
    }

    public void axisPointer(AxisPointer axisPointer)
    {
        this.optionObj.axisPointer(axisPointer);
    }

    public void toolbox(Toolbox toolbox)
    {
        this.optionObj.toolbox(toolbox);
    }

    public void brush(Brush brush)
    {
        this.optionObj.brush(brush);
    }

    public void geo(Geo geo)
    {
        this.optionObj.geo(geo);
    }

    public void parallel(Parallel parallel)
    {
        this.optionObj.parallel(parallel);
    }

    public void parallelAxis(ParallelAxis parallelAxis)
    {
        this.optionObj.parallelAxis(parallelAxis);
    }

    public void singleAxis(SingleAxis singleAxis)
    {
        this.optionObj.singleAxis(singleAxis);
    }

    public void timeline(Timeline timeline)
    {
        this.optionObj.timeline(timeline);
    }

    public void graphic(Graphic graphic)
    {
        this.optionObj.graphic(graphic);
    }

    public void calendar(Calendar calendar)
    {
        this.optionObj.calendar(calendar);
    }

    public void dataset(Dataset dataset)
    {
        this.optionObj.dataset(dataset);
    }

    public void aria(Aria aria)
    {
        this.optionObj.aria(aria);
    }

    public void textStyle(TextStyle textStyle)
    {
        this.optionObj.textStyle(textStyle);
    }

    public void stateAnimation(StateAnimation stateAnimation)
    {
        this.optionObj.stateAnimation(stateAnimation);
    }

    //============================================================
}