package ShoppingMall.entity;

import org.springframework.web.multipart.MultipartFile;

public class PersonalCenter {
	private Long id;
	private String username;
	private String portraitUrl;
	private String city;
	private Integer sex;
	private String identityID;
	private String type;
	private String resume;
	private MultipartFile portrait;
	private User user;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPortraitUrl() {
		return portraitUrl;
	}
	public void setPortraitUrl(String portraitUrl) {
		this.portraitUrl = portraitUrl;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getIdentityID() {
		return identityID;
	}
	public void setIdentityID(String identityID) {
		this.identityID = identityID;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public MultipartFile getPortrait() {
		return portrait;
	}
	public void setPortrait(MultipartFile portrait) {
		this.portrait = portrait;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "PersonalCenter [id=" + id + ", username=" + username + ", portraitUrl=" + portraitUrl + ", city=" + city
				+ ", sex=" + sex + ", identityID=" + identityID + ", type=" + type + ", resume=" + resume
				+ ", portrait=" + portrait + ", user=" + user + "]";
	}
	
}
