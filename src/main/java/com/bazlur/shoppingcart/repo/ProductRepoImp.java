package com.bazlur.shoppingcart.repo;

import com.bazlur.shoppingcart.dto.ProductDTO;

import java.util.List;

public class ProductRepoImp implements ProductRepo {


    @Override
    public List<ProductDTO> getAllProduct() {
        return List.of(
                new ProductDTO("MI A3","White Color",21000.00),
                new ProductDTO("Iphone 8X","Black Color",81000.00)
        );
    }
}
