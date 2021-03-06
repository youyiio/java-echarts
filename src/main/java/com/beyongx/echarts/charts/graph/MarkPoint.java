/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.charts.graph;

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
public class MarkPoint implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private Object symbol; //string|Function Default: 'pin'
    
    private Object symbolSize; //number|Array|Function Default: 50
    
    private Object symbolRotate; //number|Function
    
    private String symbolKeepAspect; // Default: false
    
    private Object[] symbolOffset; // Default: '[0, 0]'
    
    private String silent; // Default: false
    
    private Map<String, Object> label; //
    
    private Map<String, Object> itemStyle; //
    
    private Map<String, Object> emphasis; //
    
    private Map<String, Object> blur; //
    
    private Object[] data; //
    
    private String animation; // Default: true
    
    private String animationThreshold; // Default: 2000
    
    private Object animationDuration; //number|Function Default: 1000
    
    private String animationEasing; // Default: 'cubicOut'
    
    private Object animationDelay; //number|Function Default: 0
    
    private Object animationDurationUpdate; //number|Function Default: 300
    
    private String animationEasingUpdate; // Default: 'cubicInOut'
    
    private Object animationDelayUpdate; //number|Function Default: 0
    
    


    public MarkPoint()
    {
    }

    public MarkPoint(Map<String, Object> property)
    {
    }
}