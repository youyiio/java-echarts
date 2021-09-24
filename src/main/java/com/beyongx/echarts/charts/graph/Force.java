/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.charts.graph;

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
public class Force implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String initLayout; //
    
    private Object repulsion; //Array|number Default: 50
    
    private String gravity; // Default: '0.1'
    
    private Object edgeLength; //Array|number Default: 30
    
    private String layoutAnimation; // Default: true
    
    private String friction; // Default: '0.6'
    
    


    public Force()
    {
    }

    public Force(Map<String, Object> property)
    {
    }
}