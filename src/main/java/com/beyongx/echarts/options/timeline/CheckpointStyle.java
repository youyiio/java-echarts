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
public class CheckpointStyle implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String symbol; // Default: 'circle'
    
    private Object symbolSize; //number|Array Default: 13
    
    private Integer symbolRotate; //
    
    private String symbolKeepAspect; // Default: false
    
    private Object[] symbolOffset; // Default: '[0, 0]'
    
    private String color; // Default: '#316bf3'
    
    private String borderColor; // Default: '#fff'
    
    private String borderWidth; // Default: 2
    
    private Object borderType; //string|number|Array Default: 'solid'
    
    private String borderDashOffset; // Default: 0
    
    private String borderCap; // Default: 'butt'
    
    private String borderJoin; // Default: 'bevel'
    
    private String borderMiterLimit; // Default: 10
    
    private String shadowBlur; // Default: 2
    
    private String shadowColor; // Default: 'rgba(0, 0, 0, 0.3)'
    
    private String shadowOffsetX; // Default: 1
    
    private String shadowOffsetY; // Default: 1
    
    private String opacity; // Default: 1
    
    private String animation; // Default: true
    
    private String animationDuration; // Default: 300
    
    private String animationEasing; // Default: 'quinticInOut'
    
    


    public CheckpointStyle()
    {
    }

    public CheckpointStyle(Map<String, Object> property)
    {
    }
}