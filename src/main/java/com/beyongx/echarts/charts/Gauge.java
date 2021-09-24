/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.charts;

import java.io.Serializable;
import java.util.Map;

//import lombok.Data;
import lombok.EqualsAndHashCode;

import com.beyongx.echarts.Chart;

/**
 * {_more_}
 */

@lombok.Data
@EqualsAndHashCode(callSuper = false)
public class Gauge extends Chart implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private String name; //
    
    private String colorBy; // Default: 'data'
    
    private String zlevel; // Default: 0
    
    private String z; // Default: 2
    
    private Map<String, Object> center; // Default: '[\'50%\', \'50%\']'
    
    private Object radius; //number|string Default: '75%'
    
    private String legendHoverLink; // Default: true
    
    private String startAngle; // Default: 225
    
    private String endAngle; // Default: -45
    
    private String clockwise; // Default: true
    
    private Map<String, Object> data; //
    
    private String min; // Default: 0
    
    private String max; // Default: 100
    
    private String splitNumber; // Default: 10
    
    private Map<String, Object> axisLine; //
    
    private Map<String, Object> progress; //
    
    private Map<String, Object> splitLine; //
    
    private Map<String, Object> axisTick; //
    
    private Map<String, Object> axisLabel; //
    
    private Map<String, Object> pointer; //
    
    private Map<String, Object> anchor; //
    
    private Map<String, Object> itemStyle; //
    
    private Map<String, Object> emphasis; //
    
    private Map<String, Object> title; //
    
    private Map<String, Object> detail; //
    
    private Map<String, Object> markPoint; //
    
    private Map<String, Object> markLine; //
    
    private Map<String, Object> markArea; //
    
    private String silent; // Default: false
    
    private String animation; // Default: true
    
    private String animationThreshold; // Default: 2000
    
    private Object animationDuration; //number|Function Default: 1000
    
    private String animationEasing; // Default: 'cubicOut'
    
    private Object animationDelay; //number|Function Default: 0
    
    private Object animationDurationUpdate; //number|Function Default: 300
    
    private String animationEasingUpdate; // Default: 'cubicInOut'
    
    private Object animationDelayUpdate; //number|Function Default: 0
    
    private Map<String, Object> tooltip; //
    
    

    public Gauge()
    {
        this.type = "gauge";
    }
}