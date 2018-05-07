package mx.com.cinepolis.scheduler.data.persistence.dao.impl;

import mx.com.arquitectura.arquitectura.persistence.impl.BaseDAOImpl;
import mx.com.arquitectura.base.model.UsuarioDO;
import mx.com.cinepolis.scheduler.data.persistence.dao.UsuarioDAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UsuarioDAOImpl extends BaseDAOImpl<UsuarioDO, Long> implements UsuarioDAO {

    /*
     * (non-Javadoc)
     *
     * @see mx.gob.arquitectura.arquitectura.persistence.impl.BaseDAOImpl#
     * setEntityManager(javax.persistence.EntityManager)
     */
    @Override
    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {

        super.setEntityManager(entityManager);
    }

}
