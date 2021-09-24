/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.angleaxis.axispointer;

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
public class Handle implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String show; // Default: false
    
    private String icon; //
    
    private Object size; //number|Array Default: 45
    
    private String margin; // Default: 50
    
    private String color; // Default: '#333'
    
    private String throttle; // Default: 40
    
    private String shadowBlur; // Default: 3
    
    private String shadowColor; // Default: '#aaa'
    
    private String shadowOffsetX; // Default: 2
    
    private String shadowOffsetY; // Default: 0
    
    


    public Handle()
    {
    }

    public Handle(Map<String, Object> property)
    {
    }
}