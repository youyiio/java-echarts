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
 * 
 * 
 * {_more_}
 */

@lombok.Data
@EqualsAndHashCode(callSuper = false)
public class SaveAsImage implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String type; // Default: 'png'
    
    private String name; //
    
    private String backgroundColor; // Default: 'auto'
    
    private String connectedBackgroundColor; // Default: '#fff'
    
    private Object[] excludeComponents; // Default: '[\'toolbox\']'
    
    private String show; // Default: true
    
    private String title; // Default: '保存为图片'
    
    private String icon; //
    
    private Map<String, Object> iconStyle; //
    
    private Map<String, Object> emphasis; //
    
    private String pixelRatio; // Default: 1
    
    


    public SaveAsImage()
    {
    }

    public SaveAsImage(Map<String, Object> property)
    {
    }
}