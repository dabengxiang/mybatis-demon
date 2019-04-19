package com.yamap.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Product  {


    private String id;

    private String name;

    private Integer price;

    /** 库存. */
    private Integer stock;

    /** 描述. */
    private String description;

    /** 类目编号. */
    private String categoryType;


}

