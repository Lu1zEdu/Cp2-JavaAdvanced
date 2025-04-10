package fiap.com.br.cp2.service;

import fiap.com.br.cp2.models.Rank;
import fiap.com.br.cp2.repository.RankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RankService {

    @Autowired
    private RankRepository rankRepository;

    // Salvar um novo Rank
    public Rank saveRank(Rank rank) {
        return rankRepository.save(rank);
    }

    // Buscar todos os Ranks com paginação
    public Page<Rank> findAll(Pageable pageable) {
        return rankRepository.findAll(pageable);
    }

    // Buscar Rank por ID
    public Optional<Rank> findById(Long id) {
        return rankRepository.findById(id);
    }

    // Deletar Rank por ID
    public void deleteById(Long id) {
        rankRepository.deleteById(id);
    }

    // Atualizar Rank existente
    public Rank updateRank(Long id, Rank rankAtualizado) {
        Optional<Rank> optionalRank = rankRepository.findById(id);
        if (optionalRank.isPresent()) {
            Rank rank = optionalRank.get();
            rank.setNotaGeral(rankAtualizado.getNotaGeral());
            rank.setNotaUsuario(rankAtualizado.getNotaUsuario());
            rank.setComentario(rankAtualizado.getComentario());
            return rankRepository.save(rank);
        } else {
            throw new RuntimeException("Rank não encontrado com ID: " + id);
        }
    }
}
