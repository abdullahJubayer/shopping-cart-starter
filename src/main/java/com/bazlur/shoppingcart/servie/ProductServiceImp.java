package com.bazlur.shoppingcart.servie;

import com.bazlur.shoppingcart.dto.ProductDTO;
import com.bazlur.shoppingcart.repo.ProductRepo;
import com.bazlur.shoppingcart.repo.ProductRepoImp;
import com.bazlur.shoppingcart.servie.ProductService;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductServiceImp implements ProductService {
    private ProductRepo repo;
    public ProductServiceImp(ProductRepo repo){
        this.repo=repo;
    }

    @Override
    public List<ProductDTO> findAllSortedProduct() {
        return repo.getAllProduct()
                .stream()
                .sorted(Comparator.comparing(ProductDTO::getName))
                .collect(Collectors.toList());
    }
}
