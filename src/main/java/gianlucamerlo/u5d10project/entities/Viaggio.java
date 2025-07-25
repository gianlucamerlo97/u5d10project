package gianlucamerlo.u5d10project.entities;

import gianlucamerlo.u5d10project.enums.Stato;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalDate;

@Entity
@Table(name = "viaggi")
@Getter
@Setter
@NoArgsConstructor
public class Viaggio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;
    private String destinazione;
    private LocalDate data;
    private Stato stato;

    public Viaggio(String destinazione, Stato stato, LocalDate data) {
        this.destinazione = destinazione;
        this.stato = stato;
        this.data = data;
    }
}
