package gianlucamerlo.u5d10project.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "dipendenti")
@Getter
@Setter
@NoArgsConstructor
public class Dipendente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;
    private String username;
    private String nome;
    private String cognome;
    private String email;

    public Dipendente(String username, String cognome, String nome, String email) {
        this.username = username;
        this.cognome = cognome;
        this.nome = nome;
        this.email = email;
    }
}
