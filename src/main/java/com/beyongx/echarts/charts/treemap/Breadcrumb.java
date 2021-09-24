/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.charts.treemap;

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
public class Breadcrumb implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String show; // Default: true
    
    private Object left; //string|number Default: 'center'
    
    private Object top; //string|number Default: 'auto'
    
    private Object right; //string|number Default: 'auto'
    
    private Object bottom; //string|number Default: 0
    
    private String height; // Default: 22
    
    private String emptyItemWidth; // Default: 25
    
    private Map<String, Object> itemStyle; //
    
    private Map<String, Object> emphasis; //
    
    


    public Breadcrumb()
    {
    }

    public Breadcrumb(Map<String, Object> property)
    {
    }
}