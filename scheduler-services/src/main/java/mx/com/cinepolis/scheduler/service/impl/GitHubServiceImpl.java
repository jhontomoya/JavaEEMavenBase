package mx.com.cinepolis.scheduler.service.impl;

import mx.com.cinepolis.scheduler.commons.to.GitHubAddUserTO;
import mx.com.cinepolis.scheduler.commons.to.GitHubUserTO;
import mx.com.cinepolis.scheduler.commons.to.GitHubUserValidTO;
import mx.com.cinepolis.scheduler.service.GitHubService;

public class GitHubServiceImpl implements GitHubService {

	@Override
	public GitHubUserTO getLogin(String login) {
		GitHubUserTO gitHubUserTO = new GitHubUserTO();
		if (login.equals("jhontomoya")) {
			gitHubUserTO.setLogin(login);
			gitHubUserTO.setName("Jhonn");
			gitHubUserTO.setAvatar_url("https://avatars0.githubusercontent.com/u/38266263?s=400&u=5e6ebc90a66326685a713c548fdafca18729d375&v=4");
			gitHubUserTO.setFollowers(0);
			gitHubUserTO.setFollowing(1);
		}else {
			gitHubUserTO.setLogin(login);
			gitHubUserTO.setName("Invalid");
			gitHubUserTO.setAvatar_url("invalid");
			gitHubUserTO.setFollowers(0);
			gitHubUserTO.setFollowing(0);
		}
		
		return gitHubUserTO;
	}

	@Override
	public GitHubUserValidTO getStateLogin(String login, String password) {
		GitHubUserValidTO gitHubUserValidTO = new GitHubUserValidTO();
		if (login.equals("jhontomoya") && password.equals("123")) {
			gitHubUserValidTO.setLogin(login);
			gitHubUserValidTO.setPasswrod(password);
			gitHubUserValidTO.setState(true);
			
		}else {
			gitHubUserValidTO.setLogin(login);
			gitHubUserValidTO.setPasswrod(password);
			gitHubUserValidTO.setState(false);
		}
		return gitHubUserValidTO;
	}

	@Override
	public GitHubAddUserTO setDataUser(GitHubAddUserTO gitHubAddUserTO) {
		//GitHubAddUserTO gitHubAddUserTO2 = new GitHubAddUserTO();
		return gitHubAddUserTO;
	}	
}
