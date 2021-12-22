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
public class ProduitFruit extends  ProduitAgricole {


  public ProduitFruit(String saison, String type, float quantite) {
    super(saison, type, quantite);
  }

  public ProduitFruit(int id, String type, String libelle, float quantite, String saison) {
    super(id, type, libelle, quantite,saison);
  }

  public ProduitFruit(int id, String libelle, String marque, float prix, String saison, String type, float quantite) {
    super(id, libelle, marque, prix, saison, type, quantite);
  }

  
  public boolean estFrais(String saison) {
    return saison == saison;
  }
}

