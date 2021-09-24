/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options;

import java.io.Serializable;
import java.util.Map;

//import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>地理坐标系组件。</p>
 * <p>地理坐标系组件用于地图的绘制，支持在地理坐标系上绘制<a href="#series-scatter">散点图</a>，<a href="#series-lines">线集</a>。</p>
 * <p><code class="codespan">3.1.10</code> 开始 geo 组件也支持鼠标事件。事件参数为</p>
 * <pre><code class="lang-js">{
 *     componentType: &#39;geo&#39;,
 *     // Geo 组件在 option 中的 index
 *     geoIndex: number,
 *     // 点击区域的名称，比如&quot;上海&quot;
 *     name: string,
 *     // 传入的点击区域的 region 对象，见 geo.regions
 *     region: Object
 * }
 * </code></pre>
 * <p><strong>Tip:</strong>
 * geo 区域的颜色也可以被 map series 所控制，参见 <a href="#series-map.geoIndex">series-map.geoIndex</a>。</p>
 * 
 * {_more_}
 */

@lombok.Data
@EqualsAndHashCode(callSuper = false)
public class Geo implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private String show; // Default: true
    
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
    
    private Map<String, Object> blur; //
    
    private String zlevel; // Default: 0
    
    private String z; // Default: 2
    
    private Object left; //string|number Default: 'auto'
    
    private Object top; //string|number Default: 'auto'
    
    private Object right; //string|number Default: 'auto'
    
    private Object bottom; //string|number Default: 'auto'
    
    private Map<String, Object> layoutCenter; //
    
    private Object layoutSize; //number|string
    
    private Map<String, Object> regions; //
    
    private String silent; // Default: false
    
    private Map<String, Object> tooltip; //
    
    


    public Geo()
    {
    }

    public Geo(Map<String, Object> property)
    {
    }
}