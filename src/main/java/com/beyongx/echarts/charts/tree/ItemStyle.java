/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.charts.tree;

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
public class ItemStyle implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String color; // Default: '自适应'
    
    private String borderColor; // Default: '#c23531'
    
    private String borderWidth; // Default: '1.5'
    
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
    
    


    public ItemStyle()
    {
    }

    public ItemStyle(Map<String, Object> property)
    {
    }
}