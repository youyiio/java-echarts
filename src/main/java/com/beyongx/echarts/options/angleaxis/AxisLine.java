/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.angleaxis;

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
public class AxisLine implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String show; // Default: true
    
    private Object symbol; //string|Array Default: 'none'
    
    private Object[] symbolSize; // Default: '[10, 15]'
    
    private Object symbolOffset; //Array|number Default: '[0, 0]'
    
    private Map<String, Object> lineStyle; //
    
    


    public AxisLine()
    {
    }

    public AxisLine(Map<String, Object> property)
    {
    }
}