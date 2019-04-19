package com.yamap.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yamap.Service.ProductService;
import com.yamap.model.Product;
import com.yamap.utils.ResultVOUtil;
import com.yamap.utils.VO.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
@Api(value = "商品的接口")
public class ProductController {


    @Autowired
    private ProductService productService;

    @GetMapping("/page")
    @ApiOperation(value ="商品分页",notes ="",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page",value = "第几页",required = false,paramType = "query" ,dataType = "Integer"),
            @ApiImplicitParam(name = "size",value = "每页查询数",required = false,paramType = "query" ,dataType = "Integer"),
    })
    public ResultVO<IPage<Product>> page(@RequestParam (value = "page",defaultValue = "1",required = false)  Integer pageNo,
                                         @RequestParam (value = "size",defaultValue = "10",required = false)  Integer size){
        IPage<Product> page = productService.page(pageNo, size);
        return ResultVOUtil.success(page);
    }


    @PostMapping("/add")
    public ResultVO add(@RequestBody Product product){
        productService.add(product);
        return ResultVOUtil.success("添加成功");
    }

    @DeleteMapping("/delete/{id}")
    public ResultVO delete(@PathVariable("id") Integer id){
        productService.delete(id);
        return ResultVOUtil.success("删除成功");
    }

    @GetMapping("/get/{id}")
    public ResultVO<Product> getDto(@PathVariable("id") Integer id ){
        Product product = productService.getDto(id);
        return ResultVOUtil.success(product);

    }
}
