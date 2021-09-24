/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options;

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
public class AxisPointer implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private String show; // Default: false
    
    private String type; // Default: 'line'
    
    private String snap; //
    
    private Integer z; //
    
    private Map<String, Object> label; //
    
    private Map<String, Object> lineStyle; //
    
    private Map<String, Object> shadowStyle; //
    
    private String triggerTooltip; // Default: true
    
    private Integer value; //
    
    private String status; //
    
    private Map<String, Object> handle; //
    
    private Map<String, Object> link; //
    
    private String triggerOn; // Default: 'mousemove|click'
    
    


    public AxisPointer()
    {
    }

    public AxisPointer(Map<String, Object> property)
    {
    }
}