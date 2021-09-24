/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.charts.tree.data.select;

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

    private String color; // Default: '#ccc'
    
    private String width; // Default: '1.5'
    
    private String curveness; // Default: '0.5'
    
    private Integer shadowBlur; //
    
    private String shadowColor; //
    
    private String shadowOffsetX; // Default: 0
    
    private String shadowOffsetY; // Default: 0
    
    


    public LineStyle()
    {
    }

    public LineStyle(Map<String, Object> property)
    {
    }
}