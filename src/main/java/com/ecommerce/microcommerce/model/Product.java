package com.ecommerce.microcommerce.model;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
/*
// === Filtrage dynamique ===
// @JsonFilter("monFiltreDynamique")
*/

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Length(min=3, max=20)
    private String nom;

    @Min(value=1)
    private int prix;

    private int prixAchat; // valeur a ne pas exposer
    // === FIltrage sttaique ===
    // @JsonIgnore : au dessus du champ a ignorer
    // autre maniere de le faire : @JsonIgnoreProperties(value = {"prixAchat", "id"})

    // constgructeur sans argument
    public Product() {
    }

    // constratcuteur pour les tests
    public Product(/*int id, */
            String nom, int prix, int prixAchat) {
        // this.id = id;
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

    public void setId(Long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Long getId() {
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
