/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.charts.bar;

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
public class BackgroundStyle implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String color; // Default: 'rgba(180, 180, 180, 0.2)'
    
    private String borderColor; // Default: '#000'
    
    private String borderWidth; // Default: 0
    
    private String borderType; // Default: 'solid'
    
    private Object borderRadius; //number|Array Default: 0
    
    private Integer shadowBlur; //
    
    private String shadowColor; //
    
    private String shadowOffsetX; // Default: 0
    
    private String shadowOffsetY; // Default: 0
    
    private String opacity; // Default: 1
    
    


    public BackgroundStyle()
    {
    }

    public BackgroundStyle(Map<String, Object> property)
    {
    }
}