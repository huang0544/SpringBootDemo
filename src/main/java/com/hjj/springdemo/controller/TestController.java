package com.hjj.springdemo.controller;

import com.hjj.springdemo.exception.ResourceNotFoundException;
import com.hjj.springdemo.pojo.Person;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: SpringBootDemo
 * @description:
 * @author: hjj
 * @create: 2020-10-17 21:32
 **/
@RestController
@RequestMapping("/api")
public class TestController {
    @GetMapping("/resourceNotFound")
    public void throwException() {
        Person p=new Person(1L,"SnailClimb");
        Map<String,Object> map = new HashMap<>();
        map.put("person id:", p.getId());
        throw new ResourceNotFoundException(map);
    }
}

