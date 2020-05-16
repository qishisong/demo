package com.example.demo.design.decorator.example;

/**
 * <p>
 * 客户端
 * </p>
 *
 * @author qishisong
 * @since 2020/1/28 12:49 下午
 */
public class DecoratorTest {
    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();

        d1.setComponent(c);
        d2.setComponent(d1);
        d2.operation();

    }
}
