package com.intellij.project.firstproject.Controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/dcook/*")
public class dcook extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[]cook=req.getCookies();
        for (Cookie cookie : cook) {
            cookie.setValue("");
            cookie.setPath("/");
            cookie.setMaxAge(0);
            resp.addCookie(cookie);
        }

    }
}
