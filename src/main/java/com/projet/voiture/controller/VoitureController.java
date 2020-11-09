package com.projet.voiture.controller;

import com.projet.voiture.model.Voiture;
import com.projet.voiture.repository.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class VoitureController {
    @Autowired
    VoitureRepository voitureRepo;

    @GetMapping("/api/voiture")
    //@ResponseBody
    public List<Voiture> getAll() {
        return voitureRepo.getAllVoiture();
    }
}
