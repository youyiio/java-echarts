/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.charts.effectscatter;

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
public class RippleEffect implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String color; //
    
    private String number; // Default: 3
    
    private String period; // Default: 4
    
    private String scale; // Default: '2.5'
    
    private String brushType; // Default: 'fill'
    
    


    public RippleEffect()
    {
    }

    public RippleEffect(Map<String, Object> property)
    {
    }
}