package com.youcode.gameyou.DTO;

import com.youcode.gameyou.Entity.Product;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class StoreDTO {
    private Long id;
    private String name;
    private String description;
    private String imagePath;
    private Integer stars;
    private Boolean isActive;
    private Date createdAt = new Date();
    private Date updatedAt = new Date();
    private List<Product> products = new ArrayList<>();
}