package com.example.demo.design.factory.simple.calculate;

/**
 * <p>
 *
 * </p>
 *
 * @author qishisong
 * @since 2020/1/19 6:26 下午
 */
public class CalculateTest {
    public static void main(String[] args) {
        int numA = 1;
        int numB = 2;
        Calculate calculate = CalculateSimpleFactory.getCalculate("+");
        System.out.println("numA+numB="+calculate.getResult(numA,numB));
    }
}
