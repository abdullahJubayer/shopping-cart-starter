package com.bazlur.shoppingcart.web;

import com.bazlur.shoppingcart.dto.ProductDTO;
import com.bazlur.shoppingcart.repo.ProductRepoImp;
import com.bazlur.shoppingcart.servie.ProductService;
import com.bazlur.shoppingcart.servie.ProductServiceImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private static final Logger logger= LoggerFactory.getLogger(HomeServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        productService= new ProductServiceImp(new ProductRepoImp());

        List<ProductDTO> productDTOList=productService.findAllSortedProduct();
        req.setAttribute("products",productDTOList);
        req.getRequestDispatcher("WEB-INF/home.jsp").forward(req,resp);

        for(int i=0;i<50;i++){
            logger.info("Product Size :{}",productDTOList.size());
        }
    }
}
