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
 * <p><code class="codespan">timeline</code> 组件，提供了在多个 ECharts <code class="codespan">option</code> 间进行切换、播放等操作的功能。</p>
 * <p>示例效果如下：</p>
 * <iframe  data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/mix-timeline-all&edit=1&reset=1" width="600" height="400"></iframe>
 * 
 * 
 * <p><code class="codespan">timeline</code> 和其他场景有些不同，它需要操作『多个option』。我们把传入 <code class="codespan">setOption</code> 第一个参数的东西，称为 <code class="codespan">ECOption</code>，然后称传统的 ECharts 单个 option 为 <code class="codespan">ECUnitOption</code>。</p>
 * <ul>
 * <li>当 <code class="codespan">timeline</code> 和 <code class="codespan">media query</code> 没有被设置时，一个 <code class="codespan">ECUnitOption</code> 就是一个 <code class="codespan">ECOption</code>。</li>
 * <li>当 <code class="codespan">timeline</code> 或 <code class="codespan">media query</code> 被使用设置时，一个 <code class="codespan">ECOption</code> 由几个 <code class="codespan">ECUnitOption</code> 组成。<ul>
 * <li><code class="codespan">ECOption</code> 的各个根属性，形成一个 <code class="codespan">ECUnitOption</code>，叫做 <code class="codespan">baseOption</code>，它代表了各种默认设置。</li>
 * <li><code class="codespan">options</code> 数组每项，形成一个 <code class="codespan">ECUnitOption</code>，我们为了方便也叫做 <code class="codespan">switchableOption</code>，它代表了每个时间粒度对应的 option。</li>
 * </ul>
 * </li>
 * <li><code class="codespan">baseOption</code> 和一个 <code class="codespan">switchableOption</code> 会用来计算最终的 <code class="codespan">finalOption</code>，图表就是根据这个最终结果绘制的。</li>
 * </ul>
 * <p>例如：</p>
 * <pre><code class="lang-javascript">// 如下，baseOption 是一个 『原子option』，options 数组
 * // 中的每一项也是一个 『原子option』。
 * // 每个『原子option』中就是本文档中描述的各种配置项。
 * myChart.setOption({
 *     // `baseOption` 的属性.
 *     timeline: {
 *         ...,
 *         // `timeline.data` 中的每一项，对应于 `options`
 *         // 数组中的每个 `option`
 *         data: [&#39;2002-01-01&#39;, &#39;2003-01-01&#39;, &#39;2004-01-01&#39;]
 *     },
 *     grid: { ... },
 *     xAxis: [ ... ],
 *     yAxis: [ ... ],
 *     series: [{
 *         // 系列一的一些其他配置
 *         type: &#39;bar&#39;,
 *         ...
 *     }, {
 *         // 系列二的一些其他配置
 *         type: &#39;line&#39;,
 *         ...
 *     }, {
 *         // 系列三的一些其他配置
 *         type: &#39;pie&#39;,
 *         ...
 *     }],
 *     // `switchableOption`s:
 *     options: [{
 *         // 这是&#39;2002-01-01&#39; 对应的 option
 *         title: {
 *             text: &#39;2002年统计值&#39;
 *         },
 *         series: [
 *             { data: [] }, // 系列一的数据
 *             { data: [] }, // 系列二的数据
 *             { data: [] }  // 系列三的数据
 *         ]
 *     }, {
 *         // 这是&#39;2003-01-01&#39; 对应的 option
 *         title: {
 *             text: &#39;2003年统计值&#39;
 *         },
 *         series: [
 *             { data: [] },
 *             { data: [] },
 *             { data: [] }
 *         ]
 *     }, {
 *         // 这是&#39;2004-01-01&#39; 对应的 option
 *         title: {
 *             text: &#39;2004年统计值&#39;
 *         },
 *         series: [
 *             { data: [] },
 *             { data: [] },
 *             { data: [] }
 *         ]
 *     }]
 * });
 * </code></pre>
 * <p><br>
 * <strong><code class="codespan">finalOption</code> 是怎么计算出来的?</strong></p>
 * <p>初始化的时候，对应于当前时间的那个 <code class="codespan">switchableOption</code> 会被合并（merge）到 <code class="codespan">baseOption</code>，形成 <code class="codespan">finalOption</code>。而每当时间变化时，对应于新时间的 <code class="codespan">switchableOption</code> 会被合并（merge）到<code class="codespan">finalOption</code>。</p>
 * <p>有两种合并（merge）策略：</p>
 * <ul>
 * <li>默认使用 <code class="codespan">NORMAL_MERGE</code>。</li>
 * <li>如果 <a href="#option.html#timeline.replaceMerge">timeline.replaceMerge</a> 被指定了，则使用 <code class="codespan">REPLACE_MERGE</code>。如果要知道 <code class="codespan">REPLACE_MERGE</code> 更多信息，可以参见 <a href="#api.html#echartsInstance.setOption">setOption</a> 中 <code class="codespan">REPLACE_MERGE</code> 一节。
 * 。</li>
 * </ul>
 * <p><br>
 * <strong>兼容 ECharts4</strong></p>
 * <p>如下这种设置方式，也支持：</p>
 * <pre><code class="lang-js">option = {
 *     baseOption: {
 *         timeline: {},
 *         series: [],
 *         // ... other properties of baseOption.
 *     },
 *     options: []
 * };
 * </code></pre>
 * 
 * {_more_}
 */

@lombok.Data
@EqualsAndHashCode(callSuper = false)
public class Timeline implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String show; // Default: true
    
    private String type; // Default: 'slider'
    
    private String axisType; // Default: 'time'
    
    private String currentIndex; // Default: 0
    
    private String autoPlay; // Default: false
    
    private String rewind; // Default: false
    
    private String loop; // Default: true
    
    private String playInterval; // Default: 2000
    
    private String realtime; // Default: true
    
    private Object replaceMerge; //Array|string Default: 'undefined'
    
    private String controlPosition; // Default: 'left'
    
    private String zlevel; // Default: 0
    
    private String z; // Default: 2
    
    private Object left; //string|number Default: 'auto'
    
    private Object top; //string|number Default: 'auto'
    
    private Object right; //string|number Default: 'auto'
    
    private Object bottom; //string|number Default: 'auto'
    
    private Object padding; //number|Array Default: 5
    
    private String orient; // Default: 'horizontal'
    
    private String inverse; // Default: false
    
    private String symbol; // Default: 'emptyCircle'
    
    private Object symbolSize; //number|Array Default: 10
    
    private Integer symbolRotate; //
    
    private String symbolKeepAspect; // Default: false
    
    private Object[] symbolOffset; // Default: '[0, 0]'
    
    private Map<String, Object> lineStyle; //
    
    private Map<String, Object> label; //
    
    private Map<String, Object> itemStyle; //
    
    private Map<String, Object> checkpointStyle; //
    
    private Map<String, Object> controlStyle; //
    
    private Map<String, Object> progress; //
    
    private Map<String, Object> emphasis; //
    
    private Object[] data; //
    
    


    public Timeline()
    {
    }

    public Timeline(Map<String, Object> property)
    {
    }
}