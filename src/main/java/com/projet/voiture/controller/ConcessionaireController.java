package com.projet.voiture.controller;

import com.projet.voiture.model.Concessionaire;
import com.projet.voiture.repository.ConcessionaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class ConcessionaireController {
    @Autowired
    ConcessionaireRepository concessionaireRepo;

    //@GetMapping("/api/concessionaire")
    @RequestMapping("/api/concessionaire")
    @ResponseBody
    public List<Concessionaire> getAllConcessionaire() {
        return concessionaireRepo.getAllConcessionaire();
    }
}
