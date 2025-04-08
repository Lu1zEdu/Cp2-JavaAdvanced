package cp2.fiap.com.br.Cp2_JavaAdvanced.models;

import cp2.fiap.com.br.Cp2_JavaAdvanced.models.Enum.StatusAnime;
import cp2.fiap.com.br.Cp2_JavaAdvanced.models.Enum.TypeStudio;
import cp2.fiap.com.br.Cp2_JavaAdvanced.models.Enum.TypeGenero;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;


import java.time.LocalDate;
import java.util.List;

@Entity
public class Anime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private int Temporada;

    @Size(min = 3,max = 200)
    @NotBlank
    private String Titulo;
    @Size(min = 2,max = 3000)
    @NotBlank
    private String descricao;

    @NotNull
    private LocalDate DataDeLançamento;
    @NotNull
    private LocalDate DataDeTermino;

    @NotNull
    @Enumerated(EnumType.STRING)
    private TypeStudio studio;
    @NotNull
    @Enumerated(EnumType.STRING)
    private StatusAnime status;

    @NotNull
    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private List<TypeGenero> generoList;

    @NotNull
    @Embedded
    private Episodios episodios;

    @NotNull
    @Embedded
    private Season seasonal;

    @NotNull
    @Embedded
    private Rank rank;

    public Anime() {
    }

    public Anime(Long id, int temporada, String titulo, String descricao, LocalDate dataDeLançamento, LocalDate dataDeTermino, TypeStudio studio, StatusAnime status, List<TypeGenero> generoList, Episodios episodios, Season seasonal, Rank rank) {
        this.id = id;
        Temporada = temporada;
        Titulo = titulo;
        this.descricao = descricao;
        DataDeLançamento = dataDeLançamento;
        DataDeTermino = dataDeTermino;
        this.studio = studio;
        this.status = status;
        this.generoList = generoList;
        this.episodios = episodios;
        this.seasonal = seasonal;
        this.rank = rank;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTemporada() {
        return Temporada;
    }

    public void setTemporada(int temporada) {
        Temporada = temporada;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataDeLançamento() {
        return DataDeLançamento;
    }

    public void setDataDeLançamento(LocalDate dataDeLançamento) {
        DataDeLançamento = dataDeLançamento;
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
