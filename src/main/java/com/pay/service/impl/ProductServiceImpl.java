package com.pay.service.impl;

import com.pay.entity.Product;
import com.pay.mapper.ProductMapper;
import com.pay.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
