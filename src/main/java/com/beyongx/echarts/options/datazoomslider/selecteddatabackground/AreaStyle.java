/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.datazoomslider.selecteddatabackground;

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
public class AreaStyle implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String color; // Default: '#8fb0f7'
    
    private Integer shadowBlur; //
    
    private String shadowColor; //
    
    private String shadowOffsetX; // Default: 0
    
    private String shadowOffsetY; // Default: 0
    
    private String opacity; // Default: '0.2'
    
    


    public AreaStyle()
    {
    }

    public AreaStyle(Map<String, Object> property)
    {
    }
}