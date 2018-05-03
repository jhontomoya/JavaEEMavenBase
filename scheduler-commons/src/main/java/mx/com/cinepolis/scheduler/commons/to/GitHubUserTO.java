package mx.com.cinepolis.scheduler.commons.to;

import java.io.Serializable;

public class GitHubUserTO implements Serializable {
	
	private String login;
	private String avatar_url;
	private String name;
	private Integer followers;
	private Integer following;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getAvatar_url() {
		return avatar_url;
	}
	public void setAvatar_url(String avatar_url) {
		this.avatar_url = avatar_url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getFollowers() {
		return followers;
	}
	public void setFollowers(Integer followers) {
		this.followers = followers;
	}
	public Integer getFollowing() {
		return following;
	}
	public void setFollowing(Integer following) {
		this.following = following;
	}
	
}
