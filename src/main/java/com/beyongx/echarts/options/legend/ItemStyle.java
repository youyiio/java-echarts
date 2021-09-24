/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.legend;

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

    private String color; // Default: 'inherit'
    
    private String borderColor; // Default: 'inherit'
    
    private Integer borderWidth; // Default: 'auto'
    
    private Object borderType; //string|number|Array Default: 'inherit'
    
    private Integer borderDashOffset; // Default: 'inherit'
    
    private String borderCap; // Default: 'inherit'
    
    private String borderJoin; // Default: 'inherit'
    
    private Integer borderMiterLimit; // Default: 'inherit'
    
    private String shadowBlur; // Default: 0
    
    private String shadowColor; //
    
    private String shadowOffsetX; // Default: 0
    
    private String shadowOffsetY; // Default: 0
    
    private Integer opacity; // Default: 'inherit'
    
    private Map<String, Object> decal; // Default: 'inherit'
    
    


    public ItemStyle()
    {
    }

    public ItemStyle(Map<String, Object> property)
    {
    }
}