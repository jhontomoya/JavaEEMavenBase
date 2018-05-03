package mx.com.cinepolis.scheduler.facade;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import mx.com.cinepolis.scheduler.commons.to.GitHubAddUserTO;
import mx.com.cinepolis.scheduler.commons.to.GitHubUserTO;
import mx.com.cinepolis.scheduler.commons.to.GitHubUserValidTO;
import mx.com.cinepolis.scheduler.service.GitHubService;

@Stateless
@LocalBean
public class GitHubFacadeEJB {
	
	@Inject
	GitHubService gitHubService;
	
	public GitHubUserTO getUserLogin(String login) {
		return gitHubService.getLogin(login);
	}
	
	public GitHubUserValidTO getLoginValid(String login, String password) {
		return gitHubService.getStateLogin(login, password);
	}
	public GitHubAddUserTO setUserAdd(GitHubAddUserTO gitHubAddUserTO) {
		return gitHubService.setDataUser(gitHubAddUserTO);
	}

}
