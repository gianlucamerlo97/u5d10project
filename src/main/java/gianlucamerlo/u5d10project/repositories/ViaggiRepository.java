package gianlucamerlo.u5d10project.repositories;

import gianlucamerlo.u5d10project.entities.Viaggio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViaggiRepository extends JpaRepository<Viaggio,Long> {
}
