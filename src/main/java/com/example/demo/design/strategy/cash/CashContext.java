package com.example.demo.design.strategy.cash;

import com.example.demo.design.factory.simple.cash.CashNormal;
import com.example.demo.design.factory.simple.cash.CashRebate;
import com.example.demo.design.factory.simple.cash.CashReturn;
import com.example.demo.design.factory.simple.cash.CashSuper;

/**
 * <p>
 * 结算上下文
 * </p>
 *
 * @author qishisong
 * @since 2020/1/20 11:10 上午
 */
public class CashContext {
    private CashSuper cs;
    /**结合简单工厂模式，将switch从client移到上下文中，但是这种使用起来不够优美*/
    public CashContext(int type){
        switch (type){
            // 正常结算
            case 1: cs = new CashNormal();
            // 9折
            case 2: cs = new CashRebate(0.9);
            // 满300减100
            case 3: cs = new CashReturn(300,100);
        }
    }

    public double acceptMoney(double totalMoney){
        return cs.acceptCash(totalMoney);
    }
}
