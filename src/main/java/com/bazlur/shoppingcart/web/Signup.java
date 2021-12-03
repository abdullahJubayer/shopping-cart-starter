package com.bazlur.shoppingcart.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Signup",urlPatterns = "/signup")
public class Signup extends HttpServlet {
    private static final Logger logger= LoggerFactory.getLogger(LoginServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("serving signup page");
        req.getRequestDispatcher("WEB-INF/signup.jsp").forward(req,resp);
    }
}