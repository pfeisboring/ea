/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Date;

/**
 *
 * @author Walid Boulima
 */
public class ProduitAgricole extends Produit {
    private String type;
    private float quantite;
    private String saison;

    public ProduitAgricole(int id, String type, String libelle, float quantite, String saison) {
        super(id, libelle);
        this.type = type;
        this.quantite = quantite;
        this.saison = saison;
    }

    public ProduitAgricole(int id, String libelle, String marque, String saison, String type, float quantite) {
    super(id, libelle, marque);
    this.saison = saison;
    this.type = type;
    this.quantite = quantite;
  }

  public ProduitAgricole(int id, String libelle, String marque, float prix, String saison, String type, float quantite) {
    super(id, libelle, marque, prix);
    this.saison = saison;
    this.type = type;
    this.quantite = quantite;
  }
  public ProduitAgricole(String saison, String type, float quantite){
      this.saison=saison;
      this.type=type;
      this.quantite=quantite;

}
}

