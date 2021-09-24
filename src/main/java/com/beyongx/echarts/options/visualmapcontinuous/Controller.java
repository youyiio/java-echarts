/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.visualmapcontinuous;

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
public class Controller implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private Map<String, Object> inRange; //
    
    private Map<String, Object> outOfRange; //
    
    


    public Controller()
    {
    }

    public Controller(Map<String, Object> property)
    {
    }
}