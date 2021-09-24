/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.graphic.elements.rect;

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
public class Shape implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String x; // Default: 0
    
    private String y; // Default: 0
    
    private String width; // Default: 0
    
    private Integer height; // Default: '0'
    
    private Map<String, Object> r; //
    
    


    public Shape()
    {
    }

    public Shape(Map<String, Object> property)
    {
    }
}