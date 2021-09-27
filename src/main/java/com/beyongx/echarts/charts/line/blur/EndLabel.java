/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.charts.line.blur;

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
public class EndLabel implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String show; // Default: false
    
    private Integer rotate; //
    
    private Object[] offset; //
    
    private Object formatter; //string|Function
    
    private String color; // Default: '"#fff"'
    
    private String fontStyle; // Default: 'normal'
    
    private Object fontWeight; //string|number Default: 'normal'
    
    private String fontFamily; // Default: 'sans-serif'
    
    private String fontSize; // Default: 12
    
    private String align; //
    
    private String verticalAlign; //
    
    private Integer lineHeight; //
    
    private Object backgroundColor; //string|Object Default: 'transparent'
    
    private String borderColor; //
    
    private String borderWidth; // Default: 0
    
    private Object borderType; //string|number|Array Default: 'solid'
    
    private String borderDashOffset; // Default: 0
    
    private Object borderRadius; //number|Array Default: 0
    
    private Object padding; //number|Array Default: 0
    
    private String shadowColor; // Default: 'transparent'
    
    private String shadowBlur; // Default: 0
    
    private String shadowOffsetX; // Default: 0
    
    private String shadowOffsetY; // Default: 0
    
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
    
    private Object[] rich; //
    
    


    public EndLabel()
    {
    }

    public EndLabel(Map<String, Object> property)
    {
    }
}