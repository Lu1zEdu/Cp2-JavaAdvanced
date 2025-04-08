package cp2.fiap.com.br.Cp2_JavaAdvanced.dto;

import cp2.fiap.com.br.Cp2_JavaAdvanced.models.Enum.StatusAnime;
import cp2.fiap.com.br.Cp2_JavaAdvanced.models.Enum.TypeGenero;
import cp2.fiap.com.br.Cp2_JavaAdvanced.models.Enum.TypeStudio;
import cp2.fiap.com.br.Cp2_JavaAdvanced.models.Episodios;
import cp2.fiap.com.br.Cp2_JavaAdvanced.models.Rank;
import cp2.fiap.com.br.Cp2_JavaAdvanced.models.Season;

import java.time.LocalDate;
import java.util.List;

public record AnimeResponse(Long id, String titulo, int temporada, String descricao, LocalDate dataDeLancamento, LocalDate dataDeTermino, TypeStudio studio, StatusAnime status, List<TypeGenero> generoList, Episodios episodios, Season seasonal, Rank rank) {
}
