/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.toolbox.feature.magictype;

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
public class Option implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private Map<String, Object> line; //
    
    private Map<String, Object> bar; //
    
    private Map<String, Object> stack; //
    
    


    public Option()
    {
    }

    public Option(Map<String, Object> property)
    {
    }
}