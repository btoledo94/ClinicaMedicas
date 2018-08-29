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
public class HistorialPaciente implements java.io.Serializable{

    private static final long serialVersionUID = -3409916198913466686L;
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String enfermedadNacimiento;
    
    private String fracturaCuerpo;
    
    private String alergias;
    
    private String cardiaco;
    
    private String respiratorios;
    
    private String medicamentos;
    
    private Integer fuma;
    
    private Integer bebeAlcohol;
            
    @ManyToOne
    private Paciente paciente;
    
    @ManyToOne
    private Usuario usuario;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    
    private Integer activo;

    public HistorialPaciente() {
    }

    public HistorialPaciente(String enfermedadNacimiento, String fracturaCuerpo, String alergias, String cardiaco, String respiratorios, String medicamentos, Integer fuma, Integer bebeAlcohol, Paciente paciente, Usuario usuario, Date fechaInicio, Integer activo) {
        this.enfermedadNacimiento = enfermedadNacimiento;
        this.fracturaCuerpo = fracturaCuerpo;
        this.alergias = alergias;
        this.cardiaco = cardiaco;
        this.respiratorios = respiratorios;
        this.medicamentos = medicamentos;
        this.fuma = fuma;
        this.bebeAlcohol = bebeAlcohol;
        this.paciente = paciente;
        this.usuario = usuario;
        this.fechaInicio = fechaInicio;
        this.activo = activo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnfermedadNacimiento() {
        return enfermedadNacimiento;
    }

    public void setEnfermedadNacimiento(String enfermedadNacimiento) {
        this.enfermedadNacimiento = enfermedadNacimiento;
    }

    public String getFracturaCuerpo() {
        return fracturaCuerpo;
    }

    public void setFracturaCuerpo(String fracturaCuerpo) {
        this.fracturaCuerpo = fracturaCuerpo;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getCardiaco() {
        return cardiaco;
    }

    public void setCardiaco(String cardiaco) {
        this.cardiaco = cardiaco;
    }

    public String getRespiratorios() {
        return respiratorios;
    }

    public void setRespiratorios(String respiratorios) {
        this.respiratorios = respiratorios;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Integer getFuma() {
        return fuma;
    }

    public void setFuma(Integer fuma) {
        this.fuma = fuma;
    }

    public Integer getBebeAlcohol() {
        return bebeAlcohol;
    }

    public void setBebeAlcohol(Integer bebeAlcohol) {
        this.bebeAlcohol = bebeAlcohol;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }
       
}
