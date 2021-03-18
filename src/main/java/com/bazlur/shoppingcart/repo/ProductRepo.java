package com.bazlur.shoppingcart.repo;

import com.bazlur.shoppingcart.dto.ProductDTO;

import java.util.List;

public interface ProductRepo {
    List<ProductDTO> getAllProduct();
}
