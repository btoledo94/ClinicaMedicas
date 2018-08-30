package edu.miumg.gt.clinicamedicas.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity()
@Table()
public class Session implements java.io.Serializable{

    private static final long serialVersionUID = -4681134658239438006L;
       
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String token;
    
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date fechaInicio;
//    
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date fechaFin;
    
    @ManyToOne()
    @JoinColumn()
    private Usuario usuario;

    public Session() {
    }

    public Session(Integer id, String token, Usuario usuario) {
        this.id = id;
        this.token = token;
//        this.fechaInicio = fechaInicio;
//        this.fechaFin = fechaFin;
        this.usuario = usuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

//    public Date getFechaInicio() {
//        return fechaInicio;
//    }
//
//    public void setFechaInicio(Date fechaInicio) {
//        this.fechaInicio = fechaInicio;
//    }
//
//    public Date getFechaFin() {
//        return fechaFin;
//    }
//
//    public void setFechaFin(Date fechaFin) {
//        this.fechaFin = fechaFin;
//    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
        
}
