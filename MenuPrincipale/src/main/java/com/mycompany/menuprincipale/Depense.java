/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menuprincipale;

/**
 *
 * @author gwendoline.de-sa.26
 */

import java.util.ArrayList;
import java.util.List;

public class Depense {
    // Attributs de la classe
    private String type; // Type de dépense : "salaire" ou "ressource"
    private double montant; // Montant de la dépense
    private String description; // Description de la dépense

    // Constructeur pour initialiser une dépense
    public Depense(String type, double montant, String description) {
        if (!type.equals("salaire") && !type.equals("ressource")) {
            throw new IllegalArgumentException("Le type de dépense doit être 'salaire' ou 'ressource'.");
        }
        this.type = type;
        this.montant = montant;
        this.description = description;
    }

    // Méthode pour obtenir le type de dépense
    public String getType() {
        return type;
    }

    // Méthode pour obtenir le montant de la dépense
    public double getMontant() {
        return montant;
    }

    // Méthode pour obtenir la description de la dépense
    public String getDescription() {
        return description;
    }

    // Méthode pour afficher les détails de la dépense
    @Override
    public String toString() {
        return String.format("Type: %s, Montant: %.2f, Description: %s", type, montant, description);
    }
    
    public static void main(String[] args) {
        // Liste des dépenses
        List<Depense> depenses = new ArrayList<>();
        
        // Ajouter des dépenses pour les salaires
        depenses.add(new Depense("salaire", 5000.00, "Salaire de l'équipe de construction"));
        depenses.add(new Depense("salaire", 3000.00, "Salaire de l'équipe d'architecture"));
        
        // Ajouter des dépenses pour les ressources
        depenses.add(new Depense("ressource", 1500.00, "Achat de béton"));
        depenses.add(new Depense("ressource", 1200.00, "Achat de matériaux de finition"));
        
        // Afficher toutes les dépenses
        for (Depense depense : depenses) {
            System.out.println(depense);
        }
    }
}
