package ShoppingMall.entity;

public class User {

	private Long id;
//	@Size(min = 2, max = 16, message = "用户名必须是2~16个字")
	private String username;

//	@Size(min = 6, max = 64, message = "密码长度为6~64")
	private String password;

//	@Pattern(regexp = "^1[3|4|5|7|8][0-9]{9}$", message = "手机号不符合规则")
	private String phonenum;

//	@Email(regexp = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z0-9]{2,6}$", message = "邮箱号不符合规则")
	private String email;
	private String role;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", phonenum=" + phonenum
				+ ", email=" + email + ", role=" + role + "]";
	}
}