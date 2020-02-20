package song.me.service;

import org.springframework.stereotype.Service;

import song.me.dto.TopDTO;

public interface IService<T extends TopDTO> {
	public String service(T dto);
}
