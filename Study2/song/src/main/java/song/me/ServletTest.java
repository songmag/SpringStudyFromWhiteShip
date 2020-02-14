package song.me;


import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;

public class ServletTest extends HttpServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("Init");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("DoGET");
		ApplicationContext context = (ApplicationContext) getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
		UserService service=context.getBean("userService",UserService.class);
		resp.getWriter().write("<html>");
		resp.getWriter().write("<body><h1>TestServlet Do Get :: "+service.getHello()+"! hello</h1>");
		resp.getWriter().write("</body>");
		resp.getWriter().write("</html>");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("DoPost");
		super.doPost(req, resp);
	}
	
}
