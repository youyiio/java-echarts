/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.charts.gauge;

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
    
    private String splitNumber; // Default: 5
    
    private Object length; //number|string Default: 6
    
    private String distance; // Default: 10
    
    private Map<String, Object> lineStyle; //
    
    


    public AxisTick()
    {
    }

    public AxisTick(Map<String, Object> property)
    {
    }
}