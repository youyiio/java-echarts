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
public class Sunburst extends Chart implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private String name; //
    
    private String zlevel; // Default: 0
    
    private String z; // Default: 2
    
    private Map<String, Object> center; // Default: '[\'50%\', \'50%\']'
    
    private Object radius; //number|string|Array Default: '[0, \'75%\']'
    
    private Map<String, Object> data; //
    
    private Object labelLayout; //Object|Function
    
    private Map<String, Object> label; //
    
    private Map<String, Object> labelLine; //
    
    private Map<String, Object> itemStyle; //
    
    private Object nodeClick; //boolean|string Default: 'rootToNode'
    
    private Object sort; //string|Function Default: 'desc'
    
    private String renderLabelForZeroData; // Default: false
    
    private String emphasis; //
    
    private String blur; //
    
    private String select; //
    
    private Object selectedMode; //boolean|string Default: false
    
    private Map<String, Object> levels; //
    
    private String animation; // Default: true
    
    private String animationThreshold; // Default: 2000
    
    private Object animationDuration; //number|Function Default: 1000
    
    private String animationEasing; // Default: 'cubicOut'
    
    private Object animationDelay; //number|Function Default: 0
    
    private Object animationDurationUpdate; //number|Function Default: 500
    
    private String animationEasingUpdate; // Default: 'cubicInOut'
    
    private Object animationDelayUpdate; //number|Function Default: 0
    
    

    public Sunburst()
    {
        this.type = "sunburst";
    }
}