package com.example.demo.design.decorator.finery;

/**
 * <p>
 * 客户端测试类
 * </p>
 *
 * @author qishisong
 * @since 2020/1/28 1:15 下午
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person("小王");
        TShirts tShirts = new TShirts();
        Jeans jeans = new Jeans();

        tShirts.decorator(person);
        jeans.decorator(tShirts);
        jeans.show();
    }
}
