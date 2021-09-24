/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.timeline;

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
public class ControlStyle implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String show; // Default: true
    
    private String showPlayBtn; // Default: true
    
    private String showPrevBtn; // Default: true
    
    private String showNextBtn; // Default: true
    
    private String itemSize; // Default: 24
    
    private String itemGap; // Default: 12
    
    private String position; // Default: 'left'
    
    private String playIcon; //
    
    private String stopIcon; //
    
    private String prevIcon; //
    
    private String nextIcon; //
    
    private String color; // Default: '#A4B1D7'
    
    private String borderColor; // Default: '#A4B1D7'
    
    private String borderWidth; // Default: 1
    
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
    
    


    public ControlStyle()
    {
    }

    public ControlStyle(Map<String, Object> property)
    {
    }
}