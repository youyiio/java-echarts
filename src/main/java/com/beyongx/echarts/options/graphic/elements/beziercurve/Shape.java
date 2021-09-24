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
public class Shape implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String x1; // Default: 0
    
    private String y1; // Default: 0
    
    private String x2; // Default: 0
    
    private String y2; // Default: 0
    
    private String cpx1; // Default: 0
    
    private String cpy1; // Default: 0
    
    private Integer cpx2; //
    
    private Integer cpy2; //
    
    private String percent; // Default: 1
    
    


    public Shape()
    {
    }

    public Shape(Map<String, Object> property)
    {
    }
}