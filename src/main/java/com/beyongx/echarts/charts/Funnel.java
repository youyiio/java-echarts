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
public class Funnel extends Chart implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private String name; //
    
    private String colorBy; // Default: 'data'
    
    private String min; // Default: 0
    
    private String max; // Default: 100
    
    private Object minSize; //number|string Default: '0%'
    
    private Object maxSize; //number|string Default: '100%'
    
    private String orient; // Default: 'vertical'
    
    private Object sort; //string|Function Default: 'descending'
    
    private String gap; // Default: 0
    
    private String legendHoverLink; // Default: true
    
    private String funnelAlign; // Default: 'center'
    
    private Map<String, Object> label; //
    
    private Map<String, Object> labelLine; //
    
    private Map<String, Object> itemStyle; //
    
    private Object labelLayout; //Object|Function
    
    private Map<String, Object> emphasis; //
    
    private Map<String, Object> blur; //
    
    private Map<String, Object> select; //
    
    private Object selectedMode; //boolean|string Default: false
    
    private String zlevel; // Default: 0
    
    private String z; // Default: 2
    
    private Object left; //string|number Default: 80
    
    private Object top; //string|number Default: 60
    
    private Object right; //string|number Default: 80
    
    private Object bottom; //string|number Default: 60
    
    private Object width; //string|number Default: 'auto'
    
    private Object height; //string|number Default: 'auto'
    
    private String seriesLayoutBy; // Default: 'column'
    
    private String datasetIndex; // Default: 0
    
    private Object[] dimensions; //
    
    private Map<String, Object> encode; //
    
    private String dataGroupId; //
    
    private Map<String, Object> markPoint; //
    
    private Map<String, Object> markLine; //
    
    private Map<String, Object> markArea; //
    
    private String silent; // Default: false
    
    private String animation; // Default: true
    
    private String animationThreshold; // Default: 2000
    
    private Object animationDuration; //number|Function Default: 1000
    
    private String animationEasing; // Default: 'cubicOut'
    
    private Object animationDelay; //number|Function Default: 0
    
    private Object animationDurationUpdate; //number|Function Default: 300
    
    private String animationEasingUpdate; // Default: 'cubicInOut'
    
    private Object animationDelayUpdate; //number|Function Default: 0
    
    private Map<String, Object> universalTransition; //
    
    private Map<String, Object> tooltip; //
    
    

    public Funnel()
    {
        this.type = "funnel";
    }
}