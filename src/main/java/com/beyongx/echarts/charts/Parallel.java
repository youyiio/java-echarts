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
public class Parallel extends Chart implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private String coordinateSystem; // Default: 'parallel'
    
    private String parallelIndex; // Default: 0
    
    private String name; //
    
    private String colorBy; // Default: 'series'
    
    private Map<String, Object> lineStyle; //
    
    private Map<String, Object> emphasis; //
    
    private String inactiveOpacity; // Default: '0.05'
    
    private String activeOpacity; // Default: 1
    
    private String realtime; // Default: true
    
    private Object smooth; //boolean|number Default: false
    
    private String progressive; // Default: 500
    
    private String progressiveThreshold; // Default: 3000
    
    private String progressiveChunkMode; // Default: 'sequential'
    
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
    
    

    public Parallel()
    {
        this.type = "parallel";
    }
}