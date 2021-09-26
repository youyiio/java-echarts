package com.beyongx.echarts;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import com.beyongx.echarts.options.*;

import lombok.Getter;

@Getter
public class Option {
    private Title title;
    private Tooltip tooltip;
    private Legend legend;
    private Toolbox toolbox;
    private XAxis xAxis;
    private YAxis yAxis;
  
    private List<Chart> series;
    private Grid grid;

    private Polar polar;
    private RadiusAxis radiusAxis;
    private AngleAxis angleAxis;
    private Radar radar;
    private AxisPointer axisPointer;
    private Brush brush;
    private Geo geo;
    private Parallel parallel;
    private ParallelAxis parallelAxis;
    private SingleAxis singleAxis;
    private Timeline timeline;
    private Graphic graphic;
    private Calendar calendar;
    private Dataset dataset;

    private Aria aria;
    private TextStyle textStyle;
    private StateAnimation stateAnimation;

    private Boolean darkMode;
    private List<String> color;
    private String backgroundColor;
    private Boolean animation;
    private Integer animationThreshold;
    private Integer animationDuration;
    private String animationEasing;
    private Integer animationDelay;
    private Integer animationDurationUpdate;
    private Integer animationEasingUpdate;
    private Integer animationDelayUpdate;

    public Option()
    {
        series = new ArrayList<Chart>();
        color = new ArrayList<String>();
    }

    public Option title(Title title)
    {
        this.title = title;
        return this;
    }

    public Option tooltip(Tooltip tooltip)
    {
        this.tooltip = tooltip;
        return this;
    }

    public Option legend(Legend legend)
    {
        this.legend = legend;
        return this;
    }

    public Option toolbox(Toolbox toolbox)
    {
        this.toolbox = toolbox;
        return this;
    }

    public Option xAxis(XAxis xAxis)
    {
        this.xAxis = xAxis;
        return this;
    }

    public Option yAxis(YAxis yAxis)
    {
        this.yAxis = yAxis;
        return this;
    }

    // public Option dataZooms(DataZoom[] dataZooms)
    // {
    //     this.dataZoom = dataZooms;
    //     return this;
    // }

    // public Option addDataZoom(DataZoom dataZoom)
    // {
    //     this.dataZoom = dataZoom;
    //     return this;
    // }

    public Option series(Chart[] charts)
    {
        this.series.addAll(Arrays.asList(charts));
        return this;
    }

    public Option addSeries(Chart chart)
    {
        this.series.add(chart);
        return this;
    }

    public Option grid(Grid grid)
    {
        this.grid = grid;
        return this;
    }

    public Option polar(Polar polar)
    {
        this.polar = polar;
        return this;
    }

    public Option radiusAxis(RadiusAxis radiusAxis)
    {
        this.radiusAxis = radiusAxis;
        return this;
    }

    public Option angleAxis(AngleAxis angleAxis)
    {
        this.angleAxis = angleAxis;
        return this;
    }

    public Option radar(Radar radar)
    {
        this.radar = radar;
        return this;
    }

    // public Option visualMaps(VisualMap[] visualMaps)
    // {
    //     this.visualMap = visualMaps;
    //     return this;
    // }

    // public Option addVisualMap(VisualMap visualMap)
    // {
    //     this.visualMap[] = visualMap;
    //     return this;
    // }

    public Option axisPointer(AxisPointer axisPointer)
    {
        this.axisPointer = axisPointer;
        return this;
    }

    public Option brush(Brush brush)
    {
        this.brush = brush;
        return this;
    }

    public Option geo(Geo geo)
    {
        this.geo = geo;
        return this;
    }

    public Option parallel(Parallel parallel)
    {
        this.parallel = parallel;
        return this;
    }

    public Option parallelAxis(ParallelAxis parallelAxis)
    {
        this.parallelAxis = parallelAxis;
        return this;
    }

    public Option singleAxis(SingleAxis singleAxis)
    {
        this.singleAxis = singleAxis;
        return this;
    }

    public Option timeline(Timeline timeline)
    {
        this.timeline = timeline;
        return this;
    }

    public Option graphic(Graphic graphic)
    {
        this.graphic = graphic;
        return this;
    }

    public Option calendar(Calendar calendar)
    {
        this.calendar = calendar;
        return this;
    }

    public Option dataset(Dataset dataset)
    {
        this.dataset = dataset;
        return this;
    }

    public Option aria(Aria aria)
    {
        this.aria = aria;
        return this;
    }

    public Option textStyle(TextStyle textStyle)
    {
        this.textStyle = textStyle;
        return this;
    }

    public Option stateAnimation(StateAnimation stateAnimation)
    {
        this.stateAnimation = stateAnimation;
        return this;
    }

    public Option darkMode(Boolean darkMode)    
    {
        this.darkMode = darkMode;
        return this;
    }

    public Option color(String[] colors)    
    {
        if (this.color == null) {
            this.color = new ArrayList();
        }
        this.color.addAll(Arrays.asList(colors));
        return this;
    }

    public Option backgroundColor(String backgroundColor)    
    {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public Option animation(Boolean animation)    
    {
        this.animation = animation;
        return this;
    }

    public Option animationThreshold(Integer animationThreshold)    
    {
        this.animationThreshold = animationThreshold;
        return this;
    }

    public Option animationDuration(Integer animationDuration)    
    {
        this.animationDuration = animationDuration;
        return this;
    }

    public Option animationEasing(String animationEasing)    
    {
        this.animationEasing = animationEasing;
        return this;
    }

    public Option animationDelay(Integer animationDelay)    
    {
        this.animationDelay = animationDelay;
        return this;
    }

    public Option animationDurationUpdate(Integer animationDurationUpdate)    
    {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    public Option animationEasingUpdate(Integer animationEasingUpdate)    
    {
        this.animationEasingUpdate = animationEasingUpdate;
        return this;
    }

    public Option animationDelayUpdate(Integer animationDelayUpdate)    
    {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }
}