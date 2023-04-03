package com.alibaba.jstcloud.dao;

import com.alibaba.jstcloud.dto.Counter;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CounterMapper {

    Counter selectFirst();

    Counter selectById(@Param("id") Integer id);

    void insert(Counter counter);

    void update(Counter counter);

    void deleteById(@Param("id") Integer id);
}
