package com.trofimenko;

import com.sun.net.httpserver.HttpServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/http/*")
public class FirstHttpServlet extends HttpServlet {

    private Logger logger = LoggerFactory.getLogger(FirstHttpServlet.class);


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");

        resp.getWriter().println("<h1>HTTP SERVLET</h1>");
        resp.getWriter().println("<p>ContextPath   :" + req.getContextPath() + "</p>");
        resp.getWriter().println("<p>ServletPath   :" + req.getServletPath() + "</p>");
        resp.getWriter().println("<p>PathInfo   :" + req.getPathInfo() + "</p>");
        resp.getWriter().println("<p>QueryString   :" + req.getQueryString() + "</p>");


    }
}
