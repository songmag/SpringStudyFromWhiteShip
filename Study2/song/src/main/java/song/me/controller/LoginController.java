package song.me.controller;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import song.me.dto.UserDTO;
import song.me.service.IService;

@Controller
@RequestMapping(value="/login")
public class LoginController extends AbsController implements InitializingBean{
	
	@Autowired
	IService userService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String getLoginPage()
	{
		return "login";
	}
	
	@RequestMapping(value="/signup" ,method=RequestMethod.GET)
	public String getSignUpPage()
	{
		return "signup_page";
	}	
	
	@RequestMapping(value="/signup", method=RequestMethod.POST ,produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String getSignUpPage(@RequestParam("file") MultipartFile file,@Validated
			@ModelAttribute UserDTO dto, BindingResult result)
	{
		if(result.hasErrors())
		{
			return result.toString();
		}
		return service(dto);
	}
	
	public void afterPropertiesSet() throws Exception {
		this.service = userService;
		System.out.println(this.service.toString());
	}
}
