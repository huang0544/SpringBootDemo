package com.hjj.springdemo.dto;

import lombok.Data;

import java.util.List;

/**
 * @program: springdemo
 * @description:
 * @author: hjj
 * @create: 2020-10-22 18:27
 **/

@Data
public class PageResponseDto<T> {

    private Integer size;
    private Integer page;
    private Long total;
    private List<T> result;
}
