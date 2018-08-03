package ru.enigm.skssserver.controllers;

import ru.enigm.skssserver.data.ArticleRepositoryImpl;
import ru.enigm.skssserver.domain.ArticleService;
import ru.enigm.skssserver.domain.ArticleServiceImpl;
import ru.enigm.skssserver.model.Article;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AdminController extends HttpServlet {

    private static final String ARTICLE_TITLE = "title";
    private static final String ARTICLE_CONTENT = "article";
    private static final String ARTICLE_PICTURE_URL = "picture_link";
    private static final String ARTICLE_PUBLISH_DATE = "";

    private ArticleService articleService = new ArticleServiceImpl(new ArticleRepositoryImpl());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        if (req.getHeader(LoginController.USERNAME_PARAMETER).equals("admin")){
            req.getRequestDispatcher("/admin.jsp").forward(req,resp);
        } else {
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        Article article = new Article(
                req.getParameter(ARTICLE_TITLE),
                req.getParameter(ARTICLE_CONTENT),
                req.getParameter(ARTICLE_PICTURE_URL),
                ""
        );
        boolean isSaveSuccess = articleService.saveArticle(article);
        if (isSaveSuccess){
            req.getRequestDispatcher("/success.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("/error.jsp").forward(req, resp);
        }
    }
}
