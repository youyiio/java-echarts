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
public class Anchor implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String show; // Default: true
    
    private String showAbove; // Default: false
    
    private String size; // Default: 6
    
    private String icon; // Default: 'circle'
    
    private Object[] offsetCenter; // Default: '[0, 0]'
    
    private String keepAspect; // Default: false
    
    private Map<String, Object> itemStyle; //
    
    


    public Anchor()
    {
    }

    public Anchor(Map<String, Object> property)
    {
    }
}