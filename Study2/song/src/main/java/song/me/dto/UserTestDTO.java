package song.me.dto;

public class UserTestDTO {
	private String name;
	private String address;
	private String country;
	private String phoneNumber;
	private String introduction;
	private String thumbnail;
	
	public UserTestDTO() {
		this.name = "test";
		this.address="test";
		this.country = "test";
		this.phoneNumber = "test";
		this.introduction = "test";
		this.thumbnail = "test";
	}
	public UserTestDTO(String name, String address, String country, String phoneNumber, String introduction,
			String thumbnail) {
		super();
		this.name = name;
		this.address = address;
		this.country = country;
		this.phoneNumber = phoneNumber;
		this.introduction = introduction;
		this.thumbnail = thumbnail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	@Override
	public String toString() {
		return "UserTestDTO [name=" + name + ", address=" + address + ", country=" + country + ", phoneNumber="
				+ phoneNumber + ", introduction=" + introduction + ", thumbnail=" + thumbnail + "]";
	}
	
}
