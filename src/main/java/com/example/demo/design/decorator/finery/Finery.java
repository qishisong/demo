package com.example.demo.design.decorator.finery;

/**
 * <p>
 * 服饰类
 * </p>
 *
 * @author qishisong
 * @since 2020/1/28 1:02 下午
 */
public class Finery extends Person {

    private Person person;

    public void decorator(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        if(person != null){
            person.show();
        }
    }
}
