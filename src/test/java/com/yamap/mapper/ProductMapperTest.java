package com.yamap.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yamap.model.Product;
import com.yamap.mybatisdemo.MybatisDemoApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class ProductMapperTest  extends MybatisDemoApplicationTests {

    @Autowired
    private ProductMapper productMapper;

    @Test
    public void queryTest(){
        List<Product> products = productMapper.selectList(null);
        System.out.println(products);
    }

    @Test
    public void queryPage(){
        Page<Product> productPage = new Page<>(1,2);
        IPage<Product> productIPage = productMapper.selectPage(productPage, null);
        System.out.println(productIPage.getRecords());
    }


    @Test
    public void insertTest(){
        Product product = new Product();
        product.setName("牙膏");
        product.setPrice(3);
        productMapper.insert(product);
        queryTest();
    }
}