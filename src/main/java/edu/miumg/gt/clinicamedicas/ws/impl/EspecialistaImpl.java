/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miumg.gt.clinicamedicas.ws.impl;

import edu.miumg.gt.clinicamedicas.entities.Especialista;
import edu.miumg.gt.clinicamedicas.ws.inte.EspecialistaInt;
import edu.miumg.gt.clinicamedicas.ws.repo.EspecialistaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author BYRON TOLEDO
 */
@Component()
public class EspecialistaImpl implements EspecialistaInt {

    @Autowired()
    EspecialistaRepo especialistaRepo;

    @Override
    public List<Especialista> findAllEspecialista() {
        return especialistaRepo.findAll();
    }

}
