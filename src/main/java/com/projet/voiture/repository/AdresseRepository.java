package com.projet.voiture.repository;

import com.projet.voiture.model.Adresse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class AdresseRepository{

    @PersistenceContext
    private EntityManager em;

    @Autowired
    JdbcTemplate template;

    /* Getting all */
    public List<Adresse> getAllAdresse() {
        List<Adresse> items = (List<Adresse>) template.queryForObject("SELECT * FROM Adresse", (result,
                      rowNum) -> new Adresse(result.getLong("id"), result.getString("adresse")));
        return items;

    }


    /* Getting by id
    public Notes getNote(int search) {
        Notes items = template.queryForObject("SELECT * FROM NOTES WHERE ID=?", (result,
                rowNum) -> new Notes(result.getLong("id"), result.getString("body")),
                search);
        return items;
    }*/

    /* Adding into database table
    public int addNote(String body) {
        String query = "INSERT INTO NOTES (body) VALUES(?)";
        return template.update(query, body);
    }*/




}

