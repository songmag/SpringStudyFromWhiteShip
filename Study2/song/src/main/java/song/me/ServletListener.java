package song.me;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * WebListener 라고 등록하면 web.xml에 작성하지 않아도 WebListener로 등록되는 것은. Servlet 3.0 부터 지원된다.
 * Contain 순서는 web.xml이 우선인 것 같다.
 * @author songm
 *
 */
//@WebListener
public class ServletListener implements ServletContextListener{

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("ServletContext InIt");
		sce.getServletContext().setAttribute("name", "Song");
	}
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("ServletContext Destory");
	}
}
