/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.geo;

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
public class ScaleLimit implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private Integer min; //
    
    private Integer max; //
    
    


    public ScaleLimit()
    {
    }

    public ScaleLimit(Map<String, Object> property)
    {
    }
}