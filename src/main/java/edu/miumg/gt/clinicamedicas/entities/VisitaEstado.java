package edu.miumg.gt.clinicamedicas.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter()
@Getter()
@Entity()
@Table()
public class VisitaEstado implements java.io.Serializable{

    private static final long serialVersionUID = -8302884788634934817L;
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String estado;
    
    private Integer activo;

    public VisitaEstado() {
    }

    public VisitaEstado(String estado, Integer activo) {
        this.estado = estado;
        this.activo = activo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }
          
}
