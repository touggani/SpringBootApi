package com.projet.voiture.controller;


import com.projet.voiture.model.Marque;
import com.projet.voiture.repository.MarqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MarqueController {
    @Autowired
    MarqueRepository marqueRepo;

    @GetMapping("/api/adresse")
    //@ResponseBody
    public List<Marque> getAll() {
        return marqueRepo.getAllMarque();
    }
}
