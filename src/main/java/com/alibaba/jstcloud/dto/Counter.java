package com.alibaba.jstcloud.dto;

import lombok.Data;

import java.util.Date;

@Data
public class Counter {

    private Long id;

    private Integer count;

    private Date gmtCreated;

    private Date gmtModified;

}
