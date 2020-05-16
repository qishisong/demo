package com.example.demo.design.decorator.finery;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * <p>
 *
 * </p>
 *
 * @author qishisong
 * @since 2020/1/28 12:59 下午
 */
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;

    public void show(){
        System.out.println(name+"装扮的"+":");
    }
}
