package edu.miumg.gt.clinicamedicas.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Setter()
@Getter()
@Entity()
@Table()
public class Paciente implements java.io.Serializable{

    private static final long serialVersionUID = -2266612488597818654L;
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String nombre;
    
    private String apellido;
    
    private String direccion;
    
    private String estadoCivil;

    private Integer sexo;
    
    private Integer edad;
    
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    public Paciente() {
    }

    public Paciente(String nombre, String apellido, String direccion, String estadoCivil, Integer sexo, Integer edad, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.sexo = sexo;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    } 
       
}
