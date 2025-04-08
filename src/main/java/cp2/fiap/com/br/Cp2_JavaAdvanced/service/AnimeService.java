package cp2.fiap.com.br.Cp2_JavaAdvanced.service;

import cp2.fiap.com.br.Cp2_JavaAdvanced.dto.AnimeRequest;
import cp2.fiap.com.br.Cp2_JavaAdvanced.dto.AnimeResponse;
import cp2.fiap.com.br.Cp2_JavaAdvanced.models.Anime;
import cp2.fiap.com.br.Cp2_JavaAdvanced.repository.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
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

    public Anime animeToEntity(AnimeRequest dto) {
        Anime anime = new Anime();
        anime.setTitulo(dto.getTitulo());
        anime.setDescricao(dto.getDescricao());
        anime.setStudio(dto.getStudio());
        anime.setStatus(dto.getStatus());
        anime.setDataDeLancamento(dto.getDataDeLancamento());
        anime.setDataDeTermino(dto.getDataDeTermino());
        anime.setGeneroList(dto.getGeneroList());
        return anime;
    }

    public AnimeResponse entityToResponse(Anime anime) {
        return new AnimeResponse(
                anime.getId(),
                anime.getTitulo(),
                anime.getTemporada(),
                anime.getDescricao(),
                anime.getDataDeLancamento(),
                anime.getDataDeTermino(),
                anime.getStudio(),
                anime.getStatus(),
                anime.getGeneroList(),
                anime.getEpisodios(),
                anime.getSeasonal(),
                anime.getRank()
        );
    }
}
