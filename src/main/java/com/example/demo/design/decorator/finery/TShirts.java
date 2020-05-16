package com.example.demo.design.decorator.finery;

/**
 * <p>
 * 具体服饰类
 * </p>
 *
 * @author qishisong
 * @since 2020/1/28 1:12 下午
 */
public class TShirts extends Finery {
    @Override
    public void show() {
        super.show();
        System.out.println("大T恤");
    }
}
