package edu.miumg.gt.clinicamedicas;

import edu.miumg.gt.clinicamedicas.vistas.Login;
import edu.miumg.gt.clinicamedicas.vistas.Registrar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component()
public class InitializeApplication implements ApplicationRunner {
    
    @Autowired()
    private Login login;
    
        
    @Override
    public void run(ApplicationArguments aa) throws Exception {
        
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        
    //    registrar.setLocationRelativeTo(null);
    //    registrar.setVisible(true);
              
    }
    
  
   
}
