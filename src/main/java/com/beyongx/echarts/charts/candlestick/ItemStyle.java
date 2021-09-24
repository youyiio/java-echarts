/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.charts.candlestick;

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

    private String color; // Default: '#c23531'
    
    private String color0; // Default: '#314656'
    
    private String borderColor; // Default: '#c23531'
    
    private String borderColor0; // Default: '#314656'
    
    private String borderWidth; // Default: 1
    
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