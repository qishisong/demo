package com.example.demo.design.factory.simple.cash;

/**
 * <p>
 * client测试类
 * </p>
 *
 * @author qishisong
 * @since 2020/1/20 10:35 上午
 */
public class CashTest {
    public static void main(String[] args) {
        CashSuper cash = CashFactory.getCash(1);
        System.out.println("acceptCash:"+cash.acceptCash(1000));
    }
}
