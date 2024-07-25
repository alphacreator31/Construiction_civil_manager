/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menuprincipale;

/**
 *
 * @author gwendoline.de-sa.26
 */

import java.util.List;

public class Projet {
    private String nom;
    private int etages;
    private List<Etape> etapes;
    private double budgetInitial;
    private double budgetFondation;
    private double budgetStructure;
    private double budgetFinition;
    private List<Equipe> equipes; // Ajout pour gérer les équipes
    
    public Projet(String nom, int etages, List<Etape> etapes, double budgetInitial, double budgetFondation, double budgetStructure, double budgetFinition, List<Equipe> equipes) {
    this.nom = nom;
    this.etages = etages;
    this.etapes = etapes;
    this.budgetInitial = budgetInitial;
    this.budgetFondation = budgetFondation;
    this.budgetStructure = budgetStructure;
    this.budgetFinition = budgetFinition;
    this.equipes = equipes;
    
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEtages() {
        return etages;
    }

    public void setEtages(int etages) {
        this.etages = etages;
    }

    public List<Etape> getEtapes() {
        return etapes;
    }

    public void setEtapes(List<Etape> etapes) {
        this.etapes = etapes;
    }

    public double getBudgetInitial() {
        return budgetInitial;
    }

    public void setBudgetInitial(double budgetInitial) {
        this.budgetInitial = budgetInitial;
    }

    public double getBudgetFondation() {
        return budgetFondation;
    }

    public void setBudgetFondation(double budgetFondation) {
        this.budgetFondation = budgetFondation;
    }

    public double getBudgetStructure() {
        return budgetStructure;
    }

    public void setBudgetStructure(double budgetStructure) {
        this.budgetStructure = budgetStructure;
    }

    public double getBudgetFinition() {
        return budgetFinition;
    }

    public void setBudgetFinition(double budgetFinition) {
        this.budgetFinition = budgetFinition;
    }

    public List<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(List<Equipe> equipes) {
        this.equipes = equipes;
    }

    @Override
    public String toString() {
        return "Projet{" +
               "nom='" + nom + '\'' +
               ", etages=" + etages +
               ", etapes=" + etapes +
               ", budgetInitial=" + budgetInitial +
               ", budgetFondation=" + budgetFondation +
               ", budgetStructure=" + budgetStructure +
               ", budgetFinition=" + budgetFinition +
               ", equipes=" + equipes +
               '}';
    }
}