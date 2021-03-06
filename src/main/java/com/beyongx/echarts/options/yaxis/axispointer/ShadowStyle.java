/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.yaxis.axispointer;

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
public class ShadowStyle implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String color; // Default: 'rgba(150,150,150,0.3)'
    
    private Integer shadowBlur; //
    
    private String shadowColor; //
    
    private String shadowOffsetX; // Default: 0
    
    private String shadowOffsetY; // Default: 0
    
    private String opacity; // Default: 1
    
    


    public ShadowStyle()
    {
    }

    public ShadowStyle(Map<String, Object> property)
    {
    }
}