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
 * <p><code class="codespan">graphic</code> 是原生图形元素组件。可以支持的图形元素包括：</p>
 * <p><a href="#graphic.elements-image">image</a>,
 * <a href="#graphic.elements-text">text</a>,
 * <a href="#graphic.elements-circle">circle</a>,
 * <a href="#graphic.elements-sector">sector</a>,
 * <a href="#graphic.elements-ring">ring</a>,
 * <a href="#graphic.elements-polygon">polygon</a>,
 * <a href="#graphic.elements-polyline">polyline</a>,
 * <a href="#graphic.elements-rect">rect</a>,
 * <a href="#graphic.elements-line">line</a>,
 * <a href="#graphic.elements-bezierCurve">bezierCurve</a>,
 * <a href="#graphic.elements-arc">arc</a>,
 * <a href="#graphic.elements-group">group</a>,</p>
 * <p>下面示例中，使用图形元素做了水印，和文本块：</p>
 * <iframe  data-src="https://echarts.apache.org/examples/zh/view.html?c=line-graphic&edit=1&reset=1" width="600" height="400"></iframe>
 * 
 * 
 * <p>下面示例中，使用隐藏的图形元素实现了拖拽：</p>
 * <iframe  data-src="https://echarts.apache.org/examples/zh/view.html?c=line-draggable&edit=1&reset=1" width="600" height="400"></iframe>
 * 
 * 
 * 
 * 
 * <p><br></p>
 * <hr>
 * <p><strong>graphic 设置介绍</strong></p>
 * <p>只配一个图形元素时的简写方法：</p>
 * <pre><code class="lang-javascript">myChart.setOption({
 *     ...,
 *     graphic: {
 *         type: &#39;image&#39;,
 *         ...
 *     }
 * });
 * </code></pre>
 * <p>配多个图形元素：</p>
 * <pre><code class="lang-javascript">myChart.setOption({
 *     ...,
 *     graphic: [
 *         { // 一个图形元素，类型是 image。
 *             type: &#39;image&#39;,
 *             ...
 *         },
 *         { // 一个图形元素，类型是 text，指定了 id。
 *             type: &#39;text&#39;,
 *             id: &#39;text1&#39;,
 *             ...
 *         },
 *         { // 一个图形元素，类型是 group，可以嵌套子节点。
 *             type: &#39;group&#39;,
 *             children: [
 *                 {
 *                     type: &#39;rect&#39;,
 *                     id: &#39;rect1&#39;,
 *                     ...
 *                 },
 *                 {
 *                     type: &#39;image&#39;,
 *                     ...
 *                 },
 *                 ...
 *             ]
 *         }
 *         ...
 *     ]
 * });
 * 
 * </code></pre>
 * <p>使用 setOption 来删除或更换（替代）已有的图形元素：</p>
 * <pre><code class="lang-javascript">myChart.setOption({
 *     ...,
 *     graphic: [
 *         { // 删除上例中定义的 &#39;text1&#39; 元素。
 *             id: &#39;text1&#39;,
 *             $action: &#39;remove&#39;,
 *             ...
 *         },
 *         { // 将上例中定义的 &#39;rect1&#39; 元素换成 circle。
 *           // 注意尽管 &#39;rect1&#39; 在一个 group 中，但这里并不需要顾忌层级，用id指定就可以了。
 *             id: &#39;rect1&#39;,
 *             $action: &#39;replace&#39;,
 *             type: &#39;circle&#39;,
 *             ...
 *         }
 *     ]
 * });
 * </code></pre>
 * <p>注意，如果没有指定 id，第二次 setOption 时会按照元素在 option 中出现的顺序和已有的图形元素进行匹配。这有时会产生不易理解的效果。
 * 所以，一般来说，更新 elements 时推荐使用 id 进行准确的指定，而非省略 id。</p>
 * <p><br></p>
 * <hr>
 * <p><strong>图形元素设置介绍</strong></p>
 * <p>介绍每个图形元素的配置。不同类型的图形元素的设置有这些共性：</p>
 * <pre><code class="lang-javascript">{
 *     // id 用于在更新图形元素时指定更新哪个图形元素，如果不需要用可以忽略。
 *     id: &#39;xxx&#39;,
 * 
 *     // 这个字段在第一次设置时不能忽略，取值见上方『支持的图形元素』。
 *     type: &#39;image&#39;,
 * 
 *     // 下面的各个属性如果不需要设置都可以忽略，忽略则取默认值。
 * 
 *     // 指定本次 setOption 对此图形元素进行的操作。默认是 &#39;merge&#39;，还可以 &#39;replace&#39; 或 &#39;remove&#39;。
 *     $action: &#39;replace&#39;,
 * 
 *     // 这是四个相对于父元素的定位属性，每个属性可取『像素值』或者『百分比』或者 &#39;center&#39;/&#39;middle&#39;。
 *     left: 10,
 *     // right: 10,
 *     top: &#39;center&#39;,
 *     // bottom: &#39;10%&#39;,
 * 
 *     shape: {
 *         // 定位、形状相关的设置，如 x, y, cx, cy, width, height, r, points 等。
 *         // 注意，如果设置了 left/right/top/bottom，这里的定位用的 x/y/cx/cy 会失效。
 *     },
 * 
 *     style: {
 *         // 样式相关的设置，如 fill, stroke, lineWidth, shadowBlur 等。
 *     },
 * 
 *     // 表示 z 高度，从而指定了图形元素的覆盖关系。
 *     z: 10,
 *     // 表示不响应事件。
 *     silent: true,
 *     // 表示节点不显示
 *     invisible: false,
 *     // 设置是否整体限制在父节点范围内。可选值：&#39;raw&#39;, &#39;all&#39;。
 *     bouding: &#39;raw&#39;,
 *     // 是否可以被拖拽。
 *     draggable: false,
 *     // 事件的监听器，还可以是 onmousemove, ondrag 等。支持的事件参见下。
 *     onclick: function () {...}
 * }
 * </code></pre>
 * <p><br></p>
 * <hr>
 * <p><strong>图形元素的事件</strong></p>
 * <p>支持这些事件配置：
 * <code class="codespan">onclick</code>, <code class="codespan">onmouseover</code>, <code class="codespan">onmouseout</code>, <code class="codespan">onmousemove</code>, <code class="codespan">onmousewheel</code>, <code class="codespan">onmousedown</code>, <code class="codespan">onmouseup</code>, <code class="codespan">ondrag</code>, <code class="codespan">ondragstart</code>, <code class="codespan">ondragend</code>, <code class="codespan">ondragenter</code>, <code class="codespan">ondragleave</code>, <code class="codespan">ondragover</code>, <code class="codespan">ondrop</code>。</p>
 * <p><br></p>
 * <hr>
 * <p><strong>图形元素的层级关系</strong></p>
 * <p>只有 <code class="codespan">group</code> 元素可以有子节点，从而以该 <code class="codespan">group</code> 元素为根的元素树可以共同定位（共同移动）。</p>
 * <p><br></p>
 * <hr>
 * <p><strong>图形元素的基本形状设置</strong></p>
 * <p>每个图形元素本身有自己的图形基本的位置和尺寸设置，例如：</p>
 * <pre><code class="lang-javascript">{
 *     type: &#39;rect&#39;,
 *     shape: {
 *         x: 10,
 *         y: 10,
 *         width: 100,
 *         height: 200
 *     }
 * },
 * {
 *     type: &#39;circle&#39;,
 *     shape: {
 *         cx: 20,
 *         cy: 30,
 *         r: 100
 *     }
 * },
 * {
 *     type: &#39;image&#39;,
 *     style: {
 *         image: &#39;http://xxx.xxx.xxx/a.png&#39;,
 *         x: 100,
 *         y: 200,
 *         width: 230,
 *         height: 400
 *     }
 * },
 * {
 *     type: &#39;text&#39;,
 *     style: {
 *         text: &#39;This text&#39;,
 *         x: 100,
 *         y: 200
 *     }
 * 
 * }
 * </code></pre>
 * <p><br></p>
 * <hr>
 * <p><strong>图形元素的定位和 transfrom</strong></p>
 * <p>除此以外，可以以 transform 的方式对图形进行平移、旋转、缩放，
 * 参见：<a href="#graphic.elements.position">position</a>、<a href="#graphic.elements.rotation">rotation</a>、<a href="#graphic.elements.scale">scale</a>、<a href="#graphic.elements.origin">origin</a>。</p>
 * <pre><code class="lang-javascript">{
 *     type: &#39;rect&#39;,
 *     position: [100, 200], // 平移，默认值为 [0, 0]。
 *     scale: [2, 4], // 缩放，默认值为 [1, 1]。表示缩放的倍数。
 *     rotation: Math.PI / 4, // 旋转，默认值为 0。表示旋转的弧度值。正值表示逆时针旋转。
 *     origin: [10, 20], // 旋转和缩放的中心点，默认值为 [0, 0]。
 *     shape: {
 *         // ...
 *     }
 * }
 * </code></pre>
 * <ul>
 * <li>每个图形元素在父节点的坐标系中进行 transform，也就是说父子节点的 transform 能『叠加』。</li>
 * <li>每个图形元素进行 transform 顺序是：<ol>
 * <li>平移 [-el.origin[0], -el.origin[1]]。</li>
 * <li>根据 el.scale 缩放。</li>
 * <li>根据 el.rotation 旋转。</li>
 * <li>根据 el.origin 平移。</li>
 * <li>根据 el.position 平移。</li>
 * </ol>
 * </li>
 * <li>也就是说先缩放旋转后平移，这样平移不会影响缩放旋转的 origin。</li>
 * </ul>
 * <p><br></p>
 * <hr>
 * <p><strong>图形元素相对定位</strong></p>
 * <p>以上两者是基本的绝对定位，除此之外，在实际应用中，容器尺寸常常是不确定甚至动态变化的，所以需要提供相对定位的机制。graphic 组件使用 <a href="#graphic.elements.left">left</a> / <a href="#graphic.elements.right">right</a> / <a href="#graphic.elements.top">top</a> / <a href="#graphic.elements.bottom">bottom</a> / <a href="#graphic.elements.width">width</a> / <a href="#graphic.elements.height">height</a> 提供了相对定位的机制。</p>
 * <p>例如：</p>
 * <pre><code class="lang-javascript">{ // 将图片定位到最下方的中间：
 *     type: &#39;image&#39;,
 *     left: &#39;center&#39;, // 水平定位到中间
 *     bottom: &#39;10%&#39;,  // 定位到距离下边界 10% 处
 *     style: {
 *         image: &#39;http://xxx.xxx.xxx/a.png&#39;,
 *         width: 45,
 *         height: 45
 *     }
 * },
 * { // 将旋转过的 group 整体定位右下角：
 *     type: &#39;group&#39;,
 *     right: 0,  // 定位到右下角
 *     bottom: 0, // 定位到右下角
 *     rotation: Math.PI / 4,
 *     children: [
 *         {
 *             type: &#39;rect&#39;,
 *             left: &#39;center&#39;, // 相对父元素居中
 *             top: &#39;middle&#39;,  // 相对父元素居中
 *             shape: {
 *                 width: 190,
 *                 height: 90
 *             },
 *             style: {
 *                 fill: &#39;#fff&#39;,
 *                 stroke: &#39;#999&#39;,
 *                 lineWidth: 2,
 *                 shadowBlur: 8,
 *                 shadowOffsetX: 3,
 *                 shadowOffsetY: 3,
 *                 shadowColor: &#39;rgba(0,0,0,0.3)&#39;
 *             }
 *         },
 *         {
 *             type: &#39;text&#39;,
 *             left: &#39;center&#39;, // 相对父元素居中
 *             top: &#39;middle&#39;,  // 相对父元素居中
 *             style: {
 *                 fill: &#39;#777&#39;,
 *                 text: [
 *                     &#39;This is text&#39;,
 *                     &#39;这是一段文字&#39;,
 *                     &#39;Print some text&#39;
 *                 ].join(&#39;\n&#39;),
 *                 font: &#39;14px Microsoft YaHei&#39;
 *             }
 *         }
 *     ]
 * }
 * </code></pre>
 * <p>注意，可以用 <a href="graphic.elements.bounding" target="_blank">bounding</a> 来设置是否整体限制在父节点范围内。</p>
 * 
 * {_more_}
 */

@lombok.Data
@EqualsAndHashCode(callSuper = false)
public class Graphic implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private com.beyongx.echarts.options.graphic.Elements[] elements; //
    
    


    public Graphic()
    {
    }

    public Graphic(Map<String, Object> property)
    {
    }
}