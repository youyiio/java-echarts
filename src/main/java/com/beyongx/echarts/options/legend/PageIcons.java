/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.legend;

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
public class PageIcons implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private Object[] horizontal; //
    
    private Object[] vertical; //
    
    


    public PageIcons()
    {
    }

    public PageIcons(Map<String, Object> property)
    {
    }
}