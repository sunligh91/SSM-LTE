package com.github.sunligh91.service;

import com.github.sunligh91.domain.Product;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
}
