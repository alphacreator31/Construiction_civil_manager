/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menuprincipale;

/**
 *
 * @author gwendoline.de-sa.26
 */
public class Etape {
    private String nom;
    private Equipe equipe;
    private Ressource ressource;


    public Etape(String nom, Equipe equipe,Ressource ressource) {
        this.nom = nom;
        this.equipe = equipe;
        this.ressource= ressource;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public Ressource getRessource(){
        return ressource;
    }
    
    public void setRessource(Ressource ressource){
        this.ressource=ressource;
    }
 
    public Equipe getEquipe() {
        return equipe;
    }
    

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public String toString(){

    return "Etape{" + "nom='" + nom + '\'' + ", equipe=" + equipe + ", ressource=" + ressource + '}';

    }
}