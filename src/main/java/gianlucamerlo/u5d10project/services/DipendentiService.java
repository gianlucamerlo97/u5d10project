package gianlucamerlo.u5d10project.services;

import gianlucamerlo.u5d10project.repositories.DipendentiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DipendentiService {
    @Autowired
    DipendentiRepository dipendentiRepository;
}
