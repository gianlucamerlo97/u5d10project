package gianlucamerlo.u5d10project.services;

import gianlucamerlo.u5d10project.repositories.PrenotazioniRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrenotazioniService {
    @Autowired
    private PrenotazioniRepository prenotazioniRepository;
}
