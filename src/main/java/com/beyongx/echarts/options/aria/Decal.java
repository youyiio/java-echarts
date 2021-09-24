/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.aria;

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
public class Decal implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String show; // Default: false
    
    private Object decals; //Object|Array
    
    


    public Decal()
    {
    }

    public Decal(Map<String, Object> property)
    {
    }
}