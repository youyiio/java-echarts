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
public class Pie extends Chart implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private String name; //
    
    private String colorBy; // Default: 'data'
    
    private String legendHoverLink; // Default: true
    
    private Object selectedMode; //boolean|string Default: false
    
    private String selectedOffset; // Default: 10
    
    private String clockwise; // Default: true
    
    private String startAngle; // Default: 90
    
    private String minAngle; // Default: 0
    
    private String minShowLabelAngle; // Default: 0
    
    private Object roseType; //boolean|string Default: false
    
    private String avoidLabelOverlap; // Default: true
    
    private String stillShowZeroSum; // Default: true
    
    private String cursor; // Default: 'pointer'
    
    private String zlevel; // Default: 0
    
    private String z; // Default: 2
    
    private Object left; //string|number Default: 0
    
    private Object top; //string|number Default: 0
    
    private Object right; //string|number Default: 0
    
    private Object bottom; //string|number Default: 0
    
    private Object width; //string|number Default: 'auto'
    
    private Object height; //string|number Default: 'auto'
    
    private String showEmptyCircle; // Default: true
    
    private Map<String, Object> emptyCircleStyle; //
    
    private Map<String, Object> label; //
    
    private Map<String, Object> labelLine; //
    
    private Object labelLayout; //Object|Function
    
    private Map<String, Object> itemStyle; //
    
    private Map<String, Object> emphasis; //
    
    private Map<String, Object> blur; //
    
    private Map<String, Object> select; //
    
    private Object[] center; // Default: '[\'50%\', \'50%\']'
    
    private Object radius; //number|string|Array Default: '[0, \'75%\']'
    
    private String seriesLayoutBy; // Default: 'column'
    
    private String datasetIndex; // Default: 0
    
    private Object[] dimensions; //
    
    private Map<String, Object> encode; //
    
    private String dataGroupId; //
    
    private Map<String, Object> markPoint; //
    
    private Map<String, Object> markLine; //
    
    private Map<String, Object> markArea; //
    
    private String silent; // Default: false
    
    private String animationType; // Default: 'expansion'
    
    private String animationTypeUpdate; // Default: 'transition'
    
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
    
    

    public Pie()
    {
        this.type = "pie";
    }
}