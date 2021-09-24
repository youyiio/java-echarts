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
public class Graph extends Chart implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private String name; //
    
    private String legendHoverLink; // Default: true
    
    private String coordinateSystem; //
    
    private String xAxisIndex; // Default: 0
    
    private String yAxisIndex; // Default: 0
    
    private String polarIndex; // Default: 0
    
    private String geoIndex; // Default: 0
    
    private String calendarIndex; // Default: 0
    
    private Map<String, Object> center; //
    
    private String zoom; // Default: 1
    
    private String layout; // Default: 'none'
    
    private Map<String, Object> circular; //
    
    private Map<String, Object> force; //
    
    private Object roam; //boolean|string Default: false
    
    private String nodeScaleRatio; // Default: '0.6'
    
    private String draggable; // Default: false
    
    private Object edgeSymbol; //Array|string Default: '[\'none\', \'none\']'
    
    private Object edgeSymbolSize; //Array|number Default: 10
    
    private String cursor; // Default: 'pointer'
    
    private Map<String, Object> itemStyle; //
    
    private Map<String, Object> lineStyle; //
    
    private Map<String, Object> label; //
    
    private Map<String, Object> edgeLabel; //
    
    private Object labelLayout; //Object|Function
    
    private Map<String, Object> emphasis; //
    
    private Map<String, Object> blur; //
    
    private Map<String, Object> select; //
    
    private Object selectedMode; //boolean|string Default: false
    
    private Map<String, Object> categories; //
    
    private Object autoCurveness; //boolean|number|Array Default: false
    
    private Map<String, Object> data; //
    
    private Map<String, Object> nodes; //
    
    private Map<String, Object> links; //
    
    private Map<String, Object> edges; //
    
    private Map<String, Object> markPoint; //
    
    private Map<String, Object> markLine; //
    
    private Map<String, Object> markArea; //
    
    private String zlevel; // Default: 0
    
    private String z; // Default: 2
    
    private Object left; //string|number Default: 'center'
    
    private Object top; //string|number Default: 'middle'
    
    private Object right; //string|number Default: 'auto'
    
    private Object bottom; //string|number Default: 'auto'
    
    private Object width; //string|number Default: '自适应'
    
    private Object height; //string|number Default: '自适应'
    
    private String silent; // Default: false
    
    private String animation; // Default: true
    
    private String animationThreshold; // Default: 2000
    
    private Object animationDuration; //number|Function Default: 1000
    
    private String animationEasing; // Default: 'cubicOut'
    
    private Object animationDelay; //number|Function Default: 0
    
    private Object animationDurationUpdate; //number|Function Default: 300
    
    private String animationEasingUpdate; // Default: 'cubicInOut'
    
    private Object animationDelayUpdate; //number|Function Default: 0
    
    private Map<String, Object> tooltip; //
    
    

    public Graph()
    {
        this.type = "graph";
    }
}