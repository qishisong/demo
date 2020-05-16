package com.example.demo.design.factory.simple.cash;

/**
 * <p>
 * 正常结算
 * </p>
 *
 * @author qishisong
 * @since 2020/1/20 10:38 上午
 */
public class CashNormal extends CashSuper {

    @Override
    public double acceptCash(double totalMoney) {
        return totalMoney;
    }
}
