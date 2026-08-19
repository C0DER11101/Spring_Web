package com.jsp.web.config;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ServletConfig implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(AppConfig.class);

        DispatcherServlet dispatcherServlet = new DispatcherServlet(context);

        servletContext.addServlet("dispatcherServlet", dispatcherServlet);

        ServletRegistration.Dynamic dynamic = servletContext.addServlet("dipatcherServlet", dispatcherServlet);

        dynamic.addMapping("/");
        dynamic.setLoadOnStartup(1);
    }

}