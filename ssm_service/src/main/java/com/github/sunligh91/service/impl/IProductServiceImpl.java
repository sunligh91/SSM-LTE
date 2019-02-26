package com.github.sunligh91.service.impl;

import com.github.sunligh91.dao.IProductDao;
import com.github.sunligh91.domain.Product;
import com.github.sunligh91.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class IProductServiceImpl implements IProductService{
    @Autowired
    private IProductDao iProductDao;
    @Override
    public List<Product> findAll() {
        return iProductDao.findAll();
    }
}
