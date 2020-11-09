package com.projet.voiture.repository;

import com.projet.voiture.model.Adresse;
import com.projet.voiture.model.Concessionaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ConcessionaireRepository {
    @PersistenceContext
    private EntityManager em;

    @Autowired
    JdbcTemplate template;

    /* Getting all */
    public List<Concessionaire> getAllConcessionaire() {
        List<Concessionaire> items = (List<Concessionaire>) template.queryForObject("SELECT * FROM Concessionaire", (result,
                  rowNum) -> new Adresse(result.getLong("id"), result.getString("adresse")));
        return items;

    }
}
