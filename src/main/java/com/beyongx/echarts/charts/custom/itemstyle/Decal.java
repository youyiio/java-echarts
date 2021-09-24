/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.charts.custom.itemstyle;

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
public class Decal implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private Object symbol; //string|Array Default: 'rect'
    
    private String symbolSize; // Default: 1
    
    private String symbolKeepAspect; // Default: true
    
    private String color; // Default: 'rgba(0, 0, 0, 0.2)'
    
    private String backgroundColor; //
    
    private Object dashArrayX; //number|Array Default: 5
    
    private Object dashArrayY; //number|Array Default: 5
    
    private String rotation; // Default: 0
    
    private String maxTileWidth; // Default: 512
    
    private String maxTileHeight; // Default: 512
    
    


    public Decal()
    {
    }

    public Decal(Map<String, Object> property)
    {
    }
}