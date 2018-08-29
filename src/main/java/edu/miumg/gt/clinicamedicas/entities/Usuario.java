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
public class Usuario implements java.io.Serializable{

    private static final long serialVersionUID = -7697989839525962395L;
       
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String usuario;
    
    private String nombre;
    
    private String password;
    
     @Temporal(TemporalType.DATE)
    private Date fechaNacimineto;
     
     private String apellido;
    
     private Integer edad;
     
     private Integer sexo;
     
     @ManyToOne
     private Especialista especialista;
    
    public Usuario() {
    }

    public Usuario(String usuario, String nombre, String password, Date fechaNacimineto, String apellido, Integer edad, Integer sexo, Especialista especialista) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.password = password;
        this.fechaNacimineto = fechaNacimineto;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.especialista = especialista;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFechaNacimineto() {
        return fechaNacimineto;
    }

    public void setFechaNacimineto(Date fechaNacimineto) {
        this.fechaNacimineto = fechaNacimineto;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getSexo() {
        return sexo;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }

    public Especialista getEspecialista() {
        return especialista;
    }

    public void setEspecialista(Especialista especialista) {
        this.especialista = especialista;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", nombre=" + nombre + ", password=" + password + ", fechaNacimineto=" + fechaNacimineto + ", apellido=" + apellido + ", edad=" + edad + ", sexo=" + sexo + ", especialista=" + especialista + '}';
    }
    
         
}
