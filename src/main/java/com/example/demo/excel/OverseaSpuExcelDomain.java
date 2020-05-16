package com.example.demo.excel;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.converters.date.DateNumberConverter;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class OverseaSpuExcelDomain implements Serializable {

    private static final long serialVersionUID = -5499479897178399162L;

    @ExcelIgnore
    private Long spuId;

    @ExcelProperty(value = "货号", index = 0)
    private String articleNumber;

    @ExcelProperty(value = "标题", index = 1)
    private String title;

    @ExcelProperty(value = "售价", index = 2)
    private Long authPrice;

    @ExcelProperty(value = "销售日期", index = 3)
    private String sellDateFormat;

    @ExcelProperty(value = "配色", index = 4)
    private String colorWay;

    @ExcelProperty(value = "描述", index = 5)
    private String description;

    @ExcelProperty(value = "失败原因")
    private String errorMsg;
}
