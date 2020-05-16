package com.example.demo.design.strategy.cash;

/**
 * <p>
 * client
 * </p>
 *
 * @author qishisong
 * @since 2020/1/20 11:16 上午
 */
public class CashStrategyTest {
    public static void main(String[] args) {
        CashContext cashContext = new CashContext(1);
        System.out.println("acceptMoney:"+cashContext.acceptMoney(1000));
    }
}
