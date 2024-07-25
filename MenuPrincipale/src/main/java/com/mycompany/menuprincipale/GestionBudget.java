/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menuprincipale;

/**
 *
 * @author gwendoline.de-sa.26
 */


import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class GestionBudget {
    // Liste pour stocker les dépenses et les projets
    private static List<Depense> depenses = new ArrayList<>();
    private static List<Projet> projets = new ArrayList<>();

    // Méthode pour saisir les budgets et les équipes
    public static void saisirBudgets(Scanner scanner) {
        // Saisie du budget pour la fondation
        System.out.print("Entrez le budget pour la fondation : ");
        double budgetFondation = scanner.nextDouble();
        scanner.nextLine(); // Consomme le caractère de nouvelle ligne
        
        // Saisie du budget pour la structure
        System.out.print("Entrez le budget pour la structure : ");
        double budgetStructure = scanner.nextDouble();
        scanner.nextLine(); // Consomme le caractère de nouvelle ligne
        
        // Saisie du budget pour la finition
        System.out.print("Entrez le budget pour la finition : ");
        double budgetFinition = scanner.nextDouble();
        scanner.nextLine(); // Consomme le caractère de nouvelle ligne
        
        // Saisie du budget initial
        System.out.print("Entrez le budget initial : ");
        double budgetInitial = scanner.nextDouble();
        scanner.nextLine(); // Consomme le caractère de nouvelle ligne
        
        // Saisie des équipes
        List<Equipe> equipes = new ArrayList<>();
        System.out.print("Entrez le nombre d'équipes : ");
        int nombreEquipes = scanner.nextInt();
        scanner.nextLine(); // Consomme le caractère de nouvelle ligne
        
        for (int i = 0; i < nombreEquipes; i++) {
            System.out.print("Entrez le nom de l'équipe " + (i + 1) + " : ");
            String nomEquipe = scanner.nextLine();
            System.out.print("Entrez le nombre de membres pour l'équipe " + (i + 1) + " : ");
            int membres = scanner.nextInt();
            System.out.print("Entrez le salaire total pour l'équipe " + (i + 1) + " : ");
            double salaireTotal = scanner.nextDouble();
            scanner.nextLine(); // Consomme le caractère de nouvelle ligne
            
            Equipe equipe = new Equipe(nomEquipe, membres, salaireTotal);
            equipes.add(equipe);
        }
        
        // Crée un nouveau projet avec la liste d'équipes
        Projet projet = new Projet("Nom du Projet", 3, new ArrayList<>(), budgetInitial, budgetFondation, budgetStructure, budgetFinition, equipes);
        projets.add(projet);
    }
    
    // Méthode pour afficher les salaires et le budget mis à jour
        public static void afficherBudgetEtSalaires() {
           // Parcourir chaque projet
           for (Projet projet : projets) {
               // Calculer les dépenses totales en salaires pour le projet
               double totalSalaires = 0;
               for (Depense depense : depenses) {
                   if (depense.getDescription().startsWith("Salaire")) {
                       totalSalaires += depense.getMontant();
                   }
               }

               // Calculer le montant total des dépenses en ressources pour le projet
               double totalDepensesRessources = 0;  // Si vous avez besoin de cette info, ajoutez une logique similaire à celle des salaires

               // Calculer le budget restant
               double budgetRestant = projet.getBudgetInitial() - totalSalaires - totalDepensesRessources;

               // Afficher les détails du projet
               System.out.println("Nom du Projet: " + projet.getNom());
               System.out.println("Budget Initial: " + projet.getBudgetInitial());
               System.out.println("Budget pour la Fondation: " + projet.getBudgetFondation());
               System.out.println("Budget pour la Structure: " + projet.getBudgetStructure());
               System.out.println("Budget pour la Finition: " + projet.getBudgetFinition());
               System.out.println("Total Dépenses en Salaires: " + totalSalaires);
               System.out.println("Total Dépenses en Ressources: " + totalDepensesRessources);  // Ajoutez si nécessaire
               System.out.println("Budget Restant: " + budgetRestant);
               System.out.println();
           }
        }
}

