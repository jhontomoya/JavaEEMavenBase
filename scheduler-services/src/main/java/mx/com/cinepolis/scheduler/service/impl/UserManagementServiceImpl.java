package mx.com.cinepolis.scheduler.service.impl;

import mx.com.arquitectura.base.model.UsuarioDO;
import mx.com.cinepolis.scheduler.commons.to.UsuarioTO;
import mx.com.cinepolis.scheduler.data.persistence.dao.UsuarioDAO;
import mx.com.cinepolis.scheduler.service.UserManagementService;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

public class UserManagementServiceImpl implements UserManagementService {

    @Inject()
    private UsuarioDAO userDAO;

    @Override
    public UsuarioTO getUser(String usuario, String password) {
        UsuarioTO usuarioTO = userDAO.getByColumn("usuario",UsuarioDO.class,usuario);
        return usuarioTO;
    }

    @Override
    public UsuarioTO setNewUser(UsuarioTO userTO) {
        UsuarioDO userDO1 = new UsuarioDO();
        userDO1.setNombre(userTO.getName());
        userDO1.setUsuario(userTO.getUserName());
        userDO1.setPwd(userTO.getPassword());
        userDO1.setIdPermiso(userTO.getIdPermiso());
        userDAO.create(userDO1);
        return userTO;
    }

    @Override
    public List<UsuarioTO> getAllUsers() {
        List<UsuarioDO> userDOList = userDAO.findAll();
        return userDOList.stream().map(x -> new UsuarioTO() {{
            setIdUser(x.getIdUser());
            setName(x.getNombre());
            setUserName(x.getUsuario());
            setPassword(x.getPwd());
            setIdPermiso(x.getIdPermiso());
        }}).collect(Collectors.toList());
    }

}
