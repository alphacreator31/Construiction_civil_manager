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

public class MenuPrincipal {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Projet> projets = new ArrayList<>();
    private static Inventaire inventaire = new Inventaire(); // Créer une instance d'Inventaire
    private static Marche monMarche = new Marche(); // Créer une instance de Marche

    public static void main(String[] args) {
        int choix;
        do {
            choix = afficherMenuPrincipal();
            switch (choix) {
                case 1:
                    afficherOption1_MenuPrincipal();
                    break;
                case 2:
                    gererEquipes();
                    break;
                case 3:
                    gererInventaire();
                    break;
                case 4:
                    consulterMarche();
                    break;
                case 5:
                    gererBudget();
                    break;
                case 6:
                    System.out.println("Vous avez choisi de quitter.");
                    break;
                default:
                    System.out.println("Option invalide. Veuillez choisir une option valide.");
                    break;
            }
        } while (choix != 6);
        scanner.close();
    }

    private static int afficherMenuPrincipal() {
        System.out.println("Menu Principal");
        System.out.println("1. Gestion des Projets de construction");
        System.out.println("2. Gestion des Equipes");
        System.out.println("3. Gestion de l'inventaire");
        System.out.println("4. Consultation du marche");
        System.out.println("5. Gestion du Budget");
        System.out.println("6. Quitter");
        System.out.print("Veuillez choisir une option: ");
        return scanner.nextInt();
    }

    private static void afficherOption1_MenuPrincipal() {
        System.out.println("Vous avez choisi de gerer les projets de construction");
        int choixProjet;

        do {
            System.out.println("1. Lancer un nouveau projet de construction");
            System.out.println("2. Afficher les projets en cours");
            System.out.println("3. Retour au menu principal");
            System.out.print("Veuillez choisir une option: ");
            choixProjet = scanner.nextInt();
            scanner.nextLine(); // Consomme le caractère de nouvelle ligne

            switch (choixProjet) {
                case 1:
                    System.out.println("Vous avez choisi de lancer un nouveau projet de construction");
                    System.out.print("Entrez le nom du projet : ");
                    String nomProjet = scanner.nextLine();
                    
                    System.out.print("Entrez le nombre d'etages : ");
                    int etages = scanner.nextInt();
                    scanner.nextLine(); // Consomme le caractère de nouvelle ligne
        
                    System.out.print("Entrez le budget initial du projet : ");
                    double budgetInitial = scanner.nextDouble();
                    scanner.nextLine(); // Consomme le caractère de nouvelle ligne
                    
                    System.out.print("Entrez le budget fondation du projet : ");
                    double budgetFondation = scanner.nextDouble();
                    scanner.nextLine(); // Consomme le caractère de nouvelle ligne
                    
                    System.out.print("Entrez le budget structure du projet : ");
                    double budgetStructure = scanner.nextDouble();
                    scanner.nextLine(); // Consomme le caractère de nouvelle ligne
                    
                    System.out.print("Entrez le budget finition du projet : ");
                    double budgetFinition = scanner.nextDouble();
                    scanner.nextLine(); // Consomme le caractère de nouvelle ligne

                    List<Etape> etapesList = new ArrayList<>(); // Renommé pour éviter les conflits avec 'etapes'
                    
                    // Demander les équipes pour le projet
                    List<Equipe> equipes = new ArrayList<>();
                    System.out.print("Entrez le nombre d'equipes : ");
                    int nombreEquipes = scanner.nextInt();
                    scanner.nextLine(); // Consomme le caractère de nouvelle ligne
                    for (int i = 0; i < nombreEquipes; i++) {
                        System.out.print("Entrez le nom de l'equipe " + (i + 1) + " : ");
                        String nomEquipe = scanner.nextLine();
                        System.out.print("Entrez le nombre de membres dans l'equipe " + (i + 1) + " : ");
                        int membres = scanner.nextInt();
                        System.out.print("Entrez le salaire total de l'equipe " + (i + 1) + " : ");
                        double salaire = scanner.nextDouble();
                        scanner.nextLine(); // Consomme le caractère de nouvelle ligne
                        Equipe equipe = new Equipe(nomEquipe, membres, salaire);
                        equipes.add(equipe);
                    }

                    Projet nouveauProjet = new Projet(nomProjet, etages, etapesList, budgetInitial, budgetFondation, budgetStructure, budgetFinition, equipes);
                    projets.add(nouveauProjet); // Ajouter le projet à la liste des projets
                    System.out.println("Nouveau projet ajoute : " + nouveauProjet);
                    break;
                    
                case 2:
                    System.out.println("Vous avez choisi d'afficher les projets en cours");
                    for (Projet p : projets) {
                        System.out.println(p);
                    }
                    break;
                case 3:
                    System.out.println("Retour au menu principal");
                    break;
                default:
                    System.out.println("Option invalide. Veuillez choisir une option valide.");
                    break;
            }
        } while (choixProjet != 3);
    }

    private static void gererEquipes() {
        int choixEquipe;
        do {
            System.out.println("1. Creer et gerer les equipes");
            System.out.println("2. Afficher les informations des equipes");
            System.out.println("3. Retour au menu principal");
            System.out.print("Veuillez choisir une option: ");
            choixEquipe = scanner.nextInt();
            scanner.nextLine(); // Consomme le caractère de nouvelle ligne
            
            switch (choixEquipe) {
                case 1:
                    System.out.println("Vous avez choisi de creer et gErer les equipes");
                    System.out.print("Entrez le nom de l'Equipe : ");
                    String nomEquipe = scanner.nextLine();
                    System.out.print("Entrez le nombre de membres dans l'equipe : ");
                    int membreEquipe = scanner.nextInt();
                    System.out.print("Entrez le salaire total de l'equipe : ");
                    double salaireEquipe = scanner.nextDouble();
                    scanner.nextLine(); // Consomme le caractère de nouvelle ligne

                    Equipe nouvelleEquipe = new Equipe(nomEquipe, membreEquipe, salaireEquipe);
                    // Vous devriez ajouter la nouvelle équipe à une liste ou une base de données
                    System.out.println("Nouvelle équipe ajoutee : " + nouvelleEquipe);
                    break;
              
                case 2:
                    System.out.println("Vous avez choisi d'afficher les informations des equipes");
                    // Afficher les équipes - vous devez implémenter cette méthode
                    break;
                case 3:
                    System.out.println("Retour au menu principal");
                    break;
                default:
                    System.out.println("Option invalide. Veuillez choisir une option valide.");
                    break;
            }
        } while (choixEquipe != 3);
    }

    private static void gererInventaire() {
        int choixInventaire;
        do {
            System.out.println("1. Rechercher un matériau dans l'inventaire");
            System.out.println("2. Ajouter un materiau dans l'inventaire");
            System.out.println("3. Retour au menu principal");
            System.out.print("Veuillez choisir une option: ");
            choixInventaire = scanner.nextInt();
            scanner.nextLine(); // Consomme le caractère de nouvelle ligne
            
            switch (choixInventaire) {
                case 1:
                    System.out.println("Vous avez choisi de rechercher un materiau dans l'inventaire");
                    System.out.print("Entrez le nom du materiau à rechercher : ");
                    String nomRecherche = scanner.nextLine();
                    Materiau materiau = inventaire.rechercherMateriau(nomRecherche); // Appel de la méthode sur l'instance
                    if (materiau != null) {
                        System.out.println("Materiau trouve : " + materiau);
                    } else {
                        System.out.println("Materiau non trouve.");
                    }
                    break;
                case 2:
                   System.out.println("Vous avez choisi d'ajouter un materiau dans l'inventaire");
                   System.out.print("Entrez le nom du materiau : ");
                   String nomMateriau = scanner.nextLine();
                   System.out.print("Entrez le prix du materiau : ");
                   double prixMateriau = scanner.nextDouble();
                   System.out.print("Entrez la quantite du materiau : ");
                   int quantiteMateriau = scanner.nextInt();
                   scanner.nextLine(); // Consomme le caractère de nouvelle ligne
                
                   Materiau nouveauMateriau = new Materiau(nomMateriau, prixMateriau, quantiteMateriau);
                   inventaire.ajouterMateriau(nouveauMateriau);
                   System.out.println("Materiau ajouté : " + nouveauMateriau);
                   break;
                case 3:
                    System.out.println("Retour au menu principal");
                    break;
                default:
                    System.out.println("Option invalide. Veuillez choisir une option valide.");
                    break;
            }
        } while (choixInventaire != 3);
    }

    private static void consulterMarche() {
        int choixMarche;
        do {
            System.out.println("1. Consulter les ressources disponibles sur le marche et leurs prix d’achat en dollars");
            System.out.println("2. Acheter des materiaux");
            System.out.println("3. Rechercher une ressource");
            System.out.println("4. Retour au menu principal");
            System.out.print("Veuillez choisir une option: ");
            choixMarche = scanner.nextInt();
            scanner.nextLine(); // Consomme le caractère de nouvelle ligne
            
            switch (choixMarche) {
                case 1:
                    System.out.println("Vous avez choisi de consulter les ressources disponibles sur le marché et leurs prix d'achat en dollars");
                    monMarche.consulterMarche();
                    break;
                case 2:
                    System.out.println("Vous avez choisi d’acheter des materiaux");
                    System.out.print("Entrez le nom de la ressource à acheter : ");
                    String nomRessource = scanner.nextLine();
                    System.out.print("Entrez la quantite de la ressource à acheter : ");
                    int quantite = scanner.nextInt();
                    scanner.nextLine(); // Consomme le caractère de nouvelle ligne
                
                    monMarche.acheterMarchandise(nomRessource, quantite);
                    break;
                case 3:
                    System.out.print("Entrez le nom de la ressource à rechercher : ");
                    String nomRecherche = scanner.nextLine();
                    Ressource ressource = monMarche.rechercherRessource(nomRecherche); // Appel de la méthode sur l'instance
                    if (ressource != null) {
                        System.out.println("Ressource trouvee : " + ressource);
                    } else {
                        System.out.println("Ressource non trouvee.");
                    }
                    break;
                case 4:
                    System.out.println("Retour au menu principal");
                    break;
                default:
                    System.out.println("Option invalide. Veuillez choisir une option valide.");
                    break;
            }
        } while (choixMarche != 4);
    }

    private static void gererBudget() {
        int choixBudget;
        do {
            System.out.println("1. Mise à jour du budget");
            System.out.println("2. Retour au menu principal");
            System.out.print("Veuillez choisir une option: ");
            choixBudget = scanner.nextInt();
            scanner.nextLine();
            
            switch (choixBudget) {
                case 1:
                    System.out.println("Vous avez choisi d'afficher le budget mis à jour");
                    afficherBudgetEtSalaires();
                    break;
                case 2:
                    System.out.println("Retour au menu principal");
                    break;
                default:
                    System.out.println("Option invalide. Veuillez choisir une option valide.");
                    break;
            }
        } while (choixBudget != 2);
    }

    // Méthode pour afficher les salaires et le budget mis à jour
    private static void afficherBudgetEtSalaires() {
    for (Projet projet : projets) {
        System.out.println("Nom du Projet: " + projet.getNom());
        System.out.println("Budget Initial: " + projet.getBudgetInitial());
        System.out.println("Budget Fondation: " + projet.getBudgetFondation());
        System.out.println("Budget Structure: " + projet.getBudgetStructure());
        System.out.println("Budget Finition: " + projet.getBudgetFinition());
        System.out.println("Total Depenses en Salaires: " + calculerDepensesSalaires(projet));
        System.out.println("Total Depenses en Ressources: " + calculerDepensesRessources(projet));
        System.out.println("Budget Restant: " + calculerBudgetRestant(projet));
        System.out.println();
    }
}

private static double calculerDepensesSalaires(Projet projet) {
    double totalSalaires = 0;
    for (Equipe equipe : projet.getEquipes()) {
        totalSalaires += equipe.getSalaireTotal();
    }
    return totalSalaires;
}

private static double calculerDepensesRessources(Projet projet) {
    double totalDepensesRessources = 0;
    // Vous devez avoir un moyen d'accéder aux dépenses de ressources pour chaque projet.
    // Supposons que vous ayez une méthode dans la classe Projet pour obtenir ces dépenses.
    // Exemple : totalDepensesRessources = projet.getDepensesRessources();
    // Vous devez remplacer cela par la logique appropriée basée sur votre modèle.
    return totalDepensesRessources;
}

private static double calculerBudgetRestant(Projet projet) {
    double totalDepenses = calculerDepensesSalaires(projet) + calculerDepensesRessources(projet);
    return projet.getBudgetInitial() - totalDepenses;
}
}
