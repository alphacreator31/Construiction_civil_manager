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

class GestionEquipe {
    // Liste statique pour stocker les projets
    private static List<Equipe> equipes = new ArrayList<>();

    // Méthode pour ajouter un projet
    public static void ajouterEquipe(Equipe equipe) {
        equipes.add(equipe);
    }

    // Méthode pour afficher tous les projets
    public static void afficherEquipes() {
            if (equipes.isEmpty()) {
            System.out.println("Aucune équipe.");
        } else {
            System.out.println("Liste des équipes créées :");
            for (Equipe equipe : equipes) {
                System.out.println(equipe);
            }
        }
    }
}


