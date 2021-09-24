/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.aria;

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
public class Label implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String enabled; // Default: true
    
    private String description; //
    
    private Map<String, Object> general; //
    
    private Map<String, Object> series; //
    
    private Map<String, Object> data; //
    
    


    public Label()
    {
    }

    public Label(Map<String, Object> property)
    {
    }
}