package edu.miumg.gt.clinicamedicas;

import edu.miumg.gt.clinicamedicas.entities.Session;
import edu.miumg.gt.clinicamedicas.vistas.Login;
import edu.miumg.gt.clinicamedicas.vistas.Menu;
import edu.miumg.gt.clinicamedicas.ws.repo.SessionRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component()
public class InitializeApplication implements ApplicationRunner {
    
    @Autowired()
    private Login login;
    
    @Autowired()
    private Menu menu;
    
    @Autowired()
    SessionRepo sessionRepo;
    
          
    @Override
    public void run(ApplicationArguments aa) throws Exception {
             List<Session> session = sessionRepo.findAll();         
        if(session.isEmpty()){        
       login.setLocationRelativeTo(null);
        login.setVisible(true);
        }else{
        
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        
        }
               
    }
    
  
   
}
