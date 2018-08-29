package edu.miumg.gt.clinicamedicas.ws.repo;

import edu.miumg.gt.clinicamedicas.entities.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository()
public interface SessionRepo extends JpaRepository<Session,Integer>{
    Session findByToken(String token);
    Session findByUsuarioIdIsNull(Integer id);    
}
