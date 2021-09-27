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
public class Heatmap extends Chart implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private String name; //
    
    private String coordinateSystem; // Default: 'cartesian2d'
    
    private String xAxisIndex; // Default: 0
    
    private String yAxisIndex; // Default: 0
    
    private String geoIndex; // Default: 0
    
    private String calendarIndex; // Default: 0
    
    private String pointSize; // Default: 20
    
    private String blurSize; // Default: 20
    
    private String minOpacity; // Default: 0
    
    private String maxOpacity; // Default: 1
    
    private String progressive; // Default: 400
    
    private String progressiveThreshold; // Default: 3000
    
    private Map<String, Object> label; //
    
    private Object labelLayout; //Object|Function
    
    private Map<String, Object> itemStyle; //
    
    private Map<String, Object> emphasis; //
    
    private Map<String, Object> universalTransition; //
    
    private Map<String, Object> blur; //
    
    private Map<String, Object> select; //
    
    private Object selectedMode; //boolean|string Default: false
    
    private Map<String, Object> encode; //
    
    private String seriesLayoutBy; // Default: 'column'
    
    private String datasetIndex; // Default: 0
    
    private String dataGroupId; //
    
    private Map<String, Object> markPoint; //
    
    private Map<String, Object> markLine; //
    
    private Map<String, Object> markArea; //
    
    private String zlevel; // Default: 0
    
    private String z; // Default: 2
    
    private String silent; // Default: false
    
    private Map<String, Object> tooltip; //
    
    

    public Heatmap()
    {
        this.type = "heatmap";
    }
}