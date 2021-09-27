/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.toolbox.feature;

import java.io.Serializable;
import java.util.Map;

//import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p><code class="codespan">brush</code> 是区域选择组件，用户可以选择图中一部分数据，从而便于向用户展示被选中数据，或者他们的一些统计计算结果。</p>
 * <p><br></p>
 * <hr>
 * <p><strong>刷子的类型和启动按钮</strong></p>
 * <p>目前 <code class="codespan">brush</code> 组件支持的图表类型：<code class="codespan">scatter</code>、<code class="codespan">bar</code>、<code class="codespan">candlestick</code>（<code class="codespan">parallel</code> 本身自带刷选功能，但并非由 brush 组件来提供）。</p>
 * <p>点击 <code class="codespan">toolbox</code> 中的按钮，能够进行『区域选择』、『清除选择』等操作。</p>
 * <p><br>
 * <code class="codespan">横向刷子</code> 的示例如下（点击 <code class="codespan">toolbox</code> 中的按钮启动刷选）：</p>
 * <iframe  data-src="https://echarts.apache.org/examples/zh/view.html?c=candlestick-brush&edit=1&reset=1" width="800" height="500"></iframe>
 * 
 * 
 * <p><br>
 * <code class="codespan">bar</code> 图中的 <code class="codespan">brush</code>（点击 <code class="codespan">toolbox</code> 中的按钮启动刷选）：</p>
 * <iframe  data-src="https://echarts.apache.org/examples/zh/view.html?c=bar-brush&edit=1&reset=1" width="800" height="400"></iframe>
 * 
 * 
 * 
 * <p>启动 <code class="codespan">brush</code> 的按钮既可以在 <code class="codespan">toolbox</code> 中指定（参见 <a href="#toolbox.feature.brush.type">toolbox.feature.brush.type</a>），也可以在 <code class="codespan">brush</code> 组件的配置中指定（参见 <a href="#brush.toolbox">brush.toolbox</a>）。</p>
 * <p>支持这几种选框：<code class="codespan">矩形刷子</code>，<code class="codespan">任意形状刷子</code>，<code class="codespan">横向刷子</code>，<code class="codespan">纵向刷子</code>。参见 <a href="#brush.toolbox">brush.toolbox</a>。</p>
 * <p>可以使用 <code class="codespan">保持选择</code> 按钮，切换单选和多选模式。</p>
 * <ul>
 * <li>单选即同时只能存在一个选框，可单击空白区域消除选框。</li>
 * <li>多选即同时可存在多个选框，单击空白区域不能消除选框，需要点击『清除按钮』消除线框。</li>
 * </ul>
 * <p><br></p>
 * <hr>
 * <p><strong>刷选和坐标系的关系</strong></p>
 * <p>可以设置 <code class="codespan">brush</code> 是『全局的』还是『属于坐标系的』。</p>
 * <p><strong>全局 brush</strong></p>
 * <p>在 echarts 实例中任意地方刷选。这是默认情况。如果没有指定为『坐标系 brush』，就是『全局 brush』。</p>
 * <p><strong>坐标系 brush</strong></p>
 * <p>在 指定的坐标系中刷选。选框可以跟随坐标系的缩放和平移（roam 和 dataZoom）而移动。</p>
 * <p>坐标系 brush 实际更为常用，尤其是在 geo 中。</p>
 * <p>通过指定 <a href="#brush.geoIndex">brush.geoIndex</a> 或 <a href="#brush.xAxisIndex">brush.xAxisIndex</a> 或 <a href="#brush.yAxisIndex">brush.yAxisIndex</a> 来规定可以在哪些坐标系中进行刷选。</p>
 * <p>这几个配置项的取值可以是：</p>
 * <ul>
 * <li><code class="codespan">&#39;all&#39;</code>，表示所有</li>
 * <li><code class="codespan">number</code>，如 <code class="codespan">0</code>，表示这个 index 所对应的坐标系。</li>
 * <li><code class="codespan">Array</code>，如 <code class="codespan">[0, 4, 2]</code>，表示指定这些 index 所对应的坐标系。</li>
 * <li><code class="codespan">&#39;none&#39;</code> 或 <code class="codespan">null</code> 或 <code class="codespan">undefined</code>，表示不指定。</li>
 * </ul>
 * <p>例如：</p>
 * <pre><code class="lang-javascript">option = {
 *     geo: {
 *         ...
 *     },
 *     brush: {
 *         geoIndex: &#39;all&#39;, // 只可以在所有 geo 坐标系中刷选，也就是上面定义的 geo 组件中。
 *         ...
 *     }
 * };
 * </code></pre>
 * <p>例如：</p>
 * <pre><code class="lang-javascript">option = {
 *     grid: [
 *         {...}, // grid 0
 *         {...}  // grid 1
 *     ],
 *     xAxis: [
 *         {gridIndex: 1, ...}, // xAxis 0，属于 grid 1。
 *         {gridIndex: 0, ...}  // xAxis 1，属于 grid 0。
 *     ],
 *     yAxis: [
 *         {gridIndex: 1, ...}, // yAxis 0，属于 grid 1。
 *         {gridIndex: 0, ...}  // yAxis 1，属于 grid 0。
 *     ],
 *     brush: {
 *         xAxisIndex: [0, 1], // 只可以在 xAxisIndex 为 `0` 和 `1` 的 xAxis 所在的直角坐标系中刷选。
 *         ...
 *     }
 * };
 * </code></pre>
 * <p><br></p>
 * <hr>
 * <p><strong> 使用 API 控制选框 </strong></p>
 * <p>可以通过调用 <code class="codespan">dispatchAction</code> 来用程序主动渲染选框，例如：</p>
 * <pre><code class="lang-javascript">myChart.dispatchAction({
 *     type: &#39;brush&#39;,
 *     areas: [
 *         {
 *             geoIndex: 0,
 *             // 指定选框的类型。
 *             brushType: &#39;polygon&#39;,
 *             // 指定选框的形状。
 *             coordRange: [[119.72,34.85],[119.68,34.85],[119.5,34.84],[119.19,34.77]]
 *         }
 *     ]
 * });
 * </code></pre>
 * <p>详情参见 <a href="api.html#action.brush" target="_blank">action.brush</a></p>
 * <p><br></p>
 * <hr>
 * <p><strong> brushLink </strong></p>
 * <p>不同系列间，选中的项可以联动。</p>
 * <p>参见如下效果（刷选一个 <code class="codespan">scatter</code>，其他 <code class="codespan">scatter</code> 以及 <code class="codespan">parallel</code> 图都会有选中效果）：</p>
 * <iframe  data-src="https://echarts.apache.org/examples/zh/view.html?c=scatter-matrix&edit=1&reset=1" width="800" height="550"></iframe>
 * 
 * 
 * <p><code class="codespan">brushLink</code> 配置项是一个数组，内容是 seriesIndex，指定了哪些 series 可以被联动。例如可以是：</p>
 * <ul>
 * <li><code class="codespan">[3, 4, 5]</code> 表示 seriesIndex 为 <code class="codespan">3</code>, <code class="codespan">4</code>, <code class="codespan">5</code> 的 series 可以被联动。</li>
 * <li><code class="codespan">&#39;all&#39;</code> 表示所有 series 都进行 brushLink。</li>
 * <li><code class="codespan">&#39;none&#39;</code> 或 <code class="codespan">null</code> 或 <code class="codespan">undefined</code> 表示不启用 brushLink 功能。</li>
 * </ul>
 * <p><strong>注意</strong></p>
 * <p>brushLink 是通过 dataIndex 进行映射，所以需要保证，<strong>联动的每个系列的 <code class="codespan">data</code> 都是 <code class="codespan">index</code> 对应的</strong>。*</p>
 * <p>例如：</p>
 * <pre><code class="lang-javascript">option = {
 *     brush: {
 *         brushLink: [0, 1]
 *     },
 *     series: [
 *         {
 *             type: &#39;bar&#39;
 *             data: [232,    4434,    545,      654]     // data 有四个项
 *         },
 *         {
 *             type: &#39;parallel&#39;,
 *             data: [[4, 5], [3, 5], [66, 33], [99, 66]] // data 同样有四个项，两个系列的 data 是对应的。
 *         }
 *     ]
 * };
 * </code></pre>
 * <p>参见 <a href="#brush.brushLink">brush.brushLink</a>。</p>
 * <p><br></p>
 * <hr>
 * <p><strong> throttle / debounce / 事件延迟 </strong></p>
 * <p>默认情况，刷选或者移动选区的时候，会不断得发 <code class="codespan">brushSelected</code> 事件，从而告诉外界选中的内容。</p>
 * <p>但是频繁的事件可能导致性能问题，或者动画效果很差。所以 brush 组件提供了 <a href="#brush.throttleType">brush.throttleType</a>，<a href="#brush.throttleDelay">brush.throttleDelay</a> 来解决这个问题。</p>
 * <p>throttleType 取值可以是：</p>
 * <ul>
 * <li><code class="codespan">&#39;debounce&#39;</code>：表示只有停止动作了（即一段时间没有操作了），才会触发事件。时间阈值由 <a href="#brush.throttleDelay">brush.throttleDelay</a> 指定。</li>
 * <li><code class="codespan">&#39;fixRate&#39;</code>：表示按照一定的频率触发事件，时间间隔由 <a href="#brush.throttleDelay">brush.throttleDelay</a> 指定。</li>
 * </ul>
 * <p><br></p>
 * <hr>
 * <p><strong> 被选中项和未被选中项的视觉设置 </strong></p>
 * <p>参见 <a href="#brush.inBrush">brush.inBrush</a> 和 <a href="#brush.outOfBrush">brush.outOfBrush</a>。</p>
 * <p><br></p>
 * <hr>
 * <p>下面是详细配置。</p>
 * 
 * {_more_}
 */

@lombok.Data
@EqualsAndHashCode(callSuper = false)
public class Brush implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private Object[] type; //
    
    private Map<String, Object> icon; //
    
    private Map<String, Object> title; //
    
    


    public Brush()
    {
    }

    public Brush(Map<String, Object> property)
    {
    }
}