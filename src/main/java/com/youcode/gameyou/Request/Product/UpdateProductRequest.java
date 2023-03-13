package com.youcode.gameyou.Request.Product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class UpdateProductRequest {
    private String id;
    private String name;
    private String quantity;
    private String title;
    private String description;
    private double price;
}
