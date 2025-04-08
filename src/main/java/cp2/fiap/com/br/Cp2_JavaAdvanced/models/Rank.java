package cp2.fiap.com.br.Cp2_JavaAdvanced.models;

import jakarta.persistence.Embeddable;

@Embeddable
public class Rank {
    private int NotaGeral;
    private int NotaUsuario;
    private String Comentario;

    public int getNotaGeral() {
        return NotaGeral;
    }

    public void setNotaGeral(int notaGeral) {
        NotaGeral = notaGeral;
    }

    public int getNotaUsuario() {
        return NotaUsuario;
    }

    public void setNotaUsuario(int notaUsuario) {
        NotaUsuario = notaUsuario;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String comentario) {
        Comentario = comentario;
    }
}
