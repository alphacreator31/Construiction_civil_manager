/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menuprincipale;

/**
 *
 * @author gwendoline.de-sa.26
 */

public class Equipe {
    private String nom;
    private int membres;
    private double salaireTotal;

    public Equipe(String nom, int membres, double salaireTotal) {
        this.nom = nom;
        this.membres = membres;
        this.salaireTotal = salaireTotal;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getMembres() {
        return membres;
    }

    public void setMembres(int membres) {
        this.membres = membres;
    }

    public double getSalaireTotal() {
        return salaireTotal;
    }

    public void setSalaireTotal(double salaireTotal) {
        this.salaireTotal = salaireTotal;
    }

    @Override
    public String toString() {
        return "Equipe{" +
               "nom='" + nom + '\'' +
               ", membres=" + membres +
               ", salaireTotal=" + salaireTotal +
               '}';
    }
}

