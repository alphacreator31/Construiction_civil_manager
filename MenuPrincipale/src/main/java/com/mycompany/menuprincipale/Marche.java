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



public class Marche {
    private List<Ressource> marchandises;

    public Marche() {
        marchandises = new ArrayList<>();
        marchandises.add(new Ressource("béton", 100.0, 50));
        marchandises.add(new Ressource("acier", 150.0, 30));
        marchandises.add(new Ressource("bois", 80.0, 100));
        marchandises.add(new Ressource("verre", 200.0, 20));
        marchandises.add(new Ressource("fer", 120.0, 40));
        marchandises.add(new Ressource("ciment", 170.0, 80));
    }

    public void consulterMarche() {
        System.out.println("Marché des matériaux disponibles:");
        for (Ressource marchandise : marchandises) {
            System.out.println(marchandise);
        }
    }

    public void acheterMarchandise(String nom, int quantite) {
        Ressource ressource = rechercherRessource(nom);

        if (ressource == null) {
            System.out.println("La ressource demandée n'existe pas sur le marché.");
            return;
        }

        if (ressource.getQuantite() < quantite) {
            System.out.println("Quantité demandée dépasse la quantité disponible. Quantité disponible : " + ressource.getQuantite());
            return;
        }

        // Réduire la quantité de la ressource
        int nouvelleQuantite = ressource.getQuantite() - quantite;
        ressource.setQuantite(nouvelleQuantite);

        double montantTotal = quantite * ressource.getPrix();
        System.out.println("Achat réussi !");
        System.out.println("Ressource achetée : " + ressource.getNom());
        System.out.println("Quantité achetée : " + quantite);
        System.out.println("Montant total : " + montantTotal);
    }

    public Ressource rechercherRessource(String nom) {
        for (Ressource ressource : marchandises) {
            if (ressource.getNom().equalsIgnoreCase(nom)) {
                return ressource;
            }
        }
        return null; // Retourne null si la ressource n'est pas trouvée
    }
}