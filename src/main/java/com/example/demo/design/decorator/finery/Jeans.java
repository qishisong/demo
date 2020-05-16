package com.example.demo.design.decorator.finery;

/**
 * <p>
 * 具体服饰类 牛仔裤
 * </p>
 *
 * @author qishisong
 * @since 2020/1/28 1:14 下午
 */
public class Jeans extends Finery {
    @Override
    public void show() {
        super.show();
        System.out.println("牛仔裤");
    }
}
