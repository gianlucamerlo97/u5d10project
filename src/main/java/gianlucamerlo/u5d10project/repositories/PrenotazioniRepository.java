package gianlucamerlo.u5d10project.repositories;

import gianlucamerlo.u5d10project.entities.Dipendente;
import gianlucamerlo.u5d10project.entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface PrenotazioniRepository extends JpaRepository<Prenotazione,Long> {
    boolean existsByDipendenteAndDataRichiesta(Dipendente dipendente, LocalDate dataRichiesta);

}
