package com.trofimenko.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "HeaderFooter", urlPatterns = "/*")
public class HttpFilter implements Filter {
    private FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletResponse.setCharacterEncoding("UTF-8");
        servletResponse.setContentType("text/html");

        servletResponse.getWriter().println("<h1>HEADER</h1>");

        filterChain.doFilter(servletRequest,servletResponse);

        servletResponse.getWriter().println("<h1>FOOTER</h1>");
    }

    @Override
    public void destroy() {
    }
}
