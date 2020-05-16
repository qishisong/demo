package com.example.demo.design.decorator.example;

/**
 * <p>
 *  装饰抽象类，继承自Component,从外类扩展Component的功能
 * </p>
 *
 * @author qishisong
 * @since 2020/1/28 12:38 下午
 */
public class Decorator implements Component{
    private Component component;

    public void setComponent(Component component){
        this.component = component;
    }

    @Override
    public void operation() {
        if(component != null){
            component.operation();
        }
    }
}
