package fiap.com.br.cp2.models;

import jakarta.persistence.*;


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

    private TypeGenero genero;
    private TypeSeason typeSeason;
    private TypeStudio typeStudio;
    private StatusAnime statusAnime;

    @OneToOne
    private Episodios episodios;
    @OneToOne
    private Rank rank;

    public Anime(Long id, int temporada, String titulo, String descricao, LocalDate dataDeLancamento, LocalDate dataDeTermino, TypeGenero genero, TypeSeason typeSeason, TypeStudio typeStudio, StatusAnime statusAnime, Episodios episodios, Rank rank) {
        Id = id;
        Temporada = temporada;
        Titulo = titulo;
        this.descricao = descricao;
        DataDeLancamento = dataDeLancamento;
        DataDeTermino = dataDeTermino;
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
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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
}
