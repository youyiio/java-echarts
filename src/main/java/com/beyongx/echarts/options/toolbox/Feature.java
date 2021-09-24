/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.toolbox;

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
public class Feature implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private Map<String, Object> saveAsImage; //
    
    private Map<String, Object> restore; //
    
    private Map<String, Object> dataView; //
    
    private Map<String, Object> dataZoom; //
    
    private Map<String, Object> magicType; //
    
    private Map<String, Object> brush; //
    
    


    public Feature()
    {
    }

    public Feature(Map<String, Object> property)
    {
    }
}