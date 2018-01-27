package unitec.org.elementos;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;


public interface RepositorioMensajitos extends CrudRepository<Mensajitos, Integer>{ //clase a mapear,tipo de dato del primary key
    
    
}
