package song.me.service;

import org.springframework.stereotype.Service;

import song.me.dto.TopDTO;
import song.me.dto.UserDTO;


@Service
public class UserService implements IService<UserDTO> {
	public String service(UserDTO dto) {
		UserDTO t_dto = dto;
		return t_dto.toString();
	}
}
