package dio.domain.service;

import dio.domain.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService {

    Optional<Usuario> findById(Long id);

    Usuario create(Usuario userToCriate);


}
