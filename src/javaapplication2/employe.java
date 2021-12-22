/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Walid Boulima
 */
public class employe {
    protected int identifiant;
    protected String nom;
    protected String adresse;
    protected int nbr_heurs;

    public int getIdentifiant() {
        return identifiant;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getNbr_heurs() {
        return nbr_heurs;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setNbr_heurs(int nbr_heurs) {
        this.nbr_heurs = nbr_heurs;
    }
    
    
    public employe(int identifiant, String nom,String adresse,int nbr_heurs) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.nbr_heurs = nbr_heurs;
    }
}
