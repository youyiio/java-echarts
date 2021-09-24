/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.aria.label;

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
public class Series implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String maxCount; // Default: 10
    
    private Map<String, Object> single; //
    
    private Map<String, Object> multiple; //
    
    


    public Series()
    {
    }

    public Series(Map<String, Object> property)
    {
    }
}