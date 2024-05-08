package com.sky.krkr.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface DemoDao {

    Long query(Long id);

}
