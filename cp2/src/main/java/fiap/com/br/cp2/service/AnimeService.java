package fiap.com.br.cp2.service;

import fiap.com.br.cp2.controller.AnimeController;
import fiap.com.br.cp2.dto.AnimeRequest;
import fiap.com.br.cp2.dto.AnimeResponse;
import fiap.com.br.cp2.models.Anime;
import fiap.com.br.cp2.models.Rank;
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

    public AnimeResponse saveAnime(AnimeRequest request) {
        Anime anime = animeToEntity(request);
        Anime animeSalvo = animeRepository.save(anime);
        return entityToResponse(animeSalvo);
    }

    public Page<AnimeResponse> findAll(Pageable pageable) {
        return animeRepository.findAll(pageable).map(this::entityToResponse);
    }

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
        anime.setTypeSeason(dto.getTypeSeason());
        return anime;
    }

    public AnimeResponse entityToResponse(Anime anime) {

        System.out.println("Convertendo anime: " + anime.getTitulo());
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

    public Anime updateAnime(Long id, Anime animeAtualizado) {
        Optional<Anime> optionalAnime = animeRepository.findById(id);
        if (optionalAnime.isPresent()) {
            Anime anime = optionalAnime.get();
            anime.setTitulo(animeAtualizado.getTitulo());
            anime.setTemporada(animeAtualizado.getTemporada());
            anime.setDescricao(animeAtualizado.getDescricao());
            anime.setDataDeLancamento(animeAtualizado.getDataDeLancamento());
            anime.setDataDeTermino(animeAtualizado.getDataDeTermino());
            anime.setTypeStudio(animeAtualizado.getTypeStudio());
            anime.setStatusAnime(animeAtualizado.getStatusAnime());
            anime.setGenero(animeAtualizado.getGenero());
            anime.setTypeSeason(animeAtualizado.getTypeSeason());

            return animeRepository.save(anime);
        } else {
            throw new RuntimeException("Rank não encontrado com ID: " + id);
        }
    }

    public void deleteById(Long id){animeRepository.deleteById(id);}

}
