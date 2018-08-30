/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miumg.gt.clinicamedicas.ws.inte;

import edu.miumg.gt.clinicamedicas.entities.Session;
import edu.miumg.gt.clinicamedicas.entities.Usuario;

/**
 *
 * @author BYRON TOLEDO
 */
public interface SessionInt {
    
    Session save(Session session, Usuario usuario);
    
    void delete();
    
}
