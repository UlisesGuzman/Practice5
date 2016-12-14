package mx.utng.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  @Table(name="usuarios")
public class Usuario {
	@Id @GeneratedValue
	private Long id;
	
	@Column(length =30)
	private String userName;
	
	@Column(length =30)
	private String password;
	
	private int isSiteAdministrator;
	
	@Column(length =60)
	private String fullName;
	
	@Column(length =120)
	private String emailAddress;
	
	@Column(length =255)
	private String url;

	public Usuario(String userName, String password, int isSiteAdministrator, String fullName, String emailAddress,
			String url) {
		super();
		this.userName = userName;
		this.password = password;
		this.isSiteAdministrator = isSiteAdministrator;
		this.fullName = fullName;
		this.emailAddress = emailAddress;
		this.url = url;
	}

	public Usuario() {
		this("", "", 0, "", "", "");
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getIsSiteAdministrator() {
		return isSiteAdministrator;
	}

	public void setIsSiteAdministrator(int isSiteAdministrator) {
		this.isSiteAdministrator = isSiteAdministrator;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", userName=" + userName + ", password=" + password + ", isSiteAdministrator="
				+ isSiteAdministrator + ", fullName=" + fullName + ", emailAddress=" + emailAddress + ", url=" + url
				+ "]";
	}
		
	
}
