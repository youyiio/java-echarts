/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.graphic.elements.arc;

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

    private String cx; // Default: 0
    
    private Integer cy; // Default: '0'
    
    private String r; // Default: 0
    
    private String r0; // Default: 0
    
    private String startAngle; // Default: 0
    
    private Integer endAngle; // Default: 'Math.PI * 2'
    
    private String clockwise; // Default: true
    
    


    public Shape()
    {
    }

    public Shape(Map<String, Object> property)
    {
    }
}