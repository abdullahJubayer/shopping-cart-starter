package com.bazlur.shoppingcart.web;

import com.bazlur.shoppingcart.dto.UserDTO;
import com.bazlur.shoppingcart.repo.UserRepoImp;
import com.bazlur.shoppingcart.servie.UserService;
import com.bazlur.shoppingcart.servie.UserServiceImp;
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
    private static final Logger logger= LoggerFactory.getLogger(Signup.class);
    private UserService userService=new UserServiceImp(new UserRepoImp());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("serving signup page");
        req.getRequestDispatcher("WEB-INF/signup.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var user=copyParameter(req);
        if (isUserValid()){
            logger.info("user is valid create a new user with user id :{}",user);
            userService.saveUser(user);
            resp.sendRedirect("home");
        }else {
            logger.info("user send Invalid Data :{}",user);
            req.getRequestDispatcher("WEB-INF/signup.jsp").forward(req,resp);
        }
    }

    private boolean isUserValid() {
        return true;
    }

    private UserDTO copyParameter(HttpServletRequest req) {
        var userDTO=new UserDTO();
        userDTO.setFirstName(req.getParameter("first_name"));
        userDTO.setLastName(req.getParameter("last_name"));
        userDTO.setUserName(req.getParameter("username"));
        userDTO.setEmail(req.getParameter("email"));
        userDTO.setPassword(req.getParameter("password"));
        userDTO.setPasswordConfirmed(req.getParameter("password_confirm"));

        return userDTO;
    }
}