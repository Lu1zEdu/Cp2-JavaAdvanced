package cp2.fiap.com.br.Cp2_JavaAdvanced.models;

import jakarta.persistence.Embeddable;

@Embeddable
public class Episodios {
    private int Quantidade;
    private int Minutos;

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
