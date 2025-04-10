package fiap.com.br.cp2.repository;

import fiap.com.br.cp2.models.Anime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimeRepository extends JpaRepository<Anime, Long> {
}