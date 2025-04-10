package fiap.com.br.cp2.dto;

import fiap.com.br.cp2.models.StatusAnime;
import fiap.com.br.cp2.models.TypeGenero;
import fiap.com.br.cp2.models.TypeSeason;
import fiap.com.br.cp2.models.TypeStudio;

import java.time.LocalDate;
import java.util.List;

public record AnimeResponse(Long id, String titulo, int temporada, String descricao, LocalDate dataDeLancamento, LocalDate dataDeTermino, TypeStudio studio, StatusAnime status, TypeGenero genero, TypeSeason typeSeason) {
}
