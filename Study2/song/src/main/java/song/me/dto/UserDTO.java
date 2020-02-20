package song.me.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.validation.annotation.Validated;


public class UserDTO extends TopDTO{
	@NotEmpty(message = "Id 칸을 비우지 말아주세요.")
	@NotBlank(message = "Space Error")
	private String id;
	@NotEmpty(message = "Password 칸을 비우지 말아주세요.")
	private String password;
	@NotEmpty(message = "이름 칸을 비우지 말아주세요.")
	@NotBlank(message = "Space Error")
	private String name;
	@NotEmpty(message="email 칸을 비우지 말아주세요")
	@Email(message = "Email을 정확하게 입력하여 주세요")
	private String email;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", password=" + password + ", name=" + name + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
//	public MultipartFile getFile() {
//		return file;
//	}
//	public void setFile(MultipartFile file) {
//		this.file = file;
//	}
	
}
