package com.github.sunligh91.dao;

import com.github.sunligh91.domain.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface IProductDao {
    @Select("select * from product")
    List<Product> findAll();
}
