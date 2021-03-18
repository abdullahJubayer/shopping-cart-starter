package com.bazlur.shoppingcart.servie;

import com.bazlur.shoppingcart.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    List<ProductDTO> findAllSortedProduct();
}
