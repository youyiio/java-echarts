/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.title;

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
public class SubtextStyle implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String color; // Default: '#aaa'
    
    private String fontStyle; // Default: 'normal'
    
    private Object fontWeight; //string|number Default: 'normal'
    
    private String fontFamily; // Default: 'sans-serif'
    
    private String fontSize; // Default: 12
    
    private String align; //
    
    private String verticalAlign; //
    
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
    
    private Map<String, Object> rich; //
    
    


    public SubtextStyle()
    {
    }

    public SubtextStyle(Map<String, Object> property)
    {
    }
}