/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.charts.treemap.blur;

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
public class ItemStyle implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String color; //
    
    


    public ItemStyle()
    {
    }

    public ItemStyle(Map<String, Object> property)
    {
    }
}