/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.charts.mapchart;

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
public class Select implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private Map<String, Object> label; //
    
    private Map<String, Object> itemStyle; //
    
    


    public Select()
    {
    }

    public Select(Map<String, Object> property)
    {
    }
}