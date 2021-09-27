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
public class VisualMapPiecewise implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private String splitNumber; // Default: 5
    
    private Object[] pieces; //
    
    private Object[] categories; //
    
    private Integer min; //
    
    private Integer max; //
    
    private String minOpen; //
    
    private String maxOpen; //
    
    private String selectedMode; // Default: 'multiple'
    
    private String inverse; // Default: false
    
    private Integer precision; //
    
    private String itemWidth; // Default: 20
    
    private String itemHeight; // Default: 14
    
    private String align; // Default: 'auto'
    
    private Object[] text; //
    
    private String textGap; // Default: 10
    
    private String showLabel; //
    
    private String itemGap; // Default: 10
    
    private String itemSymbol; // Default: 'roundRect'
    
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
    
    


    public VisualMapPiecewise()
    {
    }

    public VisualMapPiecewise(Map<String, Object> property)
    {
    }
}