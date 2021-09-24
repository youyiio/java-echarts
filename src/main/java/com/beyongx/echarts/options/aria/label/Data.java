/**
 * Created by java-echarts library.
 * @author: cattong <aronter@gmail.com>
 */

package com.beyongx.echarts.options.aria.label;

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
public class Data implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String maxCount; // Default: 10
    
    private String allData; // Default: '其数据是——'
    
    private String partialData; // Default: '其中，前{displayCnt}项是——'
    
    private String withName; // Default: '{name}的数据是{value}'
    
    private String withoutName; // Default: '{value}'
    
    private Map<String, Object> separator; //
    
    


    public Data()
    {
    }

    public Data(Map<String, Object> property)
    {
    }
}