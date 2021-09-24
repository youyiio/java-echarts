/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.timeline;

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
public class Progress implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private Map<String, Object> lineStyle; //
    
    private Map<String, Object> itemStyle; //
    
    private Map<String, Object> label; //
    
    


    public Progress()
    {
    }

    public Progress(Map<String, Object> property)
    {
    }
}