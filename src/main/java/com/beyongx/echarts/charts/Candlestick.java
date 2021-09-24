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
public class Candlestick extends Chart implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private String coordinateSystem; // Default: 'cartesian2d'
    
    private String xAxisIndex; // Default: 0
    
    private String yAxisIndex; // Default: 0
    
    private String name; //
    
    private String colorBy; // Default: 'series'
    
    private String legendHoverLink; // Default: true
    
    private String hoverAnimation; // Default: true
    
    private String layout; //
    
    private Integer barWidth; //
    
    private Object barMinWidth; //number|string
    
    private Object barMaxWidth; //number|string
    
    private Map<String, Object> itemStyle; //
    
    private Map<String, Object> emphasis; //
    
    private Map<String, Object> blur; //
    
    private Map<String, Object> select; //
    
    private Object selectedMode; //boolean|string Default: false
    
    private String large; // Default: true
    
    private String largeThreshold; // Default: 600
    
    private String progressive; // Default: 3000
    
    private String progressiveThreshold; // Default: 10000
    
    private String progressiveChunkMode; // Default: 'mod'
    
    private Map<String, Object> dimensions; //
    
    private Map<String, Object> encode; //
    
    private String dataGroupId; //
    
    private Map<String, Object> data; //
    
    private Map<String, Object> markPoint; //
    
    private Map<String, Object> markLine; //
    
    private Map<String, Object> markArea; //
    
    private String clip; // Default: true
    
    private String zlevel; // Default: 0
    
    private String z; // Default: 2
    
    private String silent; // Default: false
    
    private Object animationDuration; //number|Function Default: 300
    
    private String animationEasing; // Default: 'linear'
    
    private Object animationDelay; //number|Function Default: 0
    
    private Map<String, Object> universalTransition; //
    
    private Map<String, Object> tooltip; //
    
    

    public Candlestick()
    {
        this.type = "candlestick";
    }
}