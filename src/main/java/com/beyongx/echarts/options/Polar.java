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
 * <p>极坐标系，可以用于散点图和折线图。每个极坐标系拥有一个<a href="#angleAxis">角度轴</a>和一个<a href="#radiusAxis">半径轴</a>。</p>
 * <p><strong>示例：</strong></p>
 * <iframe  data-src="https://echarts.apache.org/examples/zh/view.html?c=scatter-polar-punchCard&edit=1&reset=1" width="600" height="400"></iframe>
 * 
 * {_more_}
 */

@lombok.Data
@EqualsAndHashCode(callSuper = false)
public class Polar implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String id; //
    
    private String zlevel; // Default: 0
    
    private String z; // Default: 2
    
    private Map<String, Object> center; // Default: '[\'50%\', \'50%\']'
    
    private Object radius; //number|string|Array
    
    private Map<String, Object> tooltip; //
    
    


    public Polar()
    {
    }

    public Polar(Map<String, Object> property)
    {
    }
}