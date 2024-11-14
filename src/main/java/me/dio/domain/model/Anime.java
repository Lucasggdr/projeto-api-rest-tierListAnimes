import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Anime {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String categoria;

    public Anime(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    // Getters and Setters
}
