/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.graphic.elements.polyline;

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

    private Object[] points; //
    
    private Object smooth; //number|string Default: 'undefined'
    
    private String smoothConstraint; // Default: false
    
    


    public Shape()
    {
    }

    public Shape(Map<String, Object> property)
    {
    }
}