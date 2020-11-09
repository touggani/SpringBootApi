package com.projet.voiture.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ADRESSE")
public class Adresse {

    private Long adresse_id;
    private String adresse;

    @ManyToOne
    @JoinColumn(name = "adresse_id", insertable = false, updatable = false)
    private Concessionaire concessionaire;

    public Adresse() {
    }

    public Adresse(Long id, String body) {
        this.adresse_id = id;
        this.adresse = body;
    }

    public Long getId() {
        return adresse_id;
    }
    public void setId(Long id) {
        this.adresse_id = id;
    }

    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }




    @Override
    public String toString() {
        return "Notes [id=" + adresse_id + ", body=" + adresse + "]";
    }
}

