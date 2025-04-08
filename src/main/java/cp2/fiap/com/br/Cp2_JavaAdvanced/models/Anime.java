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
    private Long Id;

    private int Temporada;

    private String Titulo;
    private String descricao;

    private LocalDate DataDeLancamento;
    private LocalDate DataDeTermino;

    @Enumerated(EnumType.STRING)
    private TypeStudio studio;
    @Enumerated(EnumType.STRING)
    private StatusAnime status;

    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private List<TypeGenero> generoList;

    @OneToMany(mappedBy = "anime", cascade = CascadeType.ALL)
    private Episodios episodios;

    @OneToMany(mappedBy = "anime", cascade = CascadeType.ALL)
    private Season seasonal;

    @OneToMany(mappedBy = "anime", cascade = CascadeType.ALL)
    private Rank rank;

    public Anime() {
    }

    public Anime(int temporada, String titulo, String descricao, LocalDate dataDeLancamento,
                 LocalDate dataDeTermino, TypeStudio studio, StatusAnime status,
                 List<TypeGenero> generoList, Episodios episodios, Season seasonal, Rank rank) {
        this.Temporada = temporada;
        this.Titulo = titulo;
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

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
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
