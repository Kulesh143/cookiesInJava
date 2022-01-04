package com.intellij.project.firstproject.Controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/hoo/*")
public class hoo extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie1=new Cookie("kool",req.getParameter("user"));
        Cookie cookie2=new Cookie("pass",req.getParameter("pass"));
        cookie1.setMaxAge(60*60*24);
        cookie2.setMaxAge(60*60*24);
        resp.addCookie(cookie1);
        resp.addCookie(cookie2);
        Cookie[]cook=req.getCookies();
        if(cook!=null){
            for (int i=0;i<cook.length;i++){
                Cookie coo=cook[i];
                resp.getWriter().write("Cookie Name: "+coo.getName().toString());
                resp.getWriter().write(" Cookie Value: "+coo.getValue().toString());
//                resp.getWriter().write("Cookie Path: "+coo.getPath().toString());
//                resp.getWriter().write("Cookie Version: "+coo.getVersion());
            }
        }
    }
}
