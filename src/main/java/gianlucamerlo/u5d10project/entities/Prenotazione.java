package gianlucamerlo.u5d10project.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "prenotazioni")
@Getter
@Setter
@NoArgsConstructor
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;

    @ManyToOne
    private Dipendente dipendente;

    @ManyToOne
    private Viaggio viaggio;

    private LocalDate dataRichiesta;


    private String note;

    public Prenotazione(Dipendente dipendente, Viaggio viaggio, LocalDate dataRichiesta, String note) {
        this.dipendente = dipendente;
        this.viaggio = viaggio;
        this.dataRichiesta = dataRichiesta;
        this.note = note;
    }
}
