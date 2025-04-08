package cp2.fiap.com.br.Cp2_JavaAdvanced.dto;

import cp2.fiap.com.br.Cp2_JavaAdvanced.models.Enum.StatusAnime;
import cp2.fiap.com.br.Cp2_JavaAdvanced.models.Enum.TypeGenero;
import cp2.fiap.com.br.Cp2_JavaAdvanced.models.Enum.TypeStudio;
import cp2.fiap.com.br.Cp2_JavaAdvanced.models.Episodios;
import cp2.fiap.com.br.Cp2_JavaAdvanced.models.Rank;
import cp2.fiap.com.br.Cp2_JavaAdvanced.models.Season;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.List;

public class AnimeRequest {

    @NotBlank(message = "O Titulo é obrigatório")
    @Size(min = 3, max = 250, message = "O nome deve ter entre 3 e 150 caracteres")
    private String Titulo;
    private int Temporada;
    private String descricao;
    private LocalDate DataDeLançamento;
    private LocalDate DataDeTermino;
    private TypeStudio studio;
    private StatusAnime status;
    private List<TypeGenero> generoList;
    private Episodios episodios;
    private Season seasonal;
    private Rank rank;


    public AnimeRequest() {
    }

    public AnimeRequest(String titulo, int temporada, String descricao, LocalDate dataDeLançamento, LocalDate dataDeTermino, TypeStudio studio, StatusAnime status, List<TypeGenero> generoList, Episodios episodios, Season seasonal, Rank rank) {
        Titulo = titulo;
        Temporada = temporada;
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
