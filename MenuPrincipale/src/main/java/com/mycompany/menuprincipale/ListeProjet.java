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

public class ListeProjet {
    private List<Projet> projets;
    public ListeProjet() {
        projets = new ArrayList<>();
    }
    // Method to add a project to the list
    public void ajouterProjet(Projet projet) {
        projets.add(projet);
    }
    // Method to display all projects
    public void afficherProjets() {
        System.out.println("Liste des projets en cours:");
        for (Projet projet : projets) {
            System.out.println(projet); // Assuming Projet has a toString() method
        }
    }
}
