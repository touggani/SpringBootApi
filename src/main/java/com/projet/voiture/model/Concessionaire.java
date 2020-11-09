package com.projet.voiture.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name="CONCESSIONAIRE")
public class Concessionaire {

    private Long concessionaire_id;
    private String nom;

    @OneToMany
    @JoinColumn(name = "adresse_id")
    private Set<Adresse> listeAdresse = new HashSet<Adresse>();

    @ManyToMany(mappedBy = "marque_id")
    private Set<Marque> listeMarque = new HashSet<Marque>();

    public Concessionaire() {
    }

    public Concessionaire(Long id, String nom, Set<Adresse> adresse, Set<Marque> marque) {
        this.concessionaire_id = id;
        this.nom = nom;
        this.listeAdresse = adresse;
        this.listeMarque = marque;
    }

    public Long getId() {
        return concessionaire_id;
    }
    public void setId(Long id) {
        this.concessionaire_id = id;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public Set<Adresse> getListeAdresse() { return listeAdresse; }
    public void setAdresse(Set<Adresse> adresse) {
        this.listeAdresse = adresse;
    }

    public Set<Marque> getListeMarque() {
        return listeMarque;
    }
    public void setMarque(Set<Marque> marque) {
        this.listeMarque = marque;
    }

    @Override
    public String toString() {
        return "Notes [id=" + concessionaire_id + ", nom=" + nom + ", adresse=" + listeAdresse +"]";
    }
}
