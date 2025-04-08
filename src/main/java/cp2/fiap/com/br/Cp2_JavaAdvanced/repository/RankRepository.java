package cp2.fiap.com.br.Cp2_JavaAdvanced.repository;

import cp2.fiap.com.br.Cp2_JavaAdvanced.models.Rank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RankRepository extends JpaRepository<Rank, Long> {
}
