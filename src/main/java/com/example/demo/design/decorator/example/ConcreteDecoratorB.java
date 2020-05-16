package com.example.demo.design.decorator.example;

/**
 * <p>
 * 具体抽象实现类B
 * </p>
 *
 * @author qishisong
 * @since 2020/1/28 12:43 下午
 */
public class ConcreteDecoratorB extends Decorator{

    @Override
    public void operation() {
        super.operation();
        addBehavior();
        System.out.println("具体装饰对象B的操作");
    }


    private void addBehavior(){
        System.out.println("本类独有的装饰方法B");
    }

}
