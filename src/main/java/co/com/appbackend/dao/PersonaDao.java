
package co.com.appbackend.dao;

import co.com.appbackend.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Long>{ //tipo de entidad, tipo de llave primaria
    
}
