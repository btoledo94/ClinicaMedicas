/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miumg.gt.clinicamedicas.ws.impl;

import edu.miumg.gt.clinicamedicas.entities.Session;
import edu.miumg.gt.clinicamedicas.entities.Usuario;
import edu.miumg.gt.clinicamedicas.ws.inte.SessionInt;
import edu.miumg.gt.clinicamedicas.ws.repo.SessionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author BYRON TOLEDO
 */
@Component()
public class SessionImpl implements SessionInt{
    
    @Autowired()
   SessionRepo sessionRepo;

    @Override
    public Session save(Session session, Usuario usuario) {
        
        session.setUsuario(usuario);        
        return sessionRepo.save(session);
    }

    @Override
    public void delete() {
         sessionRepo.deleteAll();
    }
    
    
}
