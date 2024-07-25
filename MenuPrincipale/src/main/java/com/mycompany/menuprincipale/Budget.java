/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menuprincipale;

/**
 *
 * @author gwendoline.de-sa.26
 */
public class Budget {
    private double budgetInitial;
    private double depenses;

    public Budget(double budgetInitial) {
        this.budgetInitial = budgetInitial;
        this.depenses = 0.0;
    }

    public void ajouterDepense(double montant) {
        depenses += montant;
    }

    public double getBudgetRestant() {
        return budgetInitial - depenses;
    }

    @Override
    public String toString() {
        return "Budget initial: " + budgetInitial + ", Dépenses: " + depenses + ", Budget restant: " + getBudgetRestant();
    }
}
