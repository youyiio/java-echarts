/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.toolbox.feature.magictype;

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
public class SeriesIndex implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private Object[] line; //
    
    private Object[] bar; //
    
    


    public SeriesIndex()
    {
    }

    public SeriesIndex(Map<String, Object> property)
    {
    }
}