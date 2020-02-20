package song.me.formatter;

import java.text.ParseException;
import java.util.Locale;


import org.springframework.format.Formatter;

import song.me.dto.UserDTO;

public class UserDTOFormatter implements Formatter<UserDTO>{
	public String print(UserDTO object, Locale locale) {
		return object.toString();
	}
	public UserDTO parse(String text, Locale locale) throws ParseException {	
		UserDTO dto = new UserDTO();
		dto.setId(text);
		return dto;
	}
}
