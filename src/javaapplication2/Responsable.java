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
public class Responsable extends employe {
    private float prime;

    public Responsable(int identifiant, String nom, String adresse, int nbr_heurs, float prime) {
        super(identifiant, nom, adresse, nbr_heurs);
        this.prime = prime;
    }
    
    @Override
  public String toString() {
    return "Responsable{" +
        super.toString()+
        ", prime=" + prime +
        '}';
  }

  public float calculerSalaireEmploye() {
    float salaire = 0;
    float heuresSup = 0;
    float heuresBase = super.getNbr_heurs();
    if (super.getNbr_heurs() > 160) {
      heuresSup = super.getNbr_heurs() - 160;
      heuresBase = 160;
    }
    salaire = (float) ((heuresBase * 10) + (12 * heuresSup));
    return salaire+prime;
  }
}
