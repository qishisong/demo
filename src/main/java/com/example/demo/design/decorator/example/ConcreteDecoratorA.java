package com.example.demo.design.decorator.example;

/**
 * <p>
 * 具体抽象实现类A
 * </p>
 *
 * @author qishisong
 * @since 2020/1/28 12:43 下午
 */
public class ConcreteDecoratorA extends Decorator{

    private String addedState;

    @Override
    public void operation() {
        super.operation();
        this.addedState = "new state";
        System.out.println("具体装饰对象A的操作");
    }
}
