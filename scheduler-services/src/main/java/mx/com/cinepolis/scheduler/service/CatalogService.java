package mx.com.cinepolis.scheduler.service;

import mx.com.cinepolis.scheduler.commons.to.CatalogsTO;
import mx.com.cinepolis.scheduler.commons.to.UserTO;

import java.util.List;

/**
 * @author jrodriguez
 */
public interface CatalogService {

    /**
     *
     * @return User
     */
    UserTO getUser();
    
    /**
     * Retorna la lista de estados de un pais
     * @param pais acepta un pais como string
     * @return List de estados
     */
    List<CatalogsTO> getEstados(String pais);

    /**
     * Retorna la lista de los usuarios
     * @return Lista de usuarios
     */
    List<UserTO> getAllUsers();

    /**
     * @return object
     */
    UserTO setNewUser (UserTO userTO);

    /**
     * @return object
     */
    boolean getUserId (Long id);

}
