/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.aria.label.series;

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
public class Multiple implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String prefix; // Default: '它由{seriesCount}个图表系列组成。'
    
    private String withName; // Default: '图表类型是{seriesType}，表示{seriesName}。'
    
    private String withoutName; // Default: '图表类型是{seriesType}。'
    
    private Map<String, Object> separator; //
    
    


    public Multiple()
    {
    }

    public Multiple(Map<String, Object> property)
    {
    }
}