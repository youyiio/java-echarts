/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.charts;

import java.io.Serializable;
import java.util.Map;

//import lombok.Data;
import lombok.EqualsAndHashCode;

import com.beyongx.echarts.Chart;

/**
 * {_more_}
 */

@lombok.Data
@EqualsAndHashCode(callSuper = false)
public class ThemeRiver extends Chart implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private String name; //
    
    private String colorBy; // Default: 'data'
    
    private String zlevel; // Default: 0
    
    private String z; // Default: 2
    
    private Object left; //string|number Default: '5%'
    
    private Object top; //string|number Default: '5%'
    
    private Object right; //string|number Default: '5%'
    
    private Object bottom; //string|number Default: '5%'
    
    private Object width; //string|number
    
    private Object height; //string|number
    
    private String coordinateSystem; // Default: '"single"'
    
    private Object[] boundaryGap; // Default: '["10%", "10%"]'
    
    private String singleAxisIndex; // Default: 0
    
    private Map<String, Object> label; //
    
    private Map<String, Object> labelLine; //
    
    private Object labelLayout; //Object|Function
    
    private Map<String, Object> itemStyle; //
    
    private Map<String, Object> emphasis; //
    
    private Map<String, Object> blur; //
    
    private Map<String, Object> select; //
    
    private Object selectedMode; //boolean|string Default: false
    
    private Map<String, Object> tooltip; //
    
    

    public ThemeRiver()
    {
        this.type = "themeriver";
    }
}