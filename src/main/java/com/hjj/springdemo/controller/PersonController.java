package com.hjj.springdemo.controller;

import com.hjj.springdemo.exception.ResourceNotFoundException;
import com.hjj.springdemo.pojo.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;
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
public class PersonController {
//    @GetMapping("/resourceNotFound")
//    public void throwException() {
//        Person p=new Person("82938390","SnailClimb","male","123");
//        Map<String,Object> map = new HashMap<>();
//        map.put("person id:", p.getId());
//        throw new ResourceNotFoundException(map);
//    }

    @PostMapping("/person")
    public ResponseEntity<Person> getPerson(@RequestBody @Valid Person person) {
        return ResponseEntity.ok().body(person);
    }

    @GetMapping("/person/{id}")
    public ResponseEntity<Integer> getPersonByID(@Valid @PathVariable("id") @Max(value = 5,message = "超过 id 的范围了") Integer id) {
        return ResponseEntity.ok().body(id);
    }

//    @PutMapping("/person")
//    public ResponseEntity<String> getPersonByName(@Valid @RequestParam("name") @Size(max = 6,message = "超过 name 的范围了") String name) {
//        return ResponseEntity.ok().body(name);
//    }
}

