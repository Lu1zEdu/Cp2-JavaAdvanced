package cp2.fiap.com.br.Cp2_JavaAdvanced.repository;

import cp2.fiap.com.br.Cp2_JavaAdvanced.models.Anime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimeRepository extends JpaRepository<Anime, Long> {
}
