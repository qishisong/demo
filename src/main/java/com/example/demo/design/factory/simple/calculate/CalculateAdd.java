package com.example.demo.design.factory.simple.calculate;

/**
 * <p>
 * 具体实现类
 * </p>
 *
 * @author qishisong
 * @since 2020/1/19 6:20 下午
 */
public class CalculateAdd extends Calculate {
    @Override
    public Number getResult(int numA, int numB) {
        return numA+numB;
    }
}
