package api.inventauto.service;

import api.inventauto.model.Phase;
import api.inventauto.repository.PhaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class PhaseService {

    @Autowired
    private PhaseRepository _phaseRepository;

    public List<Phase> getAllPhases() {
        return _phaseRepository.findAll();
    }

    public Phase getPhaseById(UUID id) {
        return _phaseRepository.findById(id).orElse(null);
    }
}
