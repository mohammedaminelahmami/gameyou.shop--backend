package com.youcode.gameyou.DTO;

import com.youcode.gameyou.Entity.Product;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
public class ImageDTO {
    private Long id;
    private String path;
    private String ext;
    private Date createdAt = new Date();
    private Date updatedAt = new Date();
    private Product product;
}