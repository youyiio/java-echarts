/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.radar;

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
public class SplitLine implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String show; // Default: true
    
    private Map<String, Object> lineStyle; //
    
    


    public SplitLine()
    {
    }

    public SplitLine(Map<String, Object> property)
    {
    }
}