package mx.com.cinepolis.scheduler.commons.to;

import java.io.Serializable;

public class GitHubUserValidTO implements Serializable {
	
	private boolean state;
	private String login;
	private String passwrod;
	
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPasswrod() {
		return passwrod;
	}
	public void setPasswrod(String passwrod) {
		this.passwrod = passwrod;
	}

}
