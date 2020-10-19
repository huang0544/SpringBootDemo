package com.hjj.springdemo.controller;

import com.hjj.springdemo.exception.ResourceNotFoundException;
import com.hjj.springdemo.pojo.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
        Person p=new Person(1L,"SnailClimb","male","123");
        Map<String,Object> map = new HashMap<>();
        map.put("person id:", p.getId());
        throw new ResourceNotFoundException(map);
    }

    @PostMapping("/person")
    public ResponseEntity<Person> getPerson(@RequestBody @Valid Person person) {
        Person p=new Person(1L,"SnailClimb","male","123");
        return ResponseEntity.ok().body(person);
    }
}

