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
 * <p>ECharts 4 开始支持了 <code class="codespan">数据集</code>（<code class="codespan">dataset</code>）组件用于单独的数据集声明，从而数据可以单独管理，被多个组件复用，并且可以自由指定数据到视觉的映射。这在不少场景下能带来使用上的方便。</p>
 * <p>关于 <code class="codespan">dataset</code> 的详情，请参见<a href="https://echarts.apache.org/handbook/zh/concepts/dataset" target="_blank">教程</a>。</p>
 * 
 * {_more_}
 */

@lombok.Data
@EqualsAndHashCode(callSuper = false)
public class Dataset implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private Object source; //Array|Object
    
    private Object[] dimensions; //
    
    private String sourceHeader; //
    
    private com.beyongx.echarts.options.dataset.Transform[] transform; //
    
    private Integer fromDatasetIndex; //
    
    private String fromDatasetId; //
    
    private Integer fromTransformResult; //
    
    


    public Dataset()
    {
    }

    public Dataset(Map<String, Object> property)
    {
    }
}