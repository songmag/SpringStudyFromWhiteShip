package song.me.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import song.me.dto.MenuDTO;
import song.me.dto.UserTestDTO;


@Controller
public class MainController extends AbsController{
	
	@RequestMapping(value="/" , method=RequestMethod.GET)
	public ModelAndView getMainPage()
	{
		ModelAndView view = new ModelAndView();
		List<MenuDTO> navList = new LinkedList<MenuDTO>();
		navList.add(new MenuDTO());
		navList.add(new MenuDTO());
		List<UserTestDTO> userList = new LinkedList<UserTestDTO>();
		userList.add(new UserTestDTO());
		userList.add(new UserTestDTO());
		for(int i = 0 ; i < 5;i++)
		{
			userList.add(new UserTestDTO());
		}
		view.setViewName("main");
		//view.getModel().put("userList",userList);
		System.out.println(view.getModel().get("userList"));
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("userList", userList);
		map.put("navList", navList);
		view.addAllObjects(map);
		return view;
	}
}
