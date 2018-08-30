/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miumg.gt.clinicamedicas.ws.impl;

import edu.miumg.gt.clinicamedicas.entities.Paciente;
import edu.miumg.gt.clinicamedicas.ws.inte.PacienteInt;
import edu.miumg.gt.clinicamedicas.ws.repo.PacienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author BYRON TOLEDO
 */
@Component()
public class PacienteImpl implements PacienteInt{
    
    @Autowired()
    PacienteRepo pacienteRepo;

    @Override
    public Paciente save(Paciente paciente) {
        
        return pacienteRepo.save(paciente);

    }
    
}
