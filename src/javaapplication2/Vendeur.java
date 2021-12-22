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
public class Vendeur extends employe {
    private float tauxdevente;

    public Vendeur(int identifiant, String nom, String adresse, int nbr_heurs,float tauxDeVente) {
        super(identifiant, nom, adresse, nbr_heurs);
        this.tauxdevente = tauxdevente;
    }

    public float getTauxdevente() {
        return tauxdevente;
    }

    public void setTauxdevente(float tauxdevente) {
        this.tauxdevente = tauxdevente;
    }
    
     public float calculerSalaireEmploye() {
    float salaire = 0;
    salaire = 450 * (tauxdevente / 100);
    return salaire;
  }
    
    
           
            
}
