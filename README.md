# java-echarts

**一款支持Apache EChart5.0+图表的Java开发库** 支持Spring MVC\SpringBoot的集成开发及测试。

Apache EChart5.0已经最新发布，在视觉效果、动画效果和大数据展示方面已经远超之前的版本；
故不考虑EChart5.0之前版本的兼容问题；建议直接尝试5.0+

[github地址](https://github.com/youyiio/php-echarts)

## 特性

* 简洁的 API 设计，与echarts.js前端高度一致，支持链式调用；
* 囊括了 30+ 种常见图表及3D图标，提供图片\pdf格式快速导出；
* 可轻松集成至 Spring MVC，SpringBoot 等主流 Web 框架;
* 高度灵活的配置项，可轻松搭配出精美的图表;
* 详细的文档和示例，帮助开发者更快的上手项目;
* ECharts5.0+完美支持，可以流畅的运行在 PC 和移动设备上，兼容当前绝大部分浏览器；
* ECharts5.0+能够展现千万级的数据量，支持原生百度地图，为地理数据可视化提供强有力的支持；


## 目录 
* [第一个EChart5.0 demo](#第一个EChart5.0 demo) 
* [安装](#安装) 
    * [使用 Composer 安装 (强烈推荐)](#使用-composer-安装-强烈推荐)
    * [github下载 或 直接手动下载源码](#github下载-或-直接手动下载源码)
        * [下载文件](#下载文件)
        * [引入自动载入文件](#引入自动载入文件)


## 第一个EChart5.0 demo

**第一个EChart5.0 示例**
```
import com.beyongx.echarts.charts.Line;
import com.beyongx.echarts.options.Title;
import com.beyongx.echarts.options.XAxis;
import com.beyongx.echarts.options.YAxis;

ECharts echarts = ECharts.init("#myChart");

Option option = new Option();
Title title = new Title();
title.setText("ECharts 5.0 入门示例");
title.setLeft("center");
option.title(title);

XAxis xAxis = new XAxis();
xAxis.setData(new String[]{"衬衫", "羊毛衫", "雪纺衫", "裤子", "高跟鞋", "袜子"}); //["衬衫", "羊毛衫", "雪纺衫", "裤子", "高跟鞋", "袜子"]
option.xAxis(xAxis);
option.yAxis(new YAxis());

Line chart = new Line();
chart.data(5, 20, 36, 10, 10, 20);
chart.setSmooth(true);

option.addSeries(chart);

echarts.option(option);

String content = echarts.render();
System.out.println(content);
```



## 安装
### Maven项目 安装:

```
<dependency>
    <groupId>com.beyongx</groupId>
    <artifactId>java-echarts</artifactId>
    <version>0.1.0</version>
</dependency>
```

### gradle项目 安装:

```
implementation 'com.beyongx:java-echarts:0.1.0'
```



## 示例 - Line
```
ECharts echarts = ECharts.init("#myChart");

Option option = new Option();
Title title = new Title();
title.setText("ECharts 5.0 入门示例");
title.setLeft("center");
option.title(title);

XAxis xAxis = new XAxis();
xAxis.setData(new String[]{"衬衫", "羊毛衫", "雪纺衫", "裤子", "高跟鞋", "袜子"}); //["衬衫", "羊毛衫", "雪纺衫", "裤子", "高跟鞋", "袜子"]
option.xAxis(xAxis);
option.yAxis(new YAxis());

Line chart = new Line();
chart.data(5, 20, 36, 10, 10, 20);
chart.setSmooth(true);

option.addSeries(chart);

echarts.option(option);

String content = echarts.render();
System.out.println(content);
```

## 示例 - Bar
```
ECharts echarts = ECharts.init("#myChart");

Option option = new Option();
Title title = new Title();
title.setText("ECharts 5.0 入门示例");
title.setLeft("center");
option.title(title);

XAxis xAxis = new XAxis();
xAxis.setData(new String[]{"衬衫", "羊毛衫", "雪纺衫", "裤子", "高跟鞋", "袜子"}); //["衬衫", "羊毛衫", "雪纺衫", "裤子", "高跟鞋", "袜子"]
option.xAxis(xAxis);
option.yAxis(new YAxis());

Bar chart = new Bar();
chart.data(5, 20, 36, 10, 10, 20);

option.addSeries(chart);

echarts.option(option);

String content = echarts.render();
System.out.println(content);
```



## Issues
如果有遇到问题请提交 [issues](https://github.com/youyiio/java-echarts/issues)


## License
Apache 2.0
