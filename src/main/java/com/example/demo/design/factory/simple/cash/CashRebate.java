package com.example.demo.design.factory.simple.cash;

/**
 * <p>
 *  打折结算，9折，8折...
 * </p>
 *
 * @author qishisong
 * @since 2020/1/20 10:39 上午
 */
public class CashRebate extends CashSuper {
    private double rebate = 1L;

    /**
     * 构造函数必须传入打折参数
     * @param rebate
     */
    public CashRebate(double rebate){
        this.rebate = rebate;
    }

    @Override
    public double acceptCash(double totalMoney) {
        return totalMoney * rebate;
    }
}
