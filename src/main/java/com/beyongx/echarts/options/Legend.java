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
 * <p>图例组件。</p>
 * <p>图例组件展现了不同系列的标记(symbol)，颜色和名字。可以通过点击图例控制哪些系列不显示。</p>
 * <p>ECharts 3 中单个 echarts 实例中可以存在多个图例组件，会方便多个图例的布局。</p>
 * <p>当图例数量过多时，可以使用 <a href="https://echarts.apache.org/examples/zh/editor.html?c=pie-legend&amp;edit=1&amp;reset=1" target="_blank">滚动图例（垂直）</a> 或 <a href="https://echarts.apache.org/examples/zh/editor.html?c=radar2&amp;edit=1&amp;reset=1" target="_blank">滚动图例（水平）</a>，参见：<a href="#legend.type">legend.type</a></p>
 * 
 * {_more_}
 */

@lombok.Data
@EqualsAndHashCode(callSuper = false)
public class Legend implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String type; //
    
    private String id; //
    
    private String show; // Default: true
    
    private String zlevel; // Default: 0
    
    private String z; // Default: 2
    
    private Object left; //string|number Default: 'auto'
    
    private Object top; //string|number Default: 'auto'
    
    private Object right; //string|number Default: 'auto'
    
    private Object bottom; //string|number Default: 'auto'
    
    private Object width; //string|number Default: 'auto'
    
    private Object height; //string|number Default: 'auto'
    
    private String orient; // Default: 'horizontal'
    
    private String align; // Default: 'auto'
    
    private Object padding; //number|Array Default: 5
    
    private String itemGap; // Default: 10
    
    private String itemWidth; // Default: 25
    
    private String itemHeight; // Default: 14
    
    private Map<String, Object> itemStyle; //
    
    private Map<String, Object> lineStyle; //
    
    private Object symbolRotate; //number|string Default: 'inherit'
    
    private Object formatter; //string|Function
    
    private Object selectedMode; //string|boolean Default: true
    
    private String inactiveColor; // Default: '#ccc'
    
    private String inactiveBorderColor; // Default: '#ccc'
    
    private String inactiveBorderWidth; // Default: 'auto'
    
    private Map<String, Object> selected; //
    
    private Map<String, Object> textStyle; //
    
    private Map<String, Object> tooltip; //
    
    private String icon; //
    
    private Object[] data; //
    
    private String backgroundColor; // Default: 'transparent'
    
    private String borderColor; // Default: '#ccc'
    
    private String borderWidth; // Default: 1
    
    private Object borderRadius; //number|Array Default: 0
    
    private Integer shadowBlur; //
    
    private String shadowColor; //
    
    private String shadowOffsetX; // Default: 0
    
    private String shadowOffsetY; // Default: 0
    
    private String scrollDataIndex; // Default: 0
    
    private String pageButtonItemGap; // Default: 5
    
    private Integer pageButtonGap; //
    
    private String pageButtonPosition; // Default: 'end'
    
    private Object pageFormatter; //string|Function Default: '{current}/{total}'
    
    private Map<String, Object> pageIcons; //
    
    private String pageIconColor; // Default: '#2f4554'
    
    private String pageIconInactiveColor; // Default: '#aaa'
    
    private Object pageIconSize; //number|Array Default: 15
    
    private Map<String, Object> pageTextStyle; //
    
    private String animation; //
    
    private String animationDurationUpdate; // Default: 800
    
    private Map<String, Object> emphasis; //
    
    private Object selector; //boolean|Array Default: false
    
    private Map<String, Object> selectorLabel; //
    
    private String selectorPosition; // Default: 'auto'
    
    private String selectorItemGap; // Default: 7
    
    private String selectorButtonGap; // Default: 10
    
    


    public Legend()
    {
    }

    public Legend(Map<String, Object> property)
    {
    }
}