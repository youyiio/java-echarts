/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.datazoomslider;

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
public class BrushStyle implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String color; // Default: 'rgba(135,175,274,0.15)'
    
    private String borderColor; // Default: '#000'
    
    private String borderWidth; // Default: 0
    
    private Object borderType; //string|number|Array Default: 'solid'
    
    private String borderDashOffset; // Default: 0
    
    private String borderCap; // Default: 'butt'
    
    private String borderJoin; // Default: 'bevel'
    
    private String borderMiterLimit; // Default: 10
    
    private Integer shadowBlur; //
    
    private String shadowColor; //
    
    private String shadowOffsetX; // Default: 0
    
    private String shadowOffsetY; // Default: 0
    
    private String opacity; // Default: 1
    
    


    public BrushStyle()
    {
    }

    public BrushStyle(Map<String, Object> property)
    {
    }
}