/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.aria.label.series.multiple;

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
public class Separator implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String middle; // Default: '；'
    
    private String end; // Default: '。'
    
    


    public Separator()
    {
    }

    public Separator(Map<String, Object> property)
    {
    }
}