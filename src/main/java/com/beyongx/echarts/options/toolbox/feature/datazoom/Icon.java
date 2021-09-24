/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.toolbox.feature.datazoom;

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
public class Icon implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String zoom; //
    
    private String back; //
    
    


    public Icon()
    {
    }

    public Icon(Map<String, Object> property)
    {
    }
}