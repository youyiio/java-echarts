/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.visualmap;

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
public class Continuous extends com.beyongx.echarts.options.VisualMap implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String type; // Default: 'continuous'
    
    private String id; //
    
    private Integer min; //
    
    private Integer max; //
    
    private Object[] range; //
    
    private String calculable; // Default: false
    
    private String realtime; // Default: true
    
    private String inverse; // Default: false
    
    private String precision; // Default: 0
    
    private String itemWidth; // Default: 20
    
    private String itemHeight; // Default: 140
    
    private String align; // Default: 'auto'
    
    private Object[] text; //
    
    private String textGap; // Default: 10
    
    private String show; // Default: true
    
    private Integer dimension; //
    
    private Object seriesIndex; //number|Array
    
    private String hoverLink; // Default: true
    
    private Map<String, Object> inRange; //
    
    private Map<String, Object> outOfRange; //
    
    private Map<String, Object> controller; //
    
    private String zlevel; // Default: 0
    
    private String z; // Default: 4
    
    private Object left; //string|number Default: 0
    
    private Object top; //string|number Default: 'auto'
    
    private Object right; //string|number Default: 'auto'
    
    private Object bottom; //string|number Default: 0
    
    private String orient; // Default: 'vertical'
    
    private Object padding; //number|Array Default: 5
    
    private String backgroundColor; // Default: 'rgba(0,0,0,0)'
    
    private String borderColor; // Default: '#ccc'
    
    private String borderWidth; // Default: 0
    
    private Object[] color; // Default: '[\'#bf444c\', \'#d88273\', \'#f6efa6\']'
    
    private Map<String, Object> textStyle; //
    
    private Object formatter; //string|Function
    
    private String handleIcon; //
    
    private Object handleSize; //number|string Default: '120%'
    
    private Map<String, Object> handleStyle; //
    
    private String indicatorIcon; // Default: 'circle'
    
    private Object indicatorSize; //number|string Default: '50%'
    
    private Map<String, Object> indicatorStyle; //
    
    


    public Continuous()
    {
    }

    public Continuous(Map<String, Object> property)
    {
    }
}