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
public class General implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String withTitle; // Default: '这是一个关于“{title}”的图表。'
    
    private String withoutTitle; // Default: '这是一个图表，'
    
    


    public General()
    {
    }

    public General(Map<String, Object> property)
    {
    }
}