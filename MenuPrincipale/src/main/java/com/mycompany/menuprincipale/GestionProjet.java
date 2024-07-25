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

public class GestionProjet {
    // Liste statique pour stocker les projets
    private static List<Projet> projets = new ArrayList<>();

    // Méthode pour ajouter un projet
    public static void ajouterProjet(Projet projet) {
        projets.add(projet);
    }

    // Méthode pour afficher tous les projets
    public static void afficherProjets() {
        if (projets.isEmpty()) {
            System.out.println("Aucun projet en cours.");
        } else {
            System.out.println("Liste des projets créés :");
            for (Projet projet : projets) {
                System.out.println(projet);
            }
        }
    }
}
