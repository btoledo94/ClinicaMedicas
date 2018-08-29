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
public class HistorialPacienteDetalle implements java.io.Serializable{

    private static final long serialVersionUID = 8848342177994429372L;
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String Descripcion;
    
    private String tituloCaso;
    
    private String Observacion;
    
    private String recetaMedica;
    
    @ManyToOne
    private CitaDetalle citaPrevia;
    
    private String examenPrevia;
    
    @ManyToOne
    private VisitaEstado visitaEstado;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaConsulta;

    public HistorialPacienteDetalle() {
    }

    public HistorialPacienteDetalle(String Descripcion, String tituloCaso, String Observacion, String recetaMedica, CitaDetalle citaPrevia, String examenPrevia, VisitaEstado visitaEstado, Date fechaConsulta) {
        this.Descripcion = Descripcion;
        this.tituloCaso = tituloCaso;
        this.Observacion = Observacion;
        this.recetaMedica = recetaMedica;
        this.citaPrevia = citaPrevia;
        this.examenPrevia = examenPrevia;
        this.visitaEstado = visitaEstado;
        this.fechaConsulta = fechaConsulta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getTituloCaso() {
        return tituloCaso;
    }

    public void setTituloCaso(String tituloCaso) {
        this.tituloCaso = tituloCaso;
    }

    public String getObservacion() {
        return Observacion;
    }

    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }

    public String getRecetaMedica() {
        return recetaMedica;
    }

    public void setRecetaMedica(String recetaMedica) {
        this.recetaMedica = recetaMedica;
    }

    public CitaDetalle getCitaPrevia() {
        return citaPrevia;
    }

    public void setCitaPrevia(CitaDetalle citaPrevia) {
        this.citaPrevia = citaPrevia;
    }

    public String getExamenPrevia() {
        return examenPrevia;
    }

    public void setExamenPrevia(String examenPrevia) {
        this.examenPrevia = examenPrevia;
    }

    public VisitaEstado getVisitaEstado() {
        return visitaEstado;
    }

    public void setVisitaEstado(VisitaEstado visitaEstado) {
        this.visitaEstado = visitaEstado;
    }

    public Date getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(Date fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }
       
}
