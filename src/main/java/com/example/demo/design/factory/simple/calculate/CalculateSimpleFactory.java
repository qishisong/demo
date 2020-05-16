package com.example.demo.design.factory.simple.calculate;

/**
 * <p>
 * 简单工厂类
 * 将类型判断和操作逻辑隔离起来，更好的实现单一原则以及开闭原则
 * </p>
 *
 * @author qishisong
 * @since 2020/1/19 6:23 下午
 */
public class CalculateSimpleFactory {
    public static Calculate getCalculate(String operation){
        switch (operation){
            case "+": return new CalculateAdd();
            case "-": return new CalculateSub();
            default: return null;
        }
    }
}
