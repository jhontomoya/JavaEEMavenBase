package mx.com.cinepolis.scheduler.facade;

import mx.com.cinepolis.scheduler.commons.to.UsuarioTO;
import mx.com.cinepolis.scheduler.service.UserManagementService;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
@LocalBean
public class UserManagementFacadeEJB {
    @Inject
    UserManagementService userManagementService;

    public UsuarioTO getUser (String user, String password){

        return userManagementService.getUser(user,password);
    }

    public  UsuarioTO setUser (UsuarioTO usuarioTO){

        return  userManagementService.setUser(usuarioTO);
    }
    public List<UsuarioTO> getAllUsers (){

        return userManagementService.getAllUsers();
    }
}
