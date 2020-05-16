package com.example.demo.design.factory.simple.cash;

/**
 * <p>
 *  返利收费子类，满300减100
 * </p>
 *
 * @author qishisong
 * @since 2020/1/20 10:41 上午
 */
public class CashReturn extends CashSuper {
    private double moneyCondition = 0L;
    private double moneyReturn = 0L;

    public CashReturn(double moneyCondition, double moneyReturn){
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double totalMoney) {
        if(totalMoney > moneyCondition){
            // 伪代码
            return totalMoney - (totalMoney/moneyCondition)*moneyReturn;
        }
        return totalMoney;
    }
}
