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

public class Inventaire {
    private List<Materiau> materiaux;

    // Constructeur par défaut
    public Inventaire() {
        materiaux = new ArrayList<>();
        initialiserMateriaux();
    }

    // Méthode pour initialiser la liste des matériaux
    private void initialiserMateriaux() {
        materiaux.add(new Materiau("béton", 100.0, 50));
        materiaux.add(new Materiau("acier", 150.0, 30));
        materiaux.add(new Materiau("bois", 80.0, 100));
        materiaux.add(new Materiau("verre", 200.0, 20));
        materiaux.add(new Materiau("fer", 120.0, 40));
    }

    // Méthode pour ajouter un matériau
    public void ajouterMateriau(Materiau materiau) {
        materiaux.add(materiau);
    }

    // Méthode pour afficher l'inventaire
    public void afficherInventaire() {
        System.out.println("Inventaire des matériaux:");
        for (Materiau materiau : materiaux) {
            System.out.println(materiau);
        }
    }

    // Méthode pour rechercher un matériau par nom
    public Materiau rechercherMateriau(String nom) {
        for (Materiau materiau : materiaux) {
            if (materiau.getNom().equalsIgnoreCase(nom)) {
                return materiau;
            }
        }
        return null; // Retourne null si le matériau n'est pas trouvé
    }
}