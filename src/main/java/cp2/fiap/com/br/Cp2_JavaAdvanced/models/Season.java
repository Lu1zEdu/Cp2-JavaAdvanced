package cp2.fiap.com.br.Cp2_JavaAdvanced.models;

import cp2.fiap.com.br.Cp2_JavaAdvanced.models.Enum.TypeSeason;
import jakarta.persistence.*;

import java.lang.reflect.Type;
import java.util.List;

@Entity
public class Season {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private int Ano;
    @Enumerated(EnumType.STRING)
    private TypeSeason TypeSeason;

    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private List<Anime> AnimeList;

    public Season(){

    }

    public Season(Long id, int ano, TypeSeason typeSeason, List<Anime> animeList) {
        this.Id = id;
        Ano = ano;
        TypeSeason = typeSeason;
        AnimeList = animeList;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int ano) {
        Ano = ano;
    }

    public TypeSeason getTypeSeason() {
        return TypeSeason;
    }

    public void setTypeSeason(TypeSeason typeSeason) {
        TypeSeason = typeSeason;
    }

    public List<Anime> getAnimeList() {
        return AnimeList;
    }

    public void setAnimeList(List<Anime> animeList) {
        AnimeList = animeList;
    }
}
