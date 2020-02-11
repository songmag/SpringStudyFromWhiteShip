package me.song;

import org.springframework.stereotype.Component;

@Component
public class UserService {
	
	String getHello()
	{
		return "Service provide name Song!!";
	}
}
