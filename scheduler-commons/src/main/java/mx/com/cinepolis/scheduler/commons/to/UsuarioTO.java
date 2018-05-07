package mx.com.cinepolis.scheduler.commons.to;

import java.io.Serializable;

public class UsuarioTO implements Serializable {

    private Long idUserTo;
    private String userNameTo;
    private String nameTo;
    private String passwordTo;
    private int idPermisoTo;

    public Long getIdUserTo() {
        return idUserTo;
    }

    public void setIdUserTo(Long idUserTo) {
        this.idUserTo = idUserTo;
    }

    public String getUserNameTo() {
        return userNameTo;
    }

    public void setUserNameTo(String userNameTo) {
        this.userNameTo = userNameTo;
    }

    public String getNameTo() {
        return nameTo;
    }

    public void setNameTo(String nameTo) {
        this.nameTo = nameTo;
    }

    public String getPasswordTo() {
        return passwordTo;
    }

    public void setPasswordTo(String passwordTo) {
        this.passwordTo = passwordTo;
    }

    public int getIdPermisoTo() {
        return idPermisoTo;
    }

    public void setIdPermisoTo(int idPermisoTo) {
        this.idPermisoTo = idPermisoTo;
    }
}
