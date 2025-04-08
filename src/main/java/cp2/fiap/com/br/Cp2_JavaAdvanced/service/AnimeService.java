package cp2.fiap.com.br.Cp2_JavaAdvanced.service;

import cp2.fiap.com.br.Cp2_JavaAdvanced.dto.AnimeResponse;
import cp2.fiap.com.br.Cp2_JavaAdvanced.models.Anime;
import cp2.fiap.com.br.Cp2_JavaAdvanced.repository.AnimeRepository;

import java.util.ArrayList;
import java.util.List;

public class AnimeService {
    private final AnimeRepository animeRepository;

    public AnimeService(AnimeRepository animeRepository){
        this.animeRepository = animeRepository;
    }

    public List<AnimeResponse> animeToResponses(List<Anime> animes) {
        List<AnimeResponse> animeResponses = new ArrayList<>();
        for (Anime anime : animes) {
            animeResponses.add(animeToResponse(anime));
        }
        return animeResponses;
    }

    public AnimeResponse animeToResponse(Anime anime) {
        return new AnimeResponse(
                anime.getId(),
                anime.getTitulo(),
                anime.getTemporada(),
                anime.getDescricao(),
                anime.getDataDeLançamento(),
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
