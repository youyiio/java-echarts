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
public class Lines extends Chart implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private String name; //
    
    private String colorBy; // Default: 'series'
    
    private String coordinateSystem; // Default: 'geo'
    
    private String xAxisIndex; // Default: 0
    
    private String yAxisIndex; // Default: 0
    
    private String geoIndex; // Default: 0
    
    private String polyline; // Default: false
    
    private Map<String, Object> effect; //
    
    private String large; // Default: false
    
    private String largeThreshold; // Default: 2000
    
    private Object symbol; //string|Array Default: 'none'
    
    private Object symbolSize; //number|Array Default: 10
    
    private Map<String, Object> lineStyle; //
    
    private Map<String, Object> label; //
    
    private Object labelLayout; //Object|Function
    
    private Map<String, Object> emphasis; //
    
    private Map<String, Object> blur; //
    
    private Map<String, Object> select; //
    
    private Object selectedMode; //boolean|string Default: false
    
    private String progressive; // Default: 400
    
    private String progressiveThreshold; // Default: 3000
    
    private String dataGroupId; //
    
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
    
    private Map<String, Object> universalTransition; //
    
    

    public Lines()
    {
        this.type = "lines";
    }
}