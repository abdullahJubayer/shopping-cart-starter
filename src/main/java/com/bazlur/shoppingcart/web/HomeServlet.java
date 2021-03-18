package com.bazlur.shoppingcart.web;

import com.bazlur.shoppingcart.dto.ProductDTO;
import com.bazlur.shoppingcart.repo.ProductRepoImp;
import com.bazlur.shoppingcart.servie.ProductService;
import com.bazlur.shoppingcart.servie.ProductServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "HomeServlet",urlPatterns = "/home")
public class HomeServlet extends HttpServlet {
    private ProductService productService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        productService= new ProductServiceImp(new ProductRepoImp());

        List<ProductDTO> productDTOList=productService.findAllSortedProduct();
        req.setAttribute("products",productDTOList);
        req.getRequestDispatcher("WEB-INF/productList.jsp").forward(req,resp);
    }
}
