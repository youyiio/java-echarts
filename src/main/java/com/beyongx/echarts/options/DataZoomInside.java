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
public class DataZoomInside implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private String disabled; // Default: false
    
    private Object xAxisIndex; //number|Array
    
    private Object yAxisIndex; //number|Array
    
    private Object radiusAxisIndex; //number|Array
    
    private Object angleAxisIndex; //number|Array
    
    private String filterMode; // Default: 'filter'
    
    private String start; // Default: 0
    
    private String end; // Default: 100
    
    private Object startValue; //number|string|Date
    
    private Object endValue; //number|string|Date
    
    private Integer minSpan; //
    
    private Integer maxSpan; //
    
    private Object minValueSpan; //number|string|Date
    
    private Object maxValueSpan; //number|string|Date
    
    private String orient; //
    
    private String zoomLock; // Default: false
    
    private String throttle; // Default: 100
    
    private Object[] rangeMode; //
    
    private Object zoomOnMouseWheel; //boolean|string Default: true
    
    private Object moveOnMouseMove; //boolean|string Default: true
    
    private Object moveOnMouseWheel; //boolean|string Default: true
    
    private String preventDefaultMouseMove; // Default: true
    
    


    public DataZoomInside()
    {
    }

    public DataZoomInside(Map<String, Object> property)
    {
    }
}