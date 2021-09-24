/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.singleaxis.tooltip.axispointer;

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
public class CrossStyle implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String color; // Default: '#555'
    
    private String width; // Default: 1
    
    private Object type; //string|number|Array Default: 'dashed'
    
    private String dashOffset; // Default: 0
    
    private String cap; // Default: 'butt'
    
    private String join; // Default: 'bevel'
    
    private String miterLimit; // Default: 10
    
    private Integer shadowBlur; //
    
    private String shadowColor; //
    
    private String shadowOffsetX; // Default: 0
    
    private String shadowOffsetY; // Default: 0
    
    private String opacity; // Default: 1
    
    


    public CrossStyle()
    {
    }

    public CrossStyle(Map<String, Object> property)
    {
    }
}