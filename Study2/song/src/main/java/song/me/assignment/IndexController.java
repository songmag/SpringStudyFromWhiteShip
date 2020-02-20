package song.me.assignment;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import song.me.service.UserService;

@Controller
public class IndexController {
	
	@RequestMapping(value = "/helloIndex" , method = RequestMethod.GET)
	@ResponseBody
	public String getLoginPage()
	{
		return "Hello Index Page";
	}
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	@ResponseBody
	public String getHello()
	{
		return "Hello";
	}
	@RequestMapping(value="/hello/{name:([A-Z]*+[a-z])}")
	@ResponseBody
	public String getHello(@PathVariable String name)
	{
		return name;
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
	

	@RequestMapping(value="/file",method=RequestMethod.GET)
	public String getFileView()
	{
		return "file_test";
	}
	
	@RequestMapping(value="/file",method=RequestMethod.POST)
	@ResponseBody
	public String getFile(@RequestParam MultipartFile file)
	{
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		return 	file.getOriginalFilename()+"isUpload";
	}
}
