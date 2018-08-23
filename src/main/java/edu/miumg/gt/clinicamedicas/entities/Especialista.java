/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miumg.gt.clinicamedicas.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author BYRON TOLEDO
 */
@Entity()
@Table()
public class Especialista implements java.io.Serializable{

    private static final long serialVersionUID = 777860633479389711L;
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String tipoEspecialidad;
    
    private Integer activo;

    public Especialista() {
    }

    public Especialista(String tipoEspecialidad, Integer activo) {
        this.tipoEspecialidad = tipoEspecialidad;
        this.activo = activo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoEspecialidad() {
        return tipoEspecialidad;
    }

    public void setTipoEspecialidad(String tipoEspecialidad) {
        this.tipoEspecialidad = tipoEspecialidad;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }
       
    
}
