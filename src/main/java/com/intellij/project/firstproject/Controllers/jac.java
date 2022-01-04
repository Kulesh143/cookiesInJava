package com.intellij.project.firstproject.Controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/jac/*")
public class jac extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[]cookies=req.getCookies();
        for(Cookie cookie:cookies){
            cookie.setValue("");
            cookie.setPath("/");
            cookie.setMaxAge(0);
            resp.addCookie(cookie);
        }
    }
}
