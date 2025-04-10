package fiap.com.br.cp2.service;

import fiap.com.br.cp2.controller.AnimeController;
import fiap.com.br.cp2.dto.AnimeRequest;
import fiap.com.br.cp2.dto.AnimeResponse;
import fiap.com.br.cp2.models.Anime;
import fiap.com.br.cp2.repository.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AnimeService {

    @Autowired
    private AnimeRepository animeRepository;

    // Salva um novo anime no banco e retorna a resposta formatada
    public AnimeResponse saveAnime(AnimeRequest request) {
        Anime anime = animeToEntity(request);
        Anime animeSalvo = animeRepository.save(anime);
        return entityToResponse(animeSalvo);
    }

    // Retorna todos os animes com paginação
    public Page<AnimeResponse> findAll(Pageable pageable) {
        return animeRepository.findAll(pageable).map(this::entityToResponse);
    }

    // Busca um anime pelo ID
    public Optional<Anime> findById(Long id) {
        return animeRepository.findById(id);
    }

    // Converte o DTO (request) em entidade
    public Anime animeToEntity(AnimeRequest dto) {
        Anime anime = new Anime();
        anime.setTitulo(dto.getTitulo());
        anime.setTemporada(dto.getTemporada());
        anime.setDescricao(dto.getDescricao());
        anime.setDataDeLancamento(dto.getDataDeLancamento());
        anime.setDataDeTermino(dto.getDataDeTermino());
        anime.setTypeStudio(dto.getStudio());
        anime.setStatusAnime(dto.getStatus());
        anime.setGenero(dto.getGenero());
        return anime;
    }

    // Converte a entidade em DTO (response)
    public AnimeResponse entityToResponse(Anime anime) {
        return new AnimeResponse(
                anime.getId(),
                anime.getTitulo(),
                anime.getTemporada(),
                anime.getDescricao(),
                anime.getDataDeLancamento(),
                anime.getDataDeTermino(),
                anime.getTypeStudio(),
                anime.getStatusAnime(),
                anime.getGenero(),
                anime.getTypeSeason()
        );
    }
}
