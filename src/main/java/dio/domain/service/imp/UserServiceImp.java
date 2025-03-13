package dio.domain.service.imp;



import dio.domain.model.Usuario;
import dio.domain.repository.UserRepository;
import dio.domain.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    public UserServiceImp (UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public Optional<Usuario> findById(Long id) {
        return userRepository.findById(id);

    }

    @Override
    public Usuario create(Usuario userToCriate) {
        if (userRepository.existsByContaNumero(userToCriate.getConta().getNumero()))
            throw new IllegalArgumentException("Esse numero de usuario ja existe");

        return userRepository.save(userToCriate);


    }

}
