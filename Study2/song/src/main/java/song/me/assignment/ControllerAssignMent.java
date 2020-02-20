package song.me.assignment;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping(value="/{name:(events\\/?\\d*)}")
@RequestMapping(value= {"/events/{name:\\d*}","/events"})
public class ControllerAssignMent {
	@AssignMentNumber(number= {1,3})
	@RequestMapping(method={RequestMethod.GET,RequestMethod.DELETE})
	public @ResponseBody String assignGet()
	{
		return "Get EVENT";
	}
	@AssignMentNumber(number= {2,4})
	@RequestMapping(method={RequestMethod.POST,RequestMethod.PUT},consumes=MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String assignPost()
	{
		return "PUT & POST EVENT";
	}
}
