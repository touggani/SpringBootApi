package com.projet.voiture.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="CLIENT")
public class Client {
    private Long client_id;
    private String nom;

    @OneToMany
    @JoinColumn(name = "client_id")
    private Set<Voiture> listeVoiture = new HashSet<Voiture>();

    public Client() {
    }

    public Client(Long id, String nom) {
        this.client_id = id;
        this.nom = nom;
    }

    public Long getId() {
        return client_id;
    }
    public void setId(Long id) {
        this.client_id = id;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) { this.nom = nom; }

    public Set<Voiture> getConcessionaire() {
        return listeVoiture;
    }
    public void setListeVoiture(Set<Voiture> listeVoiture) { this.listeVoiture = listeVoiture; }

    @Override
    public String toString() {
        return "Notes [id=" + client_id + ", body=" + nom + "]";
    }
}
