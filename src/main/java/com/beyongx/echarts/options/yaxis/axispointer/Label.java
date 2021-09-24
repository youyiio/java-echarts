/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.yaxis.axispointer;

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
public class Label implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String show; // Default: false
    
    private Object precision; //number|string Default: 'auto'
    
    private Object formatter; //string|Function
    
    private String margin; // Default: '3'
    
    private String color; // Default: '#fff'
    
    private String fontStyle; // Default: 'normal'
    
    private Object fontWeight; //string|number Default: 'normal'
    
    private String fontFamily; // Default: 'sans-serif'
    
    private String fontSize; // Default: 12
    
    private Integer lineHeight; //
    
    private Integer width; //
    
    private Integer height; //
    
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
    
    private Object padding; //string|Array Default: '[5, 7, 5, 7]'
    
    private String backgroundColor; // Default: 'auto'
    
    private String borderColor; //
    
    private String borderWidth; // Default: '0'
    
    private String shadowBlur; // Default: 3
    
    private String shadowColor; // Default: '#aaa'
    
    private String shadowOffsetX; // Default: 0
    
    private String shadowOffsetY; // Default: 0
    
    


    public Label()
    {
    }

    public Label(Map<String, Object> property)
    {
    }
}