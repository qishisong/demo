package com.example.demo.excel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.formula.functions.T;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author qishisong
 * @since 2020/5/15 15:24
 */
@Slf4j
public class DataParseListener<T> extends AnalysisEventListener<T> {

    List<T> result = new ArrayList<T>();

    @Override
    public void invoke(T t, AnalysisContext analysisContext) {
        if(t instanceof OverseaSpuExcelDomain){

        }
        result.add(t);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        log.info("数据解析完成，size={}",result.size());
    }

    public List getResult() {
        return result;
    }
}
