/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.radar.splitarea;

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
public class AreaStyle implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private Object[] color; // Default: '[\'rgba(250,250,250,0.3)\',\'rgba(200,200,200,0.3)\']'
    
    private Integer shadowBlur; //
    
    private String shadowColor; //
    
    private String shadowOffsetX; // Default: 0
    
    private String shadowOffsetY; // Default: 0
    
    private String opacity; // Default: 1
    
    


    public AreaStyle()
    {
    }

    public AreaStyle(Map<String, Object> property)
    {
    }
}