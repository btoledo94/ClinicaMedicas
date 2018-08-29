/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miumg.gt.clinicamedicas.ws.impl;

import edu.miumg.gt.clinicamedicas.entities.Especialista;
import edu.miumg.gt.clinicamedicas.entities.Usuario;
import edu.miumg.gt.clinicamedicas.ws.inte.UsuarioInt;
import edu.miumg.gt.clinicamedicas.ws.repo.EspecialistaRepo;
import edu.miumg.gt.clinicamedicas.ws.repo.UsuarioRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author BYRON TOLEDO
 */
@Component()
public class UsuarioImpl implements UsuarioInt{
    
    @Autowired()
    UsuarioRepo usuarioRepo;
    
    @Autowired()
    EspecialistaRepo especialistaRepo;

    @Override
    public List<Usuario> findAllUsuario() {
       return usuarioRepo.findAll();
    }

    
    @Override
    public Usuario save(Usuario usuario, Integer id) {
        
        Especialista especialista = especialistaRepo.findOne(id);
        
        usuario.setEspecialista(especialista);
 
        return usuarioRepo.save(usuario);
        
    }
    
}
