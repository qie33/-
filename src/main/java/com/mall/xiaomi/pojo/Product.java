package com.mall.xiaomi.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "product")
public class Product implements Serializable {
    private static final long serialVersionID = 42L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "JDBC")
    private Integer productId;

    private String productName;

    private Integer categoryId;

    private String productTitle;

    private String productPicture;

    private Double productPrice;

    private Double productSellingPrice;

    private Integer productNum;

    private Integer productSales;

    private String productIntro;

}