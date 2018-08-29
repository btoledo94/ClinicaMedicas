package edu.miumg.gt.clinicamedicas.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity()
@Table()
public class Cita implements java.io.Serializable{

    private static final long serialVersionUID = -433347436090931450L;
      
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String tituloCita;
        
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;  
    
    @ManyToOne
    private Usuario usuario;
    
    @ManyToOne
    private Paciente pacientes;
    
    private Integer activo;

    public Cita() {
    }

    public Cita(String tituloCita, Date fechaInicio, Usuario usuario, Paciente pacientes, Integer activo) {
        this.tituloCita = tituloCita;
        this.fechaInicio = fechaInicio;
        this.usuario = usuario;
        this.pacientes = pacientes;
        this.activo = activo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTituloCita() {
        return tituloCita;
    }

    public void setTituloCita(String tituloCita) {
        this.tituloCita = tituloCita;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Paciente getPacientes() {
        return pacientes;
    }

    public void setPacientes(Paciente pacientes) {
        this.pacientes = pacientes;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }
          
}
