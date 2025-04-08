package cp2.fiap.com.br.Cp2_JavaAdvanced.models;

import cp2.fiap.com.br.Cp2_JavaAdvanced.models.Enum.TypeSeason;
import jakarta.persistence.*;

import java.util.List;

@Embeddable
public class Season {
    private int ano;
    @Enumerated(EnumType.STRING)
    private TypeSeason typeSeason;

    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private List<Anime> animeList;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public TypeSeason getTypeSeason() {
        return typeSeason;
    }

    public void setTypeSeason(TypeSeason typeSeason) {
        this.typeSeason = typeSeason;
    }

    public List<Anime> getAnimeList() {
        return animeList;
    }

    public void setAnimeList(List<Anime> animeList) {
        this.animeList = animeList;
    }
}
