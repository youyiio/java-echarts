/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.charts.sunburst;

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
public class LabelLine implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String show; //
    
    private String showAbove; //
    
    private Integer length2; //
    
    private Object smooth; //boolean|number Default: false
    
    private Integer minTurnAngle; //
    
    private Map<String, Object> lineStyle; //
    
    


    public LabelLine()
    {
    }

    public LabelLine(Map<String, Object> property)
    {
    }
}