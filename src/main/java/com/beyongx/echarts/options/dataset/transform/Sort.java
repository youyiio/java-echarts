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
public class Sort implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String type; // Default: 'sort'
    
    private String config; //
    
    private String print; // Default: false
    
    


    public Sort()
    {
    }

    public Sort(Map<String, Object> property)
    {
    }
}