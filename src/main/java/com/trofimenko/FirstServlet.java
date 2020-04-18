package com.trofimenko;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;
import java.io.Serializable;

public class FirstServlet implements Servlet, Serializable {

    private Logger logger = LoggerFactory.getLogger(FirstServlet.class);

    private transient ServletConfig config;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = config;
        logger.info("!!!Servlet start!!!");

    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        logger.info("!!!New request!!!");
        servletResponse.getWriter().println("Little step...");
    }

    @Override
    public String getServletInfo() {
        return "hello everyone!";
    }

    @Override
    public void destroy() {
        logger.info("Servlet destroy");
    }
}
