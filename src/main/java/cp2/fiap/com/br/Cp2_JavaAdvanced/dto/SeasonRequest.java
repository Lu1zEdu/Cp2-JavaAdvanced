package cp2.fiap.com.br.Cp2_JavaAdvanced.dto;

import cp2.fiap.com.br.Cp2_JavaAdvanced.models.Anime;
import cp2.fiap.com.br.Cp2_JavaAdvanced.models.Enum.TypeSeason;

import java.util.List;

public class SeasonRequest {

    private int ano;
    private TypeSeason typeSeason;

    private List<Anime> animeList;

}
