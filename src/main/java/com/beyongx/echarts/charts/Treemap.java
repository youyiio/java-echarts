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
public class Treemap extends Chart implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private String name; //
    
    private String zlevel; // Default: 0
    
    private String z; // Default: 2
    
    private Object left; //string|number Default: 'center'
    
    private Object top; //string|number Default: 'middle'
    
    private Object right; //string|number Default: 'auto'
    
    private Object bottom; //string|number Default: 'auto'
    
    private Object width; //string|number Default: '80%'
    
    private Object height; //string|number Default: '80%'
    
    private Integer squareRatio; //
    
    private Integer leafDepth; //
    
    private String drillDownIcon; // Default: '▶'
    
    private Object roam; //boolean|string Default: true
    
    private Object nodeClick; //boolean|string Default: 'zoomToNode'
    
    private Integer zoomToNodeRatio; // Default: '0.32*0.32'
    
    private String visualDimension; // Default: 0
    
    private Integer visualMin; //
    
    private Integer visualMax; //
    
    private Map<String, Object> colorAlpha; //
    
    private Integer colorSaturation; //
    
    private String colorMappingBy; // Default: 'index'
    
    private String visibleMin; // Default: 10
    
    private Integer childrenVisibleMin; //
    
    private Map<String, Object> label; //
    
    private Map<String, Object> upperLabel; //
    
    private Map<String, Object> itemStyle; //
    
    private Map<String, Object> emphasis; //
    
    private Map<String, Object> blur; //
    
    private Map<String, Object> select; //
    
    private Object selectedMode; //boolean|string Default: false
    
    private Map<String, Object> breadcrumb; //
    
    private Map<String, Object> labelLine; //
    
    private Object labelLayout; //Object|Function
    
    private Map<String, Object> levels; //
    
    private Map<String, Object> data; //
    
    private String silent; // Default: false
    
    private Object animationDuration; //number|Function Default: 1500
    
    private String animationEasing; // Default: 'quinticInOut'
    
    private Object animationDelay; //number|Function Default: 0
    
    private Map<String, Object> tooltip; //
    
    

    public Treemap()
    {
        this.type = "treemap";
    }
}