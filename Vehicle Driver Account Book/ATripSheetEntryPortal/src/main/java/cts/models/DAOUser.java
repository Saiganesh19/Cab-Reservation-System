package cts.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;

@Entity
@Table(name = "userdao")
public class DAOUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(unique = true)
	private String username;
	@Column
	@JsonIgnore
	private String password;
	@Column(unique = true)
	private String email;
	@Column
    private String mobile;
	
	private String authToken;
	

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
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	
	

	

	public DAOUser(long id, String username, String password, String email, String mobile, String authToken) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
		this.authToken = authToken;
	}

	@Override
	public String toString() {
		return "DAOUser [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", mobile=" + mobile + ", authToken=" + authToken + "]";
	}

	public DAOUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}