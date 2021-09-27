/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.toolbox.feature;

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
public class MagicType implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String show; // Default: true
    
    private Object[] type; //
    
    private Map<String, Object> title; //
    
    private Map<String, Object> icon; //
    
    private Map<String, Object> iconStyle; //
    
    private Map<String, Object> emphasis; //
    
    private Map<String, Object> option; //
    
    private Map<String, Object> seriesIndex; //
    
    


    public MagicType()
    {
    }

    public MagicType(Map<String, Object> property)
    {
    }
}