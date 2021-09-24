/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.charts.treemap;

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

    private String color; //
    
    private Integer colorAlpha; //
    
    private Integer colorSaturation; //
    
    private Object borderRadius; //number|Array Default: 0
    
    private String borderWidth; // Default: 0
    
    private String gapWidth; // Default: 0
    
    private String borderColor; // Default: '#fff\','
    
    private String borderColorSaturation; //
    
    private Integer shadowBlur; //
    
    private String shadowColor; //
    
    private String shadowOffsetX; // Default: 0
    
    private String shadowOffsetY; // Default: 0
    
    private String opacity; // Default: 1
    
    private Map<String, Object> decal; //
    
    


    public ItemStyle()
    {
    }

    public ItemStyle(Map<String, Object> property)
    {
    }
}