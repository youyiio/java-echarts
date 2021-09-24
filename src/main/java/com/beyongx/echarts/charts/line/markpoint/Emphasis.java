/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.charts.line.markpoint;

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

    private Map<String, Object> label; //
    
    private Map<String, Object> itemStyle; //
    
    


    public Emphasis()
    {
    }

    public Emphasis(Map<String, Object> property)
    {
    }
}