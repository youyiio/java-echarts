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
 * <p>雷达图坐标系组件，只适用于<a href="#series-radar">雷达图</a>。该组件等同 ECharts 2 中的 polar 组件。因为 3 中的 polar 被重构为标准的极坐标组件，为避免混淆，雷达图使用 radar 组件作为其坐标系。</p>
 * <p>雷达图坐标系与极坐标系不同的是它的每一个轴（indicator 指示器）都是一个单独的维度，可以通过 <a href="#radar.name">name</a>、<a href="#radar.axisLine">axisLine</a>、<a href="#radar.axisTick">axisTick</a>、<a href="#radar.axisLabel">axisLabel</a>、<a href="#radar.splitLine">splitLine</a>、 <a href="#radar.splitArea">splitArea</a> 几个配置项配置指示器坐标轴线的样式。</p>
 * <p>下面是一个 radar 组件的一个自定义例子。</p>
 * <iframe  data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/radar&edit=1&reset=1" width="400" height="400"></iframe>
 * 
 * {_more_}
 */

@lombok.Data
@EqualsAndHashCode(callSuper = false)
public class Radar implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private String zlevel; // Default: 0
    
    private String z; // Default: 2
    
    private Object[] center; // Default: '[\'50%\', \'50%\']'
    
    private Object radius; //number|string|Array Default: '75%'
    
    private String startAngle; // Default: 90
    
    private Map<String, Object> name; //
    
    private String nameGap; // Default: 15
    
    private String splitNumber; // Default: 5
    
    private String shape; // Default: 'polygon'
    
    private String scale; // Default: false
    
    private String silent; // Default: false
    
    private String triggerEvent; // Default: false
    
    private Map<String, Object> axisLine; //
    
    private Map<String, Object> axisTick; //
    
    private Map<String, Object> axisLabel; //
    
    private Map<String, Object> splitLine; //
    
    private Map<String, Object> splitArea; //
    
    private Object[] indicator; //
    
    


    public Radar()
    {
    }

    public Radar(Map<String, Object> property)
    {
    }
}