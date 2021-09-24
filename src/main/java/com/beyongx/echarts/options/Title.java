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

    private String id; //
    
    private String show; // Default: true
    
    private String text; // Default: ''
    
    private String link; // Default: ''
    
    private String target; // Default: 'blank'
    
    private Map<String, Object> textStyle; //
    
    private String subtext; // Default: ''
    
    private String sublink; // Default: ''
    
    private String subtarget; // Default: 'blank'
    
    private Map<String, Object> subtextStyle; //
    
    private String textAlign; // Default: 'auto'
    
    private String textVerticalAlign; // Default: 'auto'
    
    private String triggerEvent; // Default: false
    
    private Object padding; //number|Array Default: 5
    
    private String itemGap; // Default: 10
    
    private String zlevel; // Default: 0
    
    private String z; // Default: 2
    
    private Object left; //string|number Default: 'auto'
    
    private Object top; //string|number Default: 'auto'
    
    private Object right; //string|number Default: 'auto'
    
    private Object bottom; //string|number Default: 'auto'
    
    private String backgroundColor; // Default: 'transparent'
    
    private String borderColor; // Default: '#ccc'
    
    private String borderWidth; // Default: 0
    
    private Object borderRadius; //number|Array Default: 0
    
    private Integer shadowBlur; //
    
    private String shadowColor; //
    
    private String shadowOffsetX; // Default: 0
    
    private String shadowOffsetY; // Default: 0
    
    


    public Title()
    {
    }

    public Title(Map<String, Object> property)
    {
    }
}