package song.me.assignment;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * WebListener ��� ����ϸ� web.xml�� �ۼ����� �ʾƵ� WebListener�� ��ϵǴ� ����. Servlet 3.0 ���� �����ȴ�.
 * Contain ������ web.xml�� �켱�� �� ����.
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
