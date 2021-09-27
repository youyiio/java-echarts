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
public class Sankey extends Chart implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private String name; //
    
    private String zlevel; // Default: 0
    
    private String z; // Default: 2
    
    private Object left; //string|number Default: '5%'
    
    private Object top; //string|number Default: '5%'
    
    private Object right; //string|number Default: '20%'
    
    private Object bottom; //string|number Default: '5%'
    
    private Object width; //string|number
    
    private Object height; //string|number
    
    private String nodeWidth; // Default: 20
    
    private String nodeGap; // Default: 8
    
    private String nodeAlign; // Default: 'justify'
    
    private String layoutIterations; // Default: 32
    
    private String orient; // Default: 'horizontal'
    
    private String draggable; // Default: true
    
    private Object[] levels; //
    
    private Map<String, Object> label; //
    
    private Object labelLayout; //Object|Function
    
    private Map<String, Object> itemStyle; //
    
    private Map<String, Object> lineStyle; //
    
    private Map<String, Object> emphasis; //
    
    private Map<String, Object> blur; //
    
    private Map<String, Object> select; //
    
    private Object selectedMode; //boolean|string Default: false
    
    private Object[] nodes; //
    
    private Object[] links; //
    
    private Object[] edges; //
    
    private String silent; // Default: false
    
    private String animation; // Default: true
    
    private String animationThreshold; // Default: 2000
    
    private Object animationDuration; //number|Function Default: 1000
    
    private String animationEasing; // Default: 'linear'
    
    private Object animationDelay; //number|Function Default: 0
    
    private Object animationDurationUpdate; //number|Function Default: 300
    
    private String animationEasingUpdate; // Default: 'cubicInOut'
    
    private Object animationDelayUpdate; //number|Function Default: 0
    
    private Map<String, Object> tooltip; //
    
    

    public Sankey()
    {
        this.type = "sankey";
    }
}