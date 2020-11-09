package com.projet.voiture.repository;

import com.projet.voiture.model.Adresse;
import com.projet.voiture.model.Voiture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class VoitureRepository {
    @PersistenceContext
    private EntityManager em;

    @Autowired
    JdbcTemplate template;

    /* Getting all */
    public List<Voiture> getAllVoiture() {
        List<Voiture> items = (List<Voiture>) template.queryForObject("SELECT * FROM Adresse", (result,
                    rowNum) -> new Adresse(result.getLong("id"), result.getString("nom")));
        return items;

    }
}
