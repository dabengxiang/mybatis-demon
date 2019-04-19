package com.yamap.Service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yamap.mapper.ProductMapper;
import com.yamap.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: gyc
 * @Date: 2019/4/19 9:57
 */
@Service
public class ProductService {

    @Autowired
    private ProductMapper productMapper;


    public IPage<Product> page(Integer pageNo, Integer size) {
        Page<Product> page = new Page<>(pageNo, size);
        return productMapper.selectPage(page,null);

    }

    public void add(Product product) {
        if(product.getId()!= null){
            productMapper.updateById(product);
        }else{
            productMapper.insert(product);
        }
    }

    public void delete(Integer id) {
        productMapper.deleteById(id);
    }

    public Product getDto(Integer id) {
        return productMapper.selectById(id);
    }
}
