/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options;

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
public class StateAnimation implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String duration; // Default: 300
    
    private String easing; // Default: 'cubicOut'
    
    


    public StateAnimation()
    {
    }

    public StateAnimation(Map<String, Object> property)
    {
    }
}