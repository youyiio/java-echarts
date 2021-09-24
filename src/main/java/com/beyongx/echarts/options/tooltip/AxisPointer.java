/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.tooltip;

import java.io.Serializable;
import java.util.Map;

//import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 
 * 
 * {_more_}
 */

@lombok.Data
@EqualsAndHashCode(callSuper = false)
public class AxisPointer implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String type; // Default: 'line'
    
    private String axis; // Default: 'auto'
    
    private String snap; //
    
    private Integer z; //
    
    private Map<String, Object> label; //
    
    private Map<String, Object> lineStyle; //
    
    private Map<String, Object> shadowStyle; //
    
    private Map<String, Object> crossStyle; //
    
    private String animation; // Default: true
    
    private String animationThreshold; // Default: 2000
    
    private Object animationDuration; //number|Function Default: 1000
    
    private String animationEasing; // Default: 'cubicOut'
    
    private Object animationDelay; //number|Function Default: 0
    
    private Object animationDurationUpdate; //number|Function Default: 200
    
    private String animationEasingUpdate; // Default: 'exponentialOut'
    
    private Object animationDelayUpdate; //number|Function Default: 0
    
    


    public AxisPointer()
    {
    }

    public AxisPointer(Map<String, Object> property)
    {
    }
}