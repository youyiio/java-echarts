/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.graphic.elements.beziercurve;

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
public class TextConfig implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String position; // Default: 'inside'
    
    private Integer rotation; //
    
    private Map<String, Object> layoutRect; //
    
    private Object[] offset; //
    
    private String origin; //
    
    private String distance; // Default: 5
    
    private String local; // Default: false
    
    private String insideFill; //
    
    private String insideStroke; //
    
    private String outsideFill; //
    
    private String outsideStroke; //
    
    private String inside; //
    
    


    public TextConfig()
    {
    }

    public TextConfig(Map<String, Object> property)
    {
    }
}