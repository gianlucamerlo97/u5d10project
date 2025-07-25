package gianlucamerlo.u5d10project.services;

import gianlucamerlo.u5d10project.repositories.ViaggiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViaggiService {
    @Autowired
    ViaggiRepository viaggiRepository;
}
