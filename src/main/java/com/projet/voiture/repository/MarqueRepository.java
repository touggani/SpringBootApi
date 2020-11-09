package com.projet.voiture.repository;

import com.projet.voiture.model.Adresse;
import com.projet.voiture.model.Marque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class MarqueRepository {
    @PersistenceContext
    private EntityManager em;

    @Autowired
    JdbcTemplate template;

    /* Getting all */
    public List<Marque> getAllMarque() {
        List<Marque> items = (List<Marque>) template.queryForObject("SELECT * FROM Marque", (result,
                   rowNum) -> new Adresse(result.getLong("id"), result.getString("nom")));
        return items;

    }
}
