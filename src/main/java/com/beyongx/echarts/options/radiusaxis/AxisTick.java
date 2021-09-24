/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.radiusaxis;

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
public class AxisTick implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String show; // Default: true
    
    private String alignWithLabel; // Default: false
    
    private Object interval; //number|Function Default: 'auto'
    
    private String inside; // Default: false
    
    private String length; // Default: 5
    
    private Map<String, Object> lineStyle; //
    
    


    public AxisTick()
    {
    }

    public AxisTick(Map<String, Object> property)
    {
    }
}