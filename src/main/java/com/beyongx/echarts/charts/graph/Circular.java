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
public class Circular implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String rotateLabel; // Default: false
    
    


    public Circular()
    {
    }

    public Circular(Map<String, Object> property)
    {
    }
}