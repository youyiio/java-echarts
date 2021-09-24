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
 * <p>W3C 制定了无障碍富互联网应用规范集（<a href="https://www.w3.org/WAI/intro/aria" target="_blank">WAI-ARIA</a>，the Accessible Rich Internet Applications Suite），致力于使得网页内容和网页应用能够被更多残障人士访问。Apache ECharts 4 遵从这一规范，支持自动根据图表配置项智能生成描述，使得盲人可以在朗读设备的帮助下了解图表内容，让图表可以被更多人群访问。除此之外，Apache ECharts 5 新增支持贴花纹理，作为颜色的辅助表达，进一步用以区分数据。</p>
 * <p>默认关闭，需要通过将 <a href="#aria.enabled">aria.enabled</a> 设置为 <code class="codespan">true</code> 开启。</p>
 * 
 * {_more_}
 */

@lombok.Data
@EqualsAndHashCode(callSuper = false)
public class Aria implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String enabled; // Default: false
    
    private Map<String, Object> label; //
    
    private Map<String, Object> decal; //
    
    


    public Aria()
    {
    }

    public Aria(Map<String, Object> property)
    {
    }
}