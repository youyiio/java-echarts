/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.charts;

import java.io.Serializable;
import java.util.Map;

//import lombok.Data;
import lombok.EqualsAndHashCode;

import com.beyongx.echarts.Chart;

/**
 * {_more_}
 */

@lombok.Data
@EqualsAndHashCode(callSuper = false)
public class EffectScatter extends Chart implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private String name; //
    
    private String colorBy; // Default: 'series'
    
    private String legendHoverLink; // Default: true
    
    private String effectType; // Default: 'ripple'
    
    private String showEffectOn; // Default: 'render'
    
    private Map<String, Object> rippleEffect; //
    
    private String coordinateSystem; // Default: 'cartesian2d'
    
    private String xAxisIndex; // Default: 0
    
    private String yAxisIndex; // Default: 0
    
    private String polarIndex; // Default: 0
    
    private String geoIndex; // Default: 0
    
    private String calendarIndex; // Default: 0
    
    private Object symbol; //string|Function Default: 'circle'
    
    private Object symbolSize; //number|Array|Function Default: 10
    
    private Object symbolRotate; //number|Function
    
    private String symbolKeepAspect; // Default: false
    
    private Map<String, Object> symbolOffset; // Default: '[0, 0]'
    
    private String cursor; // Default: 'pointer'
    
    private Map<String, Object> label; //
    
    private Map<String, Object> labelLine; //
    
    private Object labelLayout; //Object|Function
    
    private Map<String, Object> itemStyle; //
    
    private Map<String, Object> emphasis; //
    
    private Map<String, Object> blur; //
    
    private Map<String, Object> select; //
    
    private Object selectedMode; //boolean|string Default: false
    
    private String seriesLayoutBy; // Default: 'column'
    
    private String datasetIndex; // Default: 0
    
    private Map<String, Object> dimensions; //
    
    private Map<String, Object> encode; //
    
    private Map<String, Object> data; //
    
    private Map<String, Object> markPoint; //
    
    private Map<String, Object> markLine; //
    
    private Map<String, Object> markArea; //
    
    private String clip; // Default: true
    
    private String zlevel; // Default: 0
    
    private String z; // Default: 2
    
    private String silent; // Default: false
    
    private String animation; // Default: true
    
    private String animationThreshold; // Default: 2000
    
    private Object animationDuration; //number|Function Default: 1000
    
    private String animationEasing; // Default: 'cubicOut'
    
    private Object animationDelay; //number|Function Default: 0
    
    private Object animationDurationUpdate; //number|Function Default: 300
    
    private String animationEasingUpdate; // Default: 'cubicInOut'
    
    private Object animationDelayUpdate; //number|Function Default: 0
    
    private Map<String, Object> tooltip; //
    
    

    public EffectScatter()
    {
        this.type = "effectscatter";
    }
}