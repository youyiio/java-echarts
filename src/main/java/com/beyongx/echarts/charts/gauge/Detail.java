/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.charts.gauge;

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
public class Detail implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String show; // Default: true
    
    private String color; // Default: '#464646'
    
    private String fontStyle; // Default: 'normal'
    
    private Object fontWeight; //string|number Default: 'bold'
    
    private String fontFamily; // Default: 'sans-serif'
    
    private String fontSize; // Default: 30
    
    private String lineHeight; // Default: 30
    
    private String backgroundColor; // Default: 'transparent'
    
    private String borderColor; // Default: '#ccc'
    
    private String borderWidth; // Default: 0
    
    private Object borderType; //string|number|Array Default: 'solid'
    
    private String borderDashOffset; // Default: 0
    
    private Object borderRadius; //number|Array Default: 0
    
    private Object padding; //number|Array Default: 0
    
    private String shadowColor; // Default: 'transparent'
    
    private String shadowBlur; // Default: 0
    
    private String shadowOffsetX; // Default: 0
    
    private String shadowOffsetY; // Default: 0
    
    private String width; // Default: 100
    
    private String height; // Default: 40
    
    private String textBorderColor; //
    
    private Integer textBorderWidth; //
    
    private Object textBorderType; //string|number|Array Default: 'solid'
    
    private String textBorderDashOffset; // Default: 0
    
    private String textShadowColor; // Default: 'transparent'
    
    private String textShadowBlur; // Default: 0
    
    private String textShadowOffsetX; // Default: 0
    
    private String textShadowOffsetY; // Default: 0
    
    private String overflow; // Default: 'none'
    
    private String ellipsis; // Default: '...'
    
    private String lineOverflow; // Default: 'none'
    
    private Map<String, Object> rich; //
    
    private String valueAnimation; // Default: true
    
    private Map<String, Object> offsetCenter; // Default: '[0, \'40%\']'
    
    private Object formatter; //Function|string
    
    


    public Detail()
    {
    }

    public Detail(Map<String, Object> property)
    {
    }
}