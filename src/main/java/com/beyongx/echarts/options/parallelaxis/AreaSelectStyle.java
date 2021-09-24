/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.parallelaxis;

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
public class AreaSelectStyle implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String width; // Default: 20
    
    private String borderWidth; // Default: 1
    
    private String borderColor; // Default: 'rgba(160,197,232)'
    
    private String color; // Default: 'rgba(160,197,232)'
    
    private String opacity; // Default: '0.3'
    
    


    public AreaSelectStyle()
    {
    }

    public AreaSelectStyle(Map<String, Object> property)
    {
    }
}