/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.charts.map.markline.emphasis;

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

    private String color; // Default: '"#000"'
    
    private String width; // Default: 1
    
    private Object type; //string|number|Array Default: 'solid'
    
    private String dashOffset; // Default: 0
    
    private String cap; // Default: 'butt'
    
    private String join; // Default: 'bevel'
    
    private String miterLimit; // Default: 10
    
    private Integer shadowBlur; //
    
    private String shadowColor; //
    
    private String shadowOffsetX; // Default: 0
    
    private String shadowOffsetY; // Default: 0
    
    private String opacity; // Default: 1
    
    


    public LineStyle()
    {
    }

    public LineStyle(Map<String, Object> property)
    {
    }
}