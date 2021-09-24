/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.xaxis;

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
public class MinorSplitLine implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String show; // Default: false
    
    private Map<String, Object> lineStyle; //
    
    


    public MinorSplitLine()
    {
    }

    public MinorSplitLine(Map<String, Object> property)
    {
    }
}