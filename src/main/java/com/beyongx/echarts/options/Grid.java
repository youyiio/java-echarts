/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options;

import java.io.Serializable;
import java.util.Map;

//import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>直角坐标系内绘图网格，单个 grid 内最多可以放置上下两个 X 轴，左右两个 Y 轴。可以在网格上绘制<a href="#series-line">折线图</a>，<a href="#series-bar">柱状图</a>，<a href="#series-scatter">散点图（气泡图）</a>。</p>
 * <p>在 ECharts 2.x 里单个 echarts 实例中最多只能存在一个 grid 组件，在 ECharts 3 中可以存在任意个 grid 组件。</p>
 * <p><strong>例如下面这个 Anscombe Quartet 的示例：</strong></p>
 * <iframe  data-src="https://echarts.apache.org/examples/zh/view.html?c=scatter-anscombe-quartet&edit=1&reset=1" width="600" height="400"></iframe>
 * 
 * {_more_}
 */

@lombok.Data
@EqualsAndHashCode(callSuper = false)
public class Grid implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private String show; // Default: false
    
    private String zlevel; // Default: 0
    
    private String z; // Default: 2
    
    private Object left; //string|number Default: '10%'
    
    private Object top; //string|number Default: 60
    
    private Object right; //string|number Default: '10%'
    
    private Object bottom; //string|number Default: 60
    
    private Object width; //string|number Default: 'auto'
    
    private Object height; //string|number Default: 'auto'
    
    private String containLabel; // Default: false
    
    private String backgroundColor; // Default: 'transparent'
    
    private String borderColor; // Default: '#ccc'
    
    private String borderWidth; // Default: 1
    
    private Integer shadowBlur; //
    
    private String shadowColor; //
    
    private String shadowOffsetX; // Default: 0
    
    private String shadowOffsetY; // Default: 0
    
    private Map<String, Object> tooltip; //
    
    


    public Grid()
    {
    }

    public Grid(Map<String, Object> property)
    {
    }
}