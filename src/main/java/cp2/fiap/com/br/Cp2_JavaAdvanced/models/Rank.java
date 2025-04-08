package cp2.fiap.com.br.Cp2_JavaAdvanced.models;

import cp2.fiap.com.br.Cp2_JavaAdvanced.dto.RankRequest;
import jakarta.persistence.*;

@Entity
public class Rank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private int NotaGeral;
    private int NotaUsuario;
    private String Comentario;

    public Rank(){

    }

    public Rank(Long id, int notaGeral, int notaUsuario, String comentario) {
        Id = id;
        NotaGeral = notaGeral;
        NotaUsuario = notaUsuario;
        Comentario = comentario;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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
