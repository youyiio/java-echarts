package com.beyongx.echarts;

@lombok.Data
public abstract class Chart {
    //图表类型
    protected String type;

    // //图表名称
    // protected String name;
    // //抽样形式
    // protected String sampling;

    //图表数据
    protected Object[] data;
    
    public void data(Object...data ) {
        this.data = data;
    }
}