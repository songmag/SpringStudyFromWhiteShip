package me.song;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class ServletListener implements ServletContextListener{

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("ServletContext InIt");
		sce.getServletContext().setAttribute("name", "Song");
		
	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("ServletContext Destory");
	}

}
