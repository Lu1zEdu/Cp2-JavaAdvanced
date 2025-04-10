package fiap.com.br.cp2.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class RankRequest {
    @Min(value = 1, message = "A nota deve ser no mínimo 1")
    @Max(value = 5, message = "A nota deve ser no máximo 5")
    private int NotaGeral;
    @Min(value = 1, message = "A nota deve ser no mínimo 1")
    @Max(value = 5, message = "A nota deve ser no máximo 5")
    private int NotaUsuario;
    @Size(min = 2,max = 2000,message = "Deve ter no mínimo 2 e no máximo 2000 caracteres")
    @NotBlank(message = "O comentário é obrigatória")
    private String Comentario;

    public RankRequest(int notaGeral, int notaUsuario, String comentario) {
        NotaGeral = notaGeral;
        NotaUsuario = notaUsuario;
        Comentario = comentario;
    }

    public RankRequest() {
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
