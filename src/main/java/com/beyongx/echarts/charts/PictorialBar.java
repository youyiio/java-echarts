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
public class PictorialBar extends Chart implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private String name; //
    
    private String colorBy; // Default: 'series'
    
    private String legendHoverLink; // Default: true
    
    private String coordinateSystem; // Default: 'cartesian2d'
    
    private String xAxisIndex; // Default: 0
    
    private String yAxisIndex; // Default: 0
    
    private String cursor; // Default: 'pointer'
    
    private Map<String, Object> label; //
    
    private Map<String, Object> labelLine; //
    
    private Object labelLayout; //Object|Function
    
    private Map<String, Object> itemStyle; //
    
    private Map<String, Object> emphasis; //
    
    private Map<String, Object> blur; //
    
    private Map<String, Object> select; //
    
    private Object selectedMode; //boolean|string Default: false
    
    private Object barWidth; //number|string Default: '自适应'
    
    private Object barMaxWidth; //number|string
    
    private Object barMinWidth; //number|string
    
    private String barMinHeight; // Default: 0
    
    private String barMinAngle; // Default: 0
    
    private String barGap; // Default: '-100%'
    
    private String barCategoryGap; // Default: '20%'
    
    private String symbol; // Default: 'circle'
    
    private Object symbolSize; //number|Array Default: '[\'100%\', \'100%\']'
    
    private String symbolPosition; // Default: 'start'
    
    private Object[] symbolOffset; // Default: '[0, 0]'
    
    private Integer symbolRotate; //
    
    private Object symbolRepeat; //boolean|number|string
    
    private String symbolRepeatDirection; // Default: 'start'
    
    private Object symbolMargin; //number|string
    
    private String symbolClip; // Default: false
    
    private Object symbolBoundingData; //number|Array
    
    private String symbolPatternSize; // Default: 400
    
    private String hoverAnimation; // Default: false
    
    private Object[] dimensions; //
    
    private Map<String, Object> encode; //
    
    private String dataGroupId; //
    
    private Map<String, Object> markPoint; //
    
    private Map<String, Object> markLine; //
    
    private Map<String, Object> markArea; //
    
    private String zlevel; // Default: 0
    
    private String z; // Default: 2
    
    private String silent; // Default: false
    
    private String animation; // Default: true
    
    private String animationThreshold; // Default: 2000
    
    private Object animationDuration; //number|Function Default: 1000
    
    private String animationEasing; // Default: 'cubicOut'
    
    private Object animationDurationUpdate; //number|Function Default: 300
    
    private String animationEasingUpdate; // Default: 'cubicInOut'
    
    private Map<String, Object> universalTransition; //
    
    private Map<String, Object> tooltip; //
    
    

    public PictorialBar()
    {
        this.type = "pictorialbar";
    }
}