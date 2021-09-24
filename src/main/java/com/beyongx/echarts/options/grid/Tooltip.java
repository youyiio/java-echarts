/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.grid;

import java.io.Serializable;
import java.util.Map;

//import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>提示框组件。</p>
 * <hr>
 * <p><strong>提示框组件的通用介绍：</strong></p>
 * <p>提示框组件可以设置在多种地方：</p>
 * <ul>
 * <li><p>可以设置在全局，即 <a href="#tooltip">tooltip</a></p>
 * </li>
 * <li><p>可以设置在坐标系中，即 <a href="#grid.tooltip">grid.tooltip</a>、<a href="#polar.tooltip">polar.tooltip</a>、<a href="#single.tooltip">single.tooltip</a></p>
 * </li>
 * <li><p>可以设置在系列中，即 <a href="#series.tooltip">series.tooltip</a></p>
 * </li>
 * <li><p>可以设置在系列的每个数据项中，即 <a href="#series.data.tooltip">series.data.tooltip</a></p>
 * </li>
 * </ul>
 * <hr>
 * 
 * {_more_}
 */

@lombok.Data
@EqualsAndHashCode(callSuper = false)
public class Tooltip implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String show; // Default: true
    
    private String trigger; // Default: 'item'
    
    private Map<String, Object> axisPointer; //
    
    private Object position; //string|Array|Function
    
    private Object formatter; //string|Function
    
    private String backgroundColor; // Default: 'rgba(50,50,50,0.7)'
    
    private String borderColor; // Default: '#333'
    
    private String borderWidth; // Default: 0
    
    private String padding; // Default: 5
    
    private Map<String, Object> textStyle; //
    
    private String extraCssText; //
    
    


    public Tooltip()
    {
    }

    public Tooltip(Map<String, Object> property)
    {
    }
}