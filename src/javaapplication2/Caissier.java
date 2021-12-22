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
public class Caissier extends employe {
    private int numeroDeCaisse;

    public Caissier(int identifiant, String nom, String adresse, int nbr_heurs, int numeroDeCaisse) {
        super(identifiant, nom, adresse, nbr_heurs);
        this.numeroDeCaisse = numeroDeCaisse;
    }
    public int getnumeroDeCaisse(){
        return this.numeroDeCaisse;
    }
    public void setnumeroDeCaisse(int numeroDeCaisse) {
        this.numeroDeCaisse = numeroDeCaisse;
        
    }
    
    public float calculerSalaireEmploye() {
    float salaire = 0;
    float heuresSup = 0;
    float heuresBase = super.getNbr_heurs();
    if (super.getNbr_heurs() > 180) {
      heuresSup = super.getNbr_heurs() - 180;
      heuresBase = 180;
    }
    salaire = (float) ((heuresBase * 5) + (5.75* heuresSup));
    return salaire;
  }
}
