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
 * <p>日历坐标系组件。</p>
 * <p>在ECharts中，我们非常有创意地实现了日历图，是通过使用日历坐标系组件来达到日历图效果的，如下方的几个示例图所示，我们可以在热力图、散点图、关系图中使用日历坐标系。</p>
 * <p>在日历坐标系中使用热力图的示例:</p>
 * <iframe  data-src="https://echarts.apache.org/examples/zh/view.html?c=calendar-heatmap&edit=1&reset=1" width="800" height="400"></iframe>
 * 
 * 
 * <p>在日历坐标系中使用散点图的示例:</p>
 * <iframe  data-src="https://echarts.apache.org/examples/zh/view.html?c=calendar-effectscatter&edit=1&reset=1" width="800" height="600"></iframe>
 * 
 * 
 * <p>在日历坐标系中使用关系图（以及混合图表）的示例:</p>
 * <iframe  data-src="https://echarts.apache.org/examples/zh/view.html?c=calendar-graph&edit=1&reset=1" width="600" height="600"></iframe>
 * 
 * 
 * <p>灵活利用 echarts 图表和坐标系的组合，以及 API，可以实现更丰富的效果。
 * <a href="https://echarts.apache.org/examples/zh/editor.html?c=calendar-lunar&amp;edit=1&amp;reset=1" target="_blank">在日历中使用文字</a>、
 * <a href="https://echarts.apache.org/examples/zh/editor.html?c=calendar-pie&amp;edit=1&amp;reset=1" target="_blank">在日历中放置饼图</a></p>
 * <hr>
 * <p><strong>水平和垂直放置日历</strong></p>
 * <p>在日历坐标系可以水平放置，也可以垂直放置。如上面的例子，使用热力图时，经常是水平放置的。但是如果需要格子的尺寸大些，水平放置就过于宽了，于是也可以选择垂直放置。参见 <a href="#calendar.orient">calendar.orient</a>。</p>
 * <hr>
 * <p><strong>尺寸的自适应</strong></p>
 * <p>可以设置日历坐标系使他支持不同尺寸的容器（页面）大小变化的自适应。首先，和 echarts 其他组件一样，日历坐标系可以选择使用 <a href="#calendar.left">left</a> <a href="#calendar.right">right</a> <a href="#calendar.top">top</a> <a href="bottom" target="_blank">bottom</a> <a href="#calendar.width">width</a> <a href="#calendar.height">height</a> 来描述尺寸和位置，从而将日历摆放在上下左右各种位置，并随着页面尺寸变动而改变自身尺寸。另外，也可以使用 <a href="#calendar.cellSize">cellSize</a> 来固定日历格子的长宽。</p>
 * <hr>
 * <p><strong>中西方日历习惯的支持</strong></p>
 * <p>中西方日历有所差别，西方常使用星期日作为一周的第一天，中国使用星期一为一周的第一天。日历坐标系做了这种切换的支持。参见 <a href="#calendar.dayLabel.firstDay">calendar.dayLabel.firstDay</a>。</p>
 * <p>另外，日历上的『月份』和『星期几』的文字，也可以较方便的切换中英文，甚至自定义。参见 <a href="#calendar.dayLabel.nameMap">calendar.dayLabel.nameMap</a> <a href="#calendar.monthLabel.nameMap">calendar.monthLabel.nameMap</a>。</p>
 * <hr>
 * 
 * {_more_}
 */

@lombok.Data
@EqualsAndHashCode(callSuper = false)
public class Calendar implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private String zlevel; // Default: 0
    
    private String z; // Default: 2
    
    private Object left; //string|number Default: 80
    
    private Object top; //string|number Default: 60
    
    private Object right; //string|number Default: 'auto'
    
    private Object bottom; //string|number Default: 'auto'
    
    private Object width; //number|string Default: 'auto'
    
    private Object height; //number|string Default: 'auto'
    
    private Object range; //number|string|Array
    
    private Object cellSize; //number|Array Default: 20
    
    private String orient; // Default: 'horizontal'
    
    private Map<String, Object> splitLine; //
    
    private Map<String, Object> itemStyle; //
    
    private Map<String, Object> dayLabel; //
    
    private Map<String, Object> monthLabel; //
    
    private Map<String, Object> yearLabel; //
    
    private String silent; // Default: false
    
    


    public Calendar()
    {
    }

    public Calendar(Map<String, Object> property)
    {
    }
}