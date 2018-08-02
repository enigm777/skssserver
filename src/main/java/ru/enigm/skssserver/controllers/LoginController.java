package ru.enigm.skssserver.controllers;

import ru.enigm.skssserver.data.UserRepositoryImpl;
import ru.enigm.skssserver.domain.UserService;
import ru.enigm.skssserver.domain.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginController extends HttpServlet {

    public static final String USERNAME_PARAMETER = "username";
    private static final String PASSWORD_PARAMETER = "password";

    private UserService userService = new UserServiceImpl(new UserRepositoryImpl());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter(USERNAME_PARAMETER);
        String password = req.getParameter(PASSWORD_PARAMETER);

        if (userService.checkPasswordAndLogin(username, password)){
            resp.addHeader(USERNAME_PARAMETER, username);
            resp.setContentType("text/html; charset=UTF-8");
            resp.setCharacterEncoding("UTF-8");
            req.getRequestDispatcher("/admin.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("/error.jsp").forward(req, resp);
        }
        super.doPost(req, resp);
    }
}
