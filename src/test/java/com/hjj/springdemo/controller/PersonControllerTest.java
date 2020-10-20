package com.hjj.springdemo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hjj.springdemo.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

/**
 * @program: SpringBootDemo
 * @description:
 * @author: hjj
 * @create: 2020-10-20 22:04
 **/
//@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PersonControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void should_get_person_correctly() throws Exception {
        Person person = new Person();
        person.setName("SnailClimb");
        person.setSex("Man");
        person.setId("82938390");
        person.setEmail("Snailclimb@qq.com");

        mockMvc.perform(post("/api/person")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(objectMapper.writeValueAsString(person)))
                .andExpect(MockMvcResultMatchers.jsonPath("name").value("SnailClimb"))
                .andExpect(MockMvcResultMatchers.jsonPath("classId").value("82938390"))
                .andExpect(MockMvcResultMatchers.jsonPath("sex").value("Man"))
                .andExpect(MockMvcResultMatchers.jsonPath("email").value("Snailclimb@qq.com"));
    }
}
