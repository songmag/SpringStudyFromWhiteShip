package song.me.dto;

public class MenuDTO {
	String name;
	String urlPath;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrlPath() {
		return urlPath;
	}
	public void setUrlPath(String urlPath) {
		this.urlPath = urlPath;
	}
	public MenuDTO(String name, String urlPath) {
		super();
		this.name = name;
		this.urlPath = urlPath;
	}
	public MenuDTO() {
		super();
		this.name = "test";
		this.urlPath = "test";
	}
	
}
