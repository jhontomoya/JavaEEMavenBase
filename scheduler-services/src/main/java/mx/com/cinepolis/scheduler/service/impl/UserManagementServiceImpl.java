package mx.com.cinepolis.scheduler.service.impl;

import mx.com.arquitectura.base.model.UsuarioDO;
import mx.com.cinepolis.scheduler.commons.to.UsuarioTO;
import mx.com.cinepolis.scheduler.data.persistence.dao.UsuarioDAO;
import mx.com.cinepolis.scheduler.service.UserManagementService;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserManagementServiceImpl implements UserManagementService {

    @Inject()
    private UsuarioDAO userDAO;

    @Override
    public UsuarioTO getUser(String usuario, String password) {
        //userDAO.findByColumn()
        return null;
    }

    @Override
    public UsuarioTO setUser(UsuarioTO usuarioTO) {
        UsuarioDO usuarioDO = new UsuarioDO();
        usuarioDO.setNombreDo(usuarioTO.getNameTo());
        usuarioDO.setUsuarioDo(usuarioTO.getUserNameTo());
        usuarioDO.setPasswordDo(usuarioTO.getPasswordTo());
        usuarioDO.setIdPermisoDo(usuarioTO.getIdPermisoTo());
        userDAO.create(usuarioDO);
        return usuarioTO;
    }

    @Override
    public List<UsuarioTO> getAllUsers() {
        List<UsuarioDO> userDOList = userDAO.findAll();

        return userDOList.stream().map(x -> new UsuarioTO() {{
            setIdUserTo(x.getIdUserDo());
            setNameTo(x.getNombreDo());
            setUserNameTo(x.getUsuarioDo());
            setPasswordTo(x.getPasswordDo());
            setIdPermisoTo(x.getIdPermisoDo());
        }}).collect(Collectors.toList());
    }
}
