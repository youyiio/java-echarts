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
public class Restore implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String show; // Default: true
    
    private String title; // Default: '还原'
    
    private String icon; //
    
    private Map<String, Object> iconStyle; //
    
    private Map<String, Object> emphasis; //
    
    


    public Restore()
    {
    }

    public Restore(Map<String, Object> property)
    {
    }
}