package com.dyb.demo.dao;

import com.dyb.demo.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CategoryDao {

    @Select("select * from category ")
    List<Category> findAll();

    @Select("select * from category where id = #{id}")
    Category selectByPrimaryKey(@Param("id") Integer id);
}
