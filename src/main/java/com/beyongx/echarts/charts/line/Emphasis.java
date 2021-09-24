/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.charts.line;

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
public class Emphasis implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String scale; // Default: true
    
    private String focus; // Default: 'none'
    
    private String blurScope; // Default: 'coordinateSystem'
    
    private Map<String, Object> label; //
    
    private Map<String, Object> labelLine; //
    
    private Map<String, Object> itemStyle; //
    
    private Map<String, Object> lineStyle; //
    
    private Map<String, Object> areaStyle; //
    
    private Map<String, Object> endLabel; //
    
    


    public Emphasis()
    {
    }

    public Emphasis(Map<String, Object> property)
    {
    }
}