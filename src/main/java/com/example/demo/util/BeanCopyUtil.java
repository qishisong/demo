package com.example.demo.util;

import com.lessismore.xauto.copy.CopierFactory;
import com.lessismore.xauto.copy.CopierInterface;

import java.util.Collections;
import java.util.List;

public class BeanCopyUtil {
    public static <T> T copyProperties(Object source, Class<T> targetClass) {
        if (source == null) return null;
        try {
            CopierInterface copier = CopierFactory.getCopier(source.getClass(), targetClass);
            T t = (T) copier.copy(source);
            return t;
        } catch (Exception e) {
            throw new RuntimeException(String.format("Create new instance of %s failed: %s", targetClass, e.getMessage()));
        }
    }

    public static <T> List<T> copyPropertiesOfList(List<?> sourceList, Class<T> targetClass) {
        if (sourceList == null || sourceList.size() == 0) {
            return Collections.emptyList();
        }
        try {
            CopierInterface copier = CopierFactory.getCopier(sourceList.get(0).getClass(), targetClass);
            List<T> resultList = copier.copy(sourceList);
            return resultList;
        } catch (Exception e) {
            throw new RuntimeException(String.format("Create new instance of %s failed: %s", targetClass, e.getMessage()));
        }
    }
}
