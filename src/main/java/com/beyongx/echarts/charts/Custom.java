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
public class Custom extends Chart implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private String name; //
    
    private String colorBy; // Default: 'series'
    
    private String legendHoverLink; // Default: true
    
    private String coordinateSystem; // Default: 'cartesian2d'
    
    private String xAxisIndex; // Default: 0
    
    private String yAxisIndex; // Default: 0
    
    private String polarIndex; // Default: 0
    
    private String geoIndex; // Default: 0
    
    private String calendarIndex; // Default: 0
    
    private String renderItem; //
    
    private Map<String, Object> itemStyle; //
    
    private Map<String, Object> labelLine; //
    
    private Object labelLayout; //Object|Function
    
    private Object selectedMode; //boolean|string Default: false
    
    private Object[] dimensions; //
    
    private Map<String, Object> encode; //
    
    private String seriesLayoutBy; // Default: 'column'
    
    private String datasetIndex; // Default: 0
    
    private String dataGroupId; //
    
    private String clip; // Default: false
    
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
    
    

    public Custom()
    {
        this.type = "custom";
    }
}