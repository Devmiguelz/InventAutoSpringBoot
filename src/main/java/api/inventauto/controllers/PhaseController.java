package api.inventauto.controllers;

import api.inventauto.model.Phase;
import api.inventauto.service.PhaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/phase")
public class PhaseController {

    @Autowired
    private PhaseService _phaseService;

    @GetMapping("/list")
    public List<Phase> getAllPhases() {
        return _phaseService.getAllPhases();
    }
}
