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
public class Pointer implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String show; // Default: true
    
    private String showAbove; // Default: true
    
    private String icon; //
    
    private Map<String, Object> offsetCenter; // Default: '[0, 0]'
    
    private Object length; //string|number Default: '60%'
    
    private String width; // Default: 6
    
    private String keepAspect; // Default: false
    
    private Map<String, Object> itemStyle; //
    
    


    public Pointer()
    {
    }

    public Pointer(Map<String, Object> property)
    {
    }
}