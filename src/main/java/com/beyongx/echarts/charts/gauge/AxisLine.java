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
public class AxisLine implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String show; // Default: true
    
    private String roundCap; // Default: false
    
    private Map<String, Object> lineStyle; //
    
    


    public AxisLine()
    {
    }

    public AxisLine(Map<String, Object> property)
    {
    }
}