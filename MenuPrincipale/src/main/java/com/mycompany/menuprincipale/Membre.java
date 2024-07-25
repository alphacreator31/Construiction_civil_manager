/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menuprincipale;

/**
 *
 * @author gwendoline.de-sa.26
 */
public class Membre {
    private String nom;
    private String role;
    private double salaire;

    public Membre(String nom, String role, double salaire) {
        this.nom = nom;
        this.role = role;
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Role: " + role + ", Salaire: " + salaire;
    }

    public double getSalaire() {
        return salaire;
    }
}

