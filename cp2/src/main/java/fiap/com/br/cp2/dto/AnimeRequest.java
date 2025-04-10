package fiap.com.br.cp2.dto;

import fiap.com.br.cp2.models.StatusAnime;
import fiap.com.br.cp2.models.TypeGenero;
import fiap.com.br.cp2.models.TypeSeason;
import fiap.com.br.cp2.models.TypeStudio;
import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.util.List;

public class AnimeRequest {

    @NotBlank(message = "O Titulo é obrigatório")
    @Size(min = 3, max = 250, message = "O nome deve ter entre 3 e 150 caracteres")
    private String Titulo;

    @Max(value = 100,message = "A quantidade máxima de temporadas é de 100")
    @Min(value = 1,message = "A quantidade mínima de temporadas é 1")
    private int Temporada;

    @Size(min = 2,max = 3000, message = "A descrição deve ter no mínimo 2 caracteres e no máximo 3000")
    @NotBlank(message = "A descrição é obrigatória")
    private String Descricao;

    @Past(message = "A data inserida deve estar no passado")
    @NotNull(message = "A data de lançamento é obrigatória")
    private LocalDate DataDeLancamento;

    @PastOrPresent(message = "A data inserida deve estar no passado ou presente")
    @NotNull(message = "A data de termino é obrigatória")
    private LocalDate DataDeTermino;

    @NotNull(message = "O estúdio é obrigatório")
    private TypeStudio Studio;

    @NotNull(message = "O status do anime é obrigatório")
    private StatusAnime Status;

    @NotNull(message = "O genero do anime é obrigatório")
    private TypeGenero Genero;

    @NotNull(message = "O genero do anime é obrigatório")
    private TypeSeason TypeSeason;

    @NotNull(message = "O rank do anime é obrigatório")
    private RankRequest Rank;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getTemporada() {
        return Temporada;
    }

    public void setTemporada(int temporada) {
        Temporada = temporada;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public LocalDate getDataDeLancamento() {
        return DataDeLancamento;
    }

    public void setDataDeLancamento(LocalDate dataDeLancamento) {
        DataDeLancamento = dataDeLancamento;
    }

    public LocalDate getDataDeTermino() {
        return DataDeTermino;
    }

    public void setDataDeTermino(LocalDate dataDeTermino) {
        DataDeTermino = dataDeTermino;
    }

    public TypeStudio getStudio() {
        return Studio;
    }

    public void setStudio(TypeStudio studio) {
        Studio = studio;
    }

    public StatusAnime getStatus() {
        return Status;
    }

    public void setStatus(StatusAnime status) {
        Status = status;
    }

    public TypeGenero getGenero() {
        return Genero;
    }

    public void setGenero(TypeGenero genero) {
        Genero = genero;
    }

    public fiap.com.br.cp2.models.TypeSeason getTypeSeason() {
        return TypeSeason;
    }

    public void setTypeSeason(fiap.com.br.cp2.models.TypeSeason typeSeason) {
        TypeSeason = typeSeason;
    }

    public RankRequest getRank() {
        return Rank;
    }

    public void setRank(RankRequest rank) {
        Rank = rank;
    }
}
