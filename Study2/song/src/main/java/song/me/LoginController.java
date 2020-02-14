package song.me;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/" , method = RequestMethod.GET)
	@ResponseBody
	public String getLoginPage()
	{
		return userService.getHello();
	}
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	@ResponseBody
	public String getHello()
	{
		return "Hello";
	}
	
	@RequestMapping(value="/indexPage")
	public String getRequest()
	{
		return "test";
	}
	@RequestMapping(value= {"/hi","/testURI"} , method= {RequestMethod.GET,RequestMethod.POST})
	public String getMultimapping()
	{
		return "test2";
	}
}
