/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.datazoom.slider;

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
public class DataBackground implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private Map<String, Object> lineStyle; //
    
    private Map<String, Object> areaStyle; //
    
    


    public DataBackground()
    {
    }

    public DataBackground(Map<String, Object> property)
    {
    }
}