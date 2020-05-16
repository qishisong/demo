package com.example.demo.design.factory.simple.calculate;

import lombok.Data;

/**
 * <p>
 *  计算抽象类
 * </p>
 *
 * @author qishisong
 * @since 2020/1/19 5:36 下午
 */
@Data
public abstract class Calculate {
    private int numA;
    private int numB;

    /**
     * 获取计算结果
     */
    public abstract Number getResult(int numA, int numB);
}

