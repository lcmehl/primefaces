package br.com.javafullstack.init;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
 
@EnableWebMvc
@Configuration
@ComponentScan
public class Initializer implements WebApplicationInitializer {
     
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
         
    	AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
    	context.register(WebAppConfig.class);
    	servletContext.addListener(new ContextLoaderListener(context));
         
    }
 
}