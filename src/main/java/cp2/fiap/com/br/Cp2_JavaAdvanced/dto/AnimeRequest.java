package cp2.fiap.com.br.Cp2_JavaAdvanced.dto;

import cp2.fiap.com.br.Cp2_JavaAdvanced.models.Enum.StatusAnime;
import cp2.fiap.com.br.Cp2_JavaAdvanced.models.Enum.TypeGenero;
import cp2.fiap.com.br.Cp2_JavaAdvanced.models.Enum.TypeStudio;
import cp2.fiap.com.br.Cp2_JavaAdvanced.models.Episodios;
import cp2.fiap.com.br.Cp2_JavaAdvanced.models.Rank;
import cp2.fiap.com.br.Cp2_JavaAdvanced.models.Season;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.List;

public class AnimeRequest {

    @NotBlank(message = "O Titulo é obrigatório")
    @Size(min = 3, max = 250, message = "O nome deve ter entre 3 e 150 caracteres")
    @Column(name = "titulo", nullable = false, length = 255)
    private String Titulo;
    @Max(value = 100,message = "A quantidade máxima de temporadas é de 100")
    @Min(value = 1,message = "A quantidade mínima de temporadas é 1")
    @NotBlank(message = "A quantidades de temporadas é obrigatório")
    private int Temporada;
    @Size(min = 2,max = 3000, message = "A descrição deve ter no mínimo 2 caracteres e no máximo 3000")
    @NotBlank(message = "A descrição é obrigatória")
    private String descricao;
    @Past(message = "A data inserida deve estar no passado")
    @NotBlank(message = "A data de lançamento é obrigatória")
    private LocalDate DataDeLancamento;
    @PastOrPresent(message = "A data inserida deve estar no passado ou presente")
    @NotNull(message = "A data de termino é obrigatória")
    private LocalDate DataDeTermino;
    @NotNull(message = "O estúdio é obrigatório")
    private TypeStudio studio;
    @NotNull(message = "O status do anime é obrigatório")
    private StatusAnime status;
    @NotNull(message = "O genero do anime é obrigatório")
    private List<TypeGenero> generoList;
    @NotNull(message = "Os episódios são obrigatório")
    private Episodios episodios;
    @NotNull(message = "A season do anime é obrigatória")
    private Season seasonal;
    @NotNull(message = "O do anime é obrigatório obrigatório")
    private Rank rank;


    public AnimeRequest() {
    }

    public AnimeRequest(String titulo, int temporada, String descricao, LocalDate dataDeLancamento, LocalDate dataDeTermino, TypeStudio studio, StatusAnime status, List<TypeGenero> generoList, Episodios episodios, Season seasonal, Rank rank) {
        this.Titulo = titulo;
        this.Temporada = temporada;
        this.descricao = descricao;
        this.DataDeLancamento = dataDeLancamento;
        this.DataDeTermino = dataDeTermino;
        this.studio = studio;
        this.status = status;
        this.generoList = generoList;
        this.episodios = episodios;
        this.seasonal = seasonal;
        this.rank = rank;
    }

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
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
        return studio;
    }

    public void setStudio(TypeStudio studio) {
        this.studio = studio;
    }

    public StatusAnime getStatus() {
        return status;
    }

    public void setStatus(StatusAnime status) {
        this.status = status;
    }

    public List<TypeGenero> getGeneroList() {
        return generoList;
    }

    public void setGeneroList(List<TypeGenero> generoList) {
        this.generoList = generoList;
    }

    public Episodios getEpisodios() {
        return episodios;
    }

    public void setEpisodios(Episodios episodios) {
        this.episodios = episodios;
    }

    public Season getSeasonal() {
        return seasonal;
    }

    public void setSeasonal(Season seasonal) {
        this.seasonal = seasonal;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }
}
