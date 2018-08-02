package ru.enigm.skssserver.controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AdminController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        if (req.getHeader(LoginController.USERNAME_PARAMETER).equals("admin")){
            req.getRequestDispatcher("/admin.jsp").forward(req,resp);
        } else {
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
    }
}
