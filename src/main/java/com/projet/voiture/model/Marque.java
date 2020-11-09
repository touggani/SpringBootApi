package com.projet.voiture.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.persistence.Id;

@Entity
@Table(name="MARQUE")
public class Marque {

    @Id
    private Long voiture_id;
    private String nom;

    @OneToMany
    @JoinColumn(name = "voiture_id")
    private Set<Voiture> listeVoiture = new HashSet <Voiture>();

    @ManyToMany(mappedBy = "marque_id")
    private Set<Concessionaire> listeConcessionaire = new HashSet <Concessionaire>();

    public Marque() {
    }

    public Marque(Long id, String nom, Set<Voiture> ListeVoiture, Set<Concessionaire> concessionaire) {
        this.voiture_id = id;
        this.nom = nom;
        this.listeVoiture = ListeVoiture;
        this.listeConcessionaire = concessionaire;
    }

    public Long getId() {
        return voiture_id;
    }
    public void setId(Long id) {
        this.voiture_id = id;
    }

    public String getBody() {
        return nom;
    }
    public void setBody(String nom) { this.nom = nom; }

    public Set<Concessionaire> getConcessionaire() {
        return listeConcessionaire;
    }
    public void setConcessionaire(Concessionaire ListeConcessionaire) { this.listeConcessionaire = listeConcessionaire; }

    public Set<Voiture> getVoiture() {
        return listeVoiture;
    }
    public void setListeVoiture(Set<Voiture> voiture) {
        this.listeVoiture = voiture;
    }

    @Override
    public String toString() {
        return "Marque [id=" + voiture_id + ", nom=" + nom + "]";
    }
}
