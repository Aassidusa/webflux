package com.example.demo.domain;

import lombok.Data;

/**
 * @ClassName City
 * @Description TODO
 * @Author Administrator
 * @Date 2018/10/29 15:58
 * Version 1.0
 **/
@Data
public class City {
    private Long id;
    private Long provinceId;
    private String cityName;
    private String description;
}
