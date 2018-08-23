/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miumg.gt.clinicamedicas.repo;

import edu.miumg.gt.clinicamedicas.entities.Especialista;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author BYRON TOLEDO
 */
@Repository()
public interface EspecialistaRepo extends PagingAndSortingRepository<Especialista,Integer>{
    @Override()
    List<Especialista> findAll();
      
}
