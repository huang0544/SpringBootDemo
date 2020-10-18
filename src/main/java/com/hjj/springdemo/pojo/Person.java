package com.hjj.springdemo.pojo;

import lombok.Data;

/**
 * @program: SpringBootDemo
 * @description:
 * @author: hjj
 * @create: 2020-10-18 21:03
 **/
@Data
public class Person {
    private Long id;
    private String name;

    public Person(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
