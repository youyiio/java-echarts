/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.charts.candlestick.markline;

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
public class Blur implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private Map<String, Object> label; //
    
    private Map<String, Object> lineStyle; //
    
    


    public Blur()
    {
    }

    public Blur(Map<String, Object> property)
    {
    }
}