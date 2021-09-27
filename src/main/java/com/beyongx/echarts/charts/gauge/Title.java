/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.charts.gauge;

import java.io.Serializable;
import java.util.Map;

//import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>标题组件，包含主标题和副标题。</p>
 * <p>在 ECharts 2.x 中单个 ECharts 实例最多只能拥有一个标题组件。但是在 ECharts 3 中可以存在任意多个标题组件，这在需要标题进行排版，或者单个实例中的多个图表都需要标题时会比较有用。</p>
 * <p><strong>例如下面不同缓动函数效果的示例，每一个缓动效果图都带有一个标题组件：</strong></p>
 * <iframe  data-src="https://echarts.apache.org/examples/zh/view.html?c=line-easing&edit=1&reset=1" width="700" height="400"></iframe>
 * 
 * {_more_}
 */

@lombok.Data
@EqualsAndHashCode(callSuper = false)
public class Title implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String show; // Default: true
    
    private Object[] offsetCenter; // Default: '[0, \'20%\']'
    
    private String color; // Default: '#464646'
    
    private String fontStyle; // Default: 'normal'
    
    private Object fontWeight; //string|number Default: 'normal'
    
    private String fontFamily; // Default: 'sans-serif'
    
    private String fontSize; // Default: 16
    
    private Integer lineHeight; //
    
    private Object backgroundColor; //string|Object Default: 'transparent'
    
    private String borderColor; //
    
    private String borderWidth; // Default: 0
    
    private Object borderType; //string|number|Array Default: 'solid'
    
    private String borderDashOffset; // Default: 0
    
    private Object borderRadius; //number|Array Default: 0
    
    private Object padding; //number|Array Default: 0
    
    private String shadowColor; // Default: 'transparent'
    
    private String shadowBlur; // Default: 0
    
    private String shadowOffsetX; // Default: 0
    
    private String shadowOffsetY; // Default: 0
    
    private Integer width; //
    
    private Integer height; //
    
    private String textBorderColor; //
    
    private Integer textBorderWidth; //
    
    private Object textBorderType; //string|number|Array Default: 'solid'
    
    private String textBorderDashOffset; // Default: 0
    
    private String textShadowColor; // Default: 'transparent'
    
    private String textShadowBlur; // Default: 0
    
    private String textShadowOffsetX; // Default: 0
    
    private String textShadowOffsetY; // Default: 0
    
    private String overflow; // Default: 'none'
    
    private String ellipsis; // Default: '...'
    
    private String lineOverflow; // Default: 'none'
    
    private Object[] rich; //
    
    private String valueAnimation; // Default: true
    
    


    public Title()
    {
    }

    public Title(Map<String, Object> property)
    {
    }
}