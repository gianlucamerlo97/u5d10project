package gianlucamerlo.u5d10project.repositories;

import gianlucamerlo.u5d10project.entities.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DipendentiRepository extends JpaRepository<Dipendente,Long> {
}
