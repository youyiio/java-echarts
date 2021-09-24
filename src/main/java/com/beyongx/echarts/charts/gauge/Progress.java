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
public class Progress implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String show; // Default: false
    
    private String overlap; // Default: true
    
    private String width; // Default: 10
    
    private String roundCap; // Default: false
    
    private String clip; // Default: false
    
    private Map<String, Object> itemStyle; //
    
    


    public Progress()
    {
    }

    public Progress(Map<String, Object> property)
    {
    }
}