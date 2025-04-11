package fiap.com.br.cp2.service;

import fiap.com.br.cp2.models.User;
import fiap.com.br.cp2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public Page<User> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    public User updateUser(Long id, User userAtualizado) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setNome(userAtualizado.getNome());
            user.setIdade(userAtualizado.getIdade());
            user.setEmail(userAtualizado.getEmail());
            return userRepository.save(user);
        } else {
            throw new RuntimeException("Usuário não encontrado com ID: " + id);
        }
    }
}
