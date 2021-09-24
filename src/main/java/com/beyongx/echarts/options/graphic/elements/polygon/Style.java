/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.graphic.elements.polygon;

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
public class Style implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String fill; // Default: '#000'
    
    private String stroke; //
    
    private String lineWidth; // Default: 0
    
    private Integer shadowBlur; // Default: 'undefined'
    
    private Integer shadowOffsetX; // Default: 'undefined'
    
    private Integer shadowOffsetY; // Default: 'undefined'
    
    private Integer shadowColor; // Default: 'undefined'
    
    


    public Style()
    {
    }

    public Style(Map<String, Object> property)
    {
    }
}