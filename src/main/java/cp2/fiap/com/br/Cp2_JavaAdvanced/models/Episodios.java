package cp2.fiap.com.br.Cp2_JavaAdvanced.models;

import jakarta.persistence.*;

@Entity
public class Episodios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int Quantidade;
    private int Minutos;

    public Episodios(Long id, int quantidade, int minutos) {
        this.id = id;
        Quantidade = quantidade;
        Minutos = minutos;
    }

    public Episodios() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int quantidade) {
        Quantidade = quantidade;
    }

    public int getMinutos() {
        return Minutos;
    }

    public void setMinutos(int minutos) {
        Minutos = minutos;
    }
}
