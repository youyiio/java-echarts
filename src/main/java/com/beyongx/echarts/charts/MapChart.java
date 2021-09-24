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
public class MapChart extends Chart implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private String name; //
    
    private String colorBy; // Default: 'series'
    
    private String map; // Default: ''
    
    private Object roam; //boolean|string Default: false
    
    private Map<String, Object> center; //
    
    private String aspectScale; // Default: '0.75'
    
    private Map<String, Object> boundingCoords; //
    
    private String zoom; // Default: 1
    
    private Map<String, Object> scaleLimit; //
    
    private Map<String, Object> nameMap; //
    
    private String nameProperty; // Default: 'name'
    
    private Object selectedMode; //boolean|string Default: false
    
    private Map<String, Object> label; //
    
    private Map<String, Object> itemStyle; //
    
    private Map<String, Object> emphasis; //
    
    private Map<String, Object> select; //
    
    private String zlevel; // Default: 0
    
    private String z; // Default: 2
    
    private Object left; //string|number Default: 'auto'
    
    private Object top; //string|number Default: 'auto'
    
    private Object right; //string|number Default: 'auto'
    
    private Object bottom; //string|number Default: 'auto'
    
    private Map<String, Object> layoutCenter; //
    
    private Object layoutSize; //number|string
    
    private Integer geoIndex; //
    
    private String mapValueCalculation; // Default: 'sum'
    
    private String showLegendSymbol; //
    
    private String seriesLayoutBy; // Default: 'column'
    
    private String datasetIndex; // Default: 0
    
    private String dataGroupId; //
    
    private Object labelLayout; //Object|Function
    
    private Map<String, Object> labelLine; //
    
    private Map<String, Object> data; //
    
    private Map<String, Object> markPoint; //
    
    private Map<String, Object> markLine; //
    
    private Map<String, Object> markArea; //
    
    private String silent; // Default: false
    
    private Map<String, Object> universalTransition; //
    
    private Map<String, Object> tooltip; //
    
    

    public MapChart()
    {
        this.type = "mapchart";
    }
}