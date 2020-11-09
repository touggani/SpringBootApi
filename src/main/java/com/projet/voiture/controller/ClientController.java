package com.projet.voiture.controller;

import com.projet.voiture.model.Client;
import com.projet.voiture.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class ClientController {
    @Autowired
    ClientRepository clientRepo;

    @GetMapping("/api/client")
    @ResponseBody
    public List<Client> getAll() {
        return clientRepo.getAllClient();
    }
}
