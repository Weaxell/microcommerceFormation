package com.ecommerce.microcommerce.model;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;

// === Filtrage dynamique ===
@JsonFilter("monFiltreDynamique")
public class Product {
    private int id;
    private String nom;
    private int prix;

    private int prixAchat; // valeur a ne pas exposer
    // === FIltrage sttaique ===
    // @JsonIgnore : au dessus du champ a ignorer
    // autre maniere de le faire : @JsonIgnoreProperties(value = {"prixAchat", "id"})

    // constgructeur sans argument
    public Product() {
    }

    // constratcuteur pour les tests
    public Product(int id, String nom, int prix, int prixAchat) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.prixAchat = prixAchat;
    }

    public int getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(int prixAchat) {
        this.prixAchat = prixAchat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getPrix() {
        return prix;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                '}';
    }
}
