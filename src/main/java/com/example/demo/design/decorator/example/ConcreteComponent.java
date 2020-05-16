package com.example.demo.design.decorator.example;

/**
 * <p>
 * 一个具体对象，可以为这个对象添加一些职责
 * </p>
 *
 * @author qishisong
 * @since 2020/1/28 12:37 下午
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("具体对象的核心实现");
    }
}
