/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.graphic.elements;

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
public class Polygon implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String type; // Default: 'polygon'
    
    private String id; // Default: 'undefined'
    
    private String $action; // Default: 'merge'
    
    private String x; // Default: 0
    
    private String y; // Default: 0
    
    private String rotation; // Default: 0
    
    private String scaleX; // Default: 1
    
    private String scaleY; // Default: 1
    
    private String originX; // Default: 0
    
    private String originY; // Default: 0
    
    private Object left; //number|string Default: 'undefined'
    
    private Object right; //number|string Default: 'undefined'
    
    private Object top; //number|string Default: 'undefined'
    
    private Object bottom; //number|string Default: 'undefined'
    
    private String bounding; // Default: 'all'
    
    private String z; // Default: 0
    
    private String zlevel; // Default: 0
    
    private String info; //
    
    private String silent; // Default: false
    
    private String invisible; // Default: false
    
    private String ignore; // Default: false
    
    private Map<String, Object> textContent; //
    
    private Map<String, Object> textConfig; //
    
    private String cursor; // Default: 'pointer'
    
    private String draggable; // Default: false
    
    private String progressive; // Default: false
    
    private Map<String, Object> shape; //
    
    private Map<String, Object> style; //
    
    private String focus; // Default: 'none'
    
    private String blurScope; // Default: 'coordinateSystem'
    
    private String onclick; //
    
    private String onmouseover; //
    
    private String onmouseout; //
    
    private String onmousemove; //
    
    private String onmousewheel; //
    
    private String onmousedown; //
    
    private String onmouseup; //
    
    private String ondrag; //
    
    private String ondragstart; //
    
    private String ondragend; //
    
    private String ondragenter; //
    
    private String ondragleave; //
    
    private String ondragover; //
    
    private String ondrop; //
    
    


    public Polygon()
    {
    }

    public Polygon(Map<String, Object> property)
    {
    }
}