package mx.com.cinepolis.scheduler.service;

import mx.com.cinepolis.scheduler.commons.to.UsuarioTO;

import java.util.List;

public interface UserManagementService {
    /**
     * Retorna el usuario cuando se loggea
     * @return user
     */
    UsuarioTO getUser(String usuario, String password);

    /**
     * Retrona los datos del nuevo usuario
     * @return user
     */
    UsuarioTO setUser (UsuarioTO usuarioTO);

    List<UsuarioTO> getAllUsers();
}


