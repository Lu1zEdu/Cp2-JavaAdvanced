package fiap.com.br.cp2.repository;

import fiap.com.br.cp2.models.Anime;
import fiap.com.br.cp2.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
