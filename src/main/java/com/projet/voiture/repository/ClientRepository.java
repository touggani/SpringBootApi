package com.projet.voiture.repository;

import com.projet.voiture.model.Adresse;
import com.projet.voiture.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class ClientRepository {

    @PersistenceContext
    private EntityManager em;

    @Autowired
    JdbcTemplate template;

    /* Getting all */
    public List<Client> getAllClient() {
        List<Client> items = (List<Client>) template.queryForObject("SELECT * FROM Client", (result,
                    rowNum) -> new Adresse(result.getLong("id"), result.getString("nom")));
        return items;

    }
}
