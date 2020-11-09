package com.projet.voiture.model;

import javax.persistence.*;

@Entity
@Table(name="VOITURE")
public class Voiture {

    private Long id;
    private String nom;

    @ManyToOne
    @JoinColumn(name = "voiture_id")
    private Marque marque;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public Voiture() {
    }

    public Voiture(Long id, Marque marque, Client client) {
        this.id = id;
        this.marque = marque;
        this.client = client;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) { this.nom = nom; }

    public Marque getMarque() {
        return marque;
    }
    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public Client getClientId() { return client; }
    public void setClientId(Long client) {
        this.id = client;
    }

    @Override
    public String toString() {
        return "Voiture [id=" + id + ", marque=" + marque + "]";
    }
}

