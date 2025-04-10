package fiap.com.br.cp2.models;

import jakarta.persistence.*;


import java.time.LocalDate;
import java.util.List;

@Entity
public class Anime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int temporada;

    private String titulo;
    private String descricao;

    private LocalDate dataDeLancamento;
    private LocalDate dataDeTermino;

    private TypeGenero genero;
    private TypeSeason typeSeason;
    private TypeStudio typeStudio;
    private StatusAnime statusAnime;

    @OneToOne
    private Episodios episodios;
    @OneToOne
    private Rank rank;

    public Anime(Long id, int temporada, String titulo, String descricao, LocalDate dataDeLancamento, LocalDate dataDeTermino, TypeGenero genero, TypeSeason typeSeason, TypeStudio typeStudio, StatusAnime statusAnime, Episodios episodios, Rank rank) {
        this.id = id;
        this.temporada = temporada;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataDeLancamento = dataDeLancamento;
        this.dataDeTermino = dataDeTermino;
        this.genero = genero;
        this.typeSeason = typeSeason;
        this.typeStudio = typeStudio;
        this.statusAnime = statusAnime;
        this.episodios = episodios;
        this.rank = rank;
    }

    public Anime() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataDeLancamento() {
        return dataDeLancamento;
    }

    public void setDataDeLancamento(LocalDate dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

    public LocalDate getDataDeTermino() {
        return dataDeTermino;
    }

    public void setDataDeTermino(LocalDate dataDeTermino) {
        this.dataDeTermino = dataDeTermino;
    }

    public TypeGenero getGenero() {
        return genero;
    }

    public void setGenero(TypeGenero genero) {
        this.genero = genero;
    }

    public TypeSeason getTypeSeason() {
        return typeSeason;
    }

    public void setTypeSeason(TypeSeason typeSeason) {
        this.typeSeason = typeSeason;
    }

    public TypeStudio getTypeStudio() {
        return typeStudio;
    }

    public void setTypeStudio(TypeStudio typeStudio) {
        this.typeStudio = typeStudio;
    }

    public StatusAnime getStatusAnime() {
        return statusAnime;
    }

    public void setStatusAnime(StatusAnime statusAnime) {
        this.statusAnime = statusAnime;
    }

    public Episodios getEpisodios() {
        return episodios;
    }

    public void setEpisodios(Episodios episodios) {
        this.episodios = episodios;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }
}
