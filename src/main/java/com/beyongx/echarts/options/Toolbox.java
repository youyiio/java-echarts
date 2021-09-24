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
 * <p>工具栏。内置有<a href="#toolbox.feature.saveAsImage">导出图片</a>，<a href="#toolbox.feature.dataView">数据视图</a>，<a href="#toolbox.feature.magicType">动态类型切换</a>，<a href="#toolbox.feature.dataZoom">数据区域缩放</a>，<a href="#toolbox.feature.reset">重置</a>五个工具。</p>
 * <p><strong>如下示例：</strong></p>
 * <iframe  data-src="https://echarts.apache.org/examples/zh/view.html?c=line-marker&reset=1&edit=1" width="600" height="400"></iframe>
 * 
 * {_more_}
 */

@lombok.Data
@EqualsAndHashCode(callSuper = false)
public class Toolbox implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private String show; // Default: true
    
    private String orient; // Default: 'horizontal'
    
    private String itemSize; // Default: 15
    
    private String itemGap; // Default: 10
    
    private String showTitle; // Default: true
    
    private Map<String, Object> feature; //
    
    private Map<String, Object> iconStyle; //
    
    private Map<String, Object> emphasis; //
    
    private String zlevel; // Default: 0
    
    private String z; // Default: 2
    
    private Object left; //string|number Default: 'auto'
    
    private Object top; //string|number Default: 'auto'
    
    private Object right; //string|number Default: 'auto'
    
    private Object bottom; //string|number Default: 'auto'
    
    private Object width; //string|number Default: 'auto'
    
    private Object height; //string|number Default: 'auto'
    
    private Map<String, Object> tooltip; //
    
    


    public Toolbox()
    {
    }

    public Toolbox(Map<String, Object> property)
    {
    }
}