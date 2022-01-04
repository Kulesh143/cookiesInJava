package com.intellij.project.firstproject.Controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/servletOne/*")
public class servletOne extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user=req.getParameter("user");
        String pass=req.getParameter("pass");
        if(user.equals("Kulesh")&&pass.equals("123")){

//            req.getRequestDispatcher("/WEB-INF/display.jsp").forward(req, resp);
            resp.getWriter().write("You have successfully logged in "+user+" your password is "+pass);

        }
        else{
            resp.getWriter().write("Incorrect Credentials");
           // req.getRequestDispatcher("/WEB-INF/display.jsp").forward(req, resp);
        }
    }
}
