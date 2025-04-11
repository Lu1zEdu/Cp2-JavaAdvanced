package fiap.com.br.cp2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Rank {
    @Id
    private Long IdRank;
    private int NotaGeral;
    private int NotaUsuario;
    private String Comentario;


    public Rank(Long idRank, int notaGeral, int notaUsuario, String comentario) {
        IdRank = idRank;
        NotaGeral = notaGeral;
        NotaUsuario = notaUsuario;
        Comentario = comentario;
    }

    public Long getIdRank() {
        return IdRank;
    }

    public void setIdRank(Long idRank) {
        IdRank = idRank;
    }

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
