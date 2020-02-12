package me.song;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	
	public String getHello()
	{
		return "Service provide name Song!!";
	}
}
