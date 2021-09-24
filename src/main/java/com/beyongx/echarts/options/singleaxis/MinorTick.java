/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.singleaxis;

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
public class MinorTick implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String show; // Default: false
    
    private String splitNumber; // Default: 5
    
    private String length; // Default: 3
    
    private Map<String, Object> lineStyle; //
    
    


    public MinorTick()
    {
    }

    public MinorTick(Map<String, Object> property)
    {
    }
}