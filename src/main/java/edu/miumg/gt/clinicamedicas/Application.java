package edu.miumg.gt.clinicamedicas;

import edu.miumg.gt.clinicamedicas.vistas.Login;
import edu.miumg.gt.clinicamedicas.vistas.Menu;
import edu.miumg.gt.clinicamedicas.vistas.Persona;
import edu.miumg.gt.clinicamedicas.vistas.Registrar;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author wilver
 */
@SpringBootApplication()
public class Application {

    public static void main(String[] arguments) {

        new SpringApplicationBuilder(Application.class)
                .headless(false)
                .web(false)
                .run(arguments);
    }

    @Bean()
    public Login login() {
        return new Login();
    }
    
    @Bean()
    public Registrar registrar() {
        return new Registrar();
    }
    
    @Bean()
    public Persona persona() {
         return new Persona();
    }
    
    @Bean()
    public  Menu menu() {
      return new Menu();
    }
 }
