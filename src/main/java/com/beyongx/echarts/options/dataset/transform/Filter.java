/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.dataset.transform;

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
public class Filter implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String type; // Default: 'filter'
    
    private String config; //
    
    private String print; // Default: false
    
    


    public Filter()
    {
    }

    public Filter(Map<String, Object> property)
    {
    }
}