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
public class SingleAxis implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private String zlevel; // Default: 0
    
    private String z; // Default: 2
    
    private Object left; //string|number Default: '5%'
    
    private Object top; //string|number Default: '5%'
    
    private Object right; //string|number Default: '5%'
    
    private Object bottom; //string|number Default: '5%'
    
    private Object width; //string|number Default: 'auto'
    
    private Object height; //string|number Default: 'auto'
    
    private String orient; // Default: 'horizontal'
    
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
    
    private Map<String, Object> data; //
    
    private Map<String, Object> axisPointer; //
    
    private Map<String, Object> tooltip; //
    
    


    public SingleAxis()
    {
    }

    public SingleAxis(Map<String, Object> property)
    {
    }
}