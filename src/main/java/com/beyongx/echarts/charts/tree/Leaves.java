/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.charts.tree;

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
public class Leaves implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private Map<String, Object> label; //
    
    private Map<String, Object> itemStyle; //
    
    private Map<String, Object> emphasis; //
    
    private Map<String, Object> blur; //
    
    private Map<String, Object> select; //
    
    


    public Leaves()
    {
    }

    public Leaves(Map<String, Object> property)
    {
    }
}