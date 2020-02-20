package song.me.controller;

import org.springframework.stereotype.Controller;

import song.me.dto.TopDTO;
import song.me.service.IService;


public abstract class AbsController {
	IService service;

	public String service(TopDTO dto)
	{
		return service.service(dto);
	}
	
}
