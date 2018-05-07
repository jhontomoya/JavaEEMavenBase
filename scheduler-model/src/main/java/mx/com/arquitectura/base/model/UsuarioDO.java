package mx.com.arquitectura.base.model;

import javax.persistence.*;

@Entity
@Table(name = "K_USER")
public class UsuarioDO {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PK_USER")
    private Long idUserDo;

    @Column(name = "USUARIO")
    private String usuarioDo;

    @Column(name = "NOMBRE")
    private String nombreDo;

    @Column(name = "PDW")
    private String passwordDo;

    @Column(name = "ID_PERMISO")
    private int idPermisoDo;

    public Long getIdUserDo() {
        return idUserDo;
    }

    public void setIdUserDo(Long idUserDo) {
        this.idUserDo = idUserDo;
    }

    public String getUsuarioDo() {
        return usuarioDo;
    }

    public void setUsuarioDo(String usuarioDo) {
        this.usuarioDo = usuarioDo;
    }

    public String getNombreDo() {
        return nombreDo;
    }

    public void setNombreDo(String nombreDo) {
        this.nombreDo = nombreDo;
    }

    public String getPasswordDo() {
        return passwordDo;
    }

    public void setPasswordDo(String passwordDo) {
        this.passwordDo = passwordDo;
    }

    public int getIdPermisoDo() {
        return idPermisoDo;
    }

    public void setIdPermisoDo(int idPermisoDo) {
        this.idPermisoDo = idPermisoDo;
    }
}
