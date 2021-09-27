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
public class YAxis implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private String show; // Default: true
    
    private String gridIndex; // Default: 0
    
    private String position; //
    
    private String offset; // Default: 0
    
    private String realtimeSort; // Default: false
    
    private String sortSeriesIndex; // Default: 0
    
    private String type; // Default: 'value'
    
    private String name; //
    
    private String nameLocation; // Default: 'end'
    
    private Map<String, Object> nameTextStyle; //
    
    private String nameGap; // Default: 15
    
    private Integer nameRotate; //
    
    private String inverse; // Default: false
    
    private Object boundaryGap; //boolean|Array
    
    private Object min; //number|string|Function
    
    private Object max; //number|string|Function
    
    private String scale; // Default: false
    
    private String splitNumber; // Default: 5
    
    private String minInterval; // Default: 0
    
    private Integer maxInterval; //
    
    private Integer interval; //
    
    private String logBase; // Default: 10
    
    private String silent; // Default: false
    
    private String triggerEvent; // Default: false
    
    private Map<String, Object> axisLine; //
    
    private Map<String, Object> axisTick; //
    
    private Map<String, Object> minorTick; //
    
    private Map<String, Object> axisLabel; //
    
    private Map<String, Object> splitLine; //
    
    private Map<String, Object> minorSplitLine; //
    
    private Map<String, Object> splitArea; //
    
    private Object[] data; //
    
    private Map<String, Object> axisPointer; //
    
    private String zlevel; // Default: 0
    
    private String z; // Default: 0
    
    


    public YAxis()
    {
    }

    public YAxis(Map<String, Object> property)
    {
    }
}