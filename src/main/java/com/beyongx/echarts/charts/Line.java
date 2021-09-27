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
public class Line extends Chart implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private String name; //
    
    private String colorBy; // Default: 'series'
    
    private String coordinateSystem; // Default: 'cartesian2d'
    
    private String xAxisIndex; // Default: 0
    
    private String yAxisIndex; // Default: 0
    
    private String polarIndex; // Default: 0
    
    private Object symbol; //string|Function Default: 'emptyCircle'
    
    private Object symbolSize; //number|Array|Function Default: 4
    
    private Object symbolRotate; //number|Function
    
    private String symbolKeepAspect; // Default: false
    
    private Object[] symbolOffset; // Default: '[0, 0]'
    
    private String showSymbol; // Default: true
    
    private String showAllSymbol; // Default: 'auto'
    
    private String legendHoverLink; // Default: true
    
    private String stack; //
    
    private String cursor; // Default: 'pointer'
    
    private String connectNulls; // Default: false
    
    private String clip; // Default: true
    
    private Object step; //string|boolean Default: false
    
    private Map<String, Object> label; //
    
    private Map<String, Object> endLabel; //
    
    private Map<String, Object> labelLine; //
    
    private Object labelLayout; //Object|Function
    
    private Map<String, Object> itemStyle; //
    
    private Map<String, Object> lineStyle; //
    
    private Map<String, Object> areaStyle; //
    
    private Map<String, Object> emphasis; //
    
    private Map<String, Object> blur; //
    
    private Map<String, Object> select; //
    
    private Object selectedMode; //boolean|string Default: false
    
    private Object smooth; //boolean|number Default: false
    
    private String smoothMonotone; //
    
    private String sampling; //
    
    private Object[] dimensions; //
    
    private Map<String, Object> encode; //
    
    private String seriesLayoutBy; // Default: 'column'
    
    private String datasetIndex; // Default: 0
    
    private String dataGroupId; //
    
    private Map<String, Object> markPoint; //
    
    private Map<String, Object> markLine; //
    
    private Map<String, Object> markArea; //
    
    private String zlevel; // Default: 0
    
    private String z; // Default: 2
    
    private String silent; // Default: false
    
    private String animation; // Default: true
    
    private String animationThreshold; // Default: 2000
    
    private Object animationDuration; //number|Function Default: 1000
    
    private String animationEasing; // Default: 'linear'
    
    private Object animationDelay; //number|Function Default: 0
    
    private Object animationDurationUpdate; //number|Function Default: 300
    
    private String animationEasingUpdate; // Default: 'cubicInOut'
    
    private Object animationDelayUpdate; //number|Function Default: 0
    
    private Map<String, Object> universalTransition; //
    
    private Map<String, Object> tooltip; //
    
    

    public Line()
    {
        this.type = "line";
    }
}