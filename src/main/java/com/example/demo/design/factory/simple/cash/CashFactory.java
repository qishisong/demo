package com.example.demo.design.factory.simple.cash;

/**
 * <p>
 * 结算工厂类
 *
 * 商家可能会经常变动打折方式和活动，每次都要重新维护工厂类，
 * 并且客户端需要引用CashSuper类和CashFactory两个类，没有充分解耦
 * </p>
 *
 * @author qishisong
 * @since 2020/1/20 10:49 上午
 */
public class CashFactory {
    public static CashSuper getCash(int type){
        switch (type){
            // 正常结算
            case 1: return new CashNormal();
            // 9折
            case 2: return new CashRebate(0.9);
            // 满300减100
            case 3: return new CashReturn(300,100);
        }
        return null;
    }
}
