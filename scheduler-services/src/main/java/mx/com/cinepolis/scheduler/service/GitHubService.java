package mx.com.cinepolis.scheduler.service;

import mx.com.cinepolis.scheduler.commons.to.GitHubAddUserTO;
import mx.com.cinepolis.scheduler.commons.to.GitHubUserTO;
import mx.com.cinepolis.scheduler.commons.to.GitHubUserValidTO;

public interface GitHubService {
	
	/**
	 * @return login
	 */
	GitHubUserTO getLogin(String login);
	
	/**
	 * @return true or false
	 */
	GitHubUserValidTO getStateLogin(String login, String password);
	
	/**
	 * @return object
	 */
	GitHubAddUserTO setDataUser (GitHubAddUserTO gitHubAddUserTO);

}
