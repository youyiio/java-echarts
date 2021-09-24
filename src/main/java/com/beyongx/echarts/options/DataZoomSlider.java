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
public class DataZoomSlider implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private String show; // Default: true
    
    private String backgroundColor; // Default: 'rgba(47,69,84,0)'
    
    private Map<String, Object> dataBackground; //
    
    private Map<String, Object> selectedDataBackground; //
    
    private String fillerColor; // Default: 'rgba(167,183,204,0.4)'
    
    private String borderColor; // Default: '#ddd'
    
    private String handleIcon; //
    
    private Object handleSize; //number|string Default: '100%'
    
    private Map<String, Object> handleStyle; //
    
    private String moveHandleIcon; //
    
    private String moveHandleSize; // Default: 7
    
    private Map<String, Object> moveHandleStyle; //
    
    private Object labelPrecision; //number|string Default: 'auto'
    
    private Object labelFormatter; //string|Function
    
    private String showDetail; // Default: true
    
    private String showDataShadow; // Default: 'auto'
    
    private String realtime; // Default: true
    
    private Map<String, Object> textStyle; //
    
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
    
    private Map<String, Object> rangeMode; //
    
    private String zlevel; // Default: 0
    
    private String z; // Default: 2
    
    private Object left; //string|number Default: 'auto'
    
    private Object top; //string|number Default: 'auto'
    
    private Object right; //string|number Default: 'auto'
    
    private Object bottom; //string|number Default: 'auto'
    
    private String brushSelect; // Default: true
    
    private Map<String, Object> brushStyle; //
    
    private Map<String, Object> emphasis; //
    
    


    public DataZoomSlider()
    {
    }

    public DataZoomSlider(Map<String, Object> property)
    {
    }
}