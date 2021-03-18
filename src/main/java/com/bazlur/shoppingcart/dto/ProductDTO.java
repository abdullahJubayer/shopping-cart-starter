package com.bazlur.shoppingcart.dto;

public class ProductDTO {
    private String Name;
    private String description;
    private Double price;

    public ProductDTO(String name, String description, Double price) {
        Name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }
}
