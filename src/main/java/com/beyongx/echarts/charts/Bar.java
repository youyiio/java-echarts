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
public class Bar extends Chart implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private String name; //
    
    private String colorBy; // Default: 'series'
    
    private String legendHoverLink; // Default: true
    
    private String coordinateSystem; // Default: 'cartesian2d'
    
    private String xAxisIndex; // Default: 0
    
    private String yAxisIndex; // Default: 0
    
    private String polarIndex; // Default: 0
    
    private String roundCap; // Default: false
    
    private String showBackground; // Default: false
    
    private Map<String, Object> backgroundStyle; //
    
    private Map<String, Object> label; //
    
    private Map<String, Object> labelLine; //
    
    private Map<String, Object> itemStyle; //
    
    private Object labelLayout; //Object|Function
    
    private Map<String, Object> emphasis; //
    
    private Map<String, Object> blur; //
    
    private Map<String, Object> select; //
    
    private Object selectedMode; //boolean|string Default: false
    
    private String stack; //
    
    private String sampling; //
    
    private String cursor; // Default: 'pointer'
    
    private Object barWidth; //number|string Default: '自适应'
    
    private Object barMaxWidth; //number|string
    
    private Object barMinWidth; //number|string
    
    private String barMinHeight; // Default: 0
    
    private String barMinAngle; // Default: 0
    
    private String barGap; // Default: '30%'
    
    private String barCategoryGap; // Default: '20%'
    
    private String large; // Default: false
    
    private String largeThreshold; // Default: 400
    
    private String progressive; // Default: 5000
    
    private String progressiveThreshold; // Default: 3000
    
    private String progressiveChunkMode; // Default: 'mod'
    
    private Map<String, Object> dimensions; //
    
    private Map<String, Object> encode; //
    
    private String seriesLayoutBy; // Default: 'column'
    
    private String datasetIndex; // Default: 0
    
    private String dataGroupId; //
    
    private Map<String, Object> data; //
    
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
    
    private Map<String, Object> universalTransition; //
    
    private Map<String, Object> tooltip; //
    
    

    public Bar()
    {
        this.type = "bar";
    }
}