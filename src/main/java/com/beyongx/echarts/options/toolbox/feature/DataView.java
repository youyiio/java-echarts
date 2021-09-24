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
public class DataView implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String show; // Default: true
    
    private String title; // Default: '数据视图'
    
    private String icon; //
    
    private Map<String, Object> iconStyle; //
    
    private Map<String, Object> emphasis; //
    
    private String readOnly; // Default: false
    
    private String optionToContent; //
    
    private String contentToOption; //
    
    private Map<String, Object> lang; // Default: '[\'数据视图\', \'关闭\', \'刷新\']'
    
    private String backgroundColor; // Default: '#fff'
    
    private String textareaColor; // Default: '#fff'
    
    private String textareaBorderColor; // Default: '#333'
    
    private String textColor; // Default: '#000'
    
    private String buttonColor; // Default: '#c23531'
    
    private String buttonTextColor; // Default: '#fff'
    
    


    public DataView()
    {
    }

    public DataView(Map<String, Object> property)
    {
    }
}