/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.charts.lines;

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
public class Effect implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String show; // Default: false
    
    private String period; // Default: 4
    
    private Object delay; //number|Function
    
    private String constantSpeed; // Default: 0
    
    private String symbol; // Default: 'circle'
    
    private Object symbolSize; //Array|number Default: 3
    
    private String color; //
    
    private String trailLength; // Default: '0.2'
    
    private String loop; // Default: true
    
    


    public Effect()
    {
    }

    public Effect(Map<String, Object> property)
    {
    }
}