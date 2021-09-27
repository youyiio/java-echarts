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
public class Tree extends Chart implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private String name; //
    
    private String zlevel; // Default: 0
    
    private String z; // Default: 2
    
    private Object left; //string|number Default: '12%'
    
    private Object top; //string|number Default: '12%'
    
    private Object right; //string|number Default: '12%'
    
    private Object bottom; //string|number Default: '12%'
    
    private Object width; //string|number
    
    private Object height; //string|number
    
    private String layout; // Default: 'orthogonal'
    
    private String orient; // Default: 'LR'
    
    private Object symbol; //string|Function Default: 'emptyCircle'
    
    private Object symbolSize; //number|Array|Function Default: 7
    
    private Object symbolRotate; //number|Function
    
    private String symbolKeepAspect; // Default: false
    
    private Object[] symbolOffset; // Default: '[0, 0]'
    
    private String edgeShape; // Default: 'curve'
    
    private String edgeForkPosition; // Default: '50%'
    
    private Object roam; //boolean|string Default: false
    
    private String expandAndCollapse; // Default: true
    
    private String initialTreeDepth; // Default: 2
    
    private Map<String, Object> itemStyle; //
    
    private Map<String, Object> label; //
    
    private Object labelLayout; //Object|Function
    
    private Map<String, Object> lineStyle; //
    
    private Map<String, Object> emphasis; //
    
    private Map<String, Object> blur; //
    
    private Map<String, Object> select; //
    
    private Object selectedMode; //boolean|string Default: false
    
    private Map<String, Object> leaves; //
    
    private Map<String, Object> tooltip; //
    
    

    public Tree()
    {
        this.type = "tree";
    }
}