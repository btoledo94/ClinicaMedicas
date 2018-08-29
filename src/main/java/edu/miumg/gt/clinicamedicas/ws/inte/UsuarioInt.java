
package edu.miumg.gt.clinicamedicas.ws.inte;

import edu.miumg.gt.clinicamedicas.entities.Usuario;
import java.util.List;

/**
 *
 * @author BYRON TOLEDO
 */

public interface UsuarioInt {
    
    List<Usuario> findAllUsuario();
    
    Usuario save(Usuario usuario,Integer id);
    
}
