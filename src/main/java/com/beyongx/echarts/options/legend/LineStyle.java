/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.legend;

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
public class LineStyle implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String color; // Default: 'inherit'
    
    private Integer width; // Default: 'auto'
    
    private Object type; //string|number|Array Default: 'inherit'
    
    private Integer dashOffset; // Default: 'inherit'
    
    private String cap; // Default: 'inherit'
    
    private String join; // Default: 'inherit'
    
    private Integer miterLimit; // Default: 'inherit'
    
    private Integer shadowBlur; // Default: 'inherit'
    
    private String shadowColor; //
    
    private String shadowOffsetX; // Default: 0
    
    private String shadowOffsetY; // Default: 0
    
    private Integer opacity; // Default: 'inherit'
    
    


    public LineStyle()
    {
    }

    public LineStyle(Map<String, Object> property)
    {
    }
}