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
public class Produit {
   public int id;
   public String libelle;
   public String marque;
   public float prix;
   public Date dateExp;
   
   
       public int getId(){
        return id;
    }
    public String getLibelle(){
        return libelle;
    }
     public float getPrix(){
        return prix;
    }
    
    
   public Produit(){
   }
   public Produit(int id , String libelle){
       this.id=id;
       this.libelle=libelle;
     
   }
   
   public Produit(int id , String libelle , String marque){
       this.id=id;
       this.libelle=libelle;
       this.marque=marque;
   }
  public Produit(int id , String libelle , String marque , float prix){
       this.id=id;
       this.libelle=libelle;
       this.marque=marque;
       this.prix=prix;
   }
  public Produit(int id, String libelle, String marque, float prix, Date dateExp) {
      this.id=id;
       this.libelle=libelle;
       this.marque=marque;
       this.prix=prix;
       this.dateExp=dateExp;
  }
  public void Afficher(){
      System.out.println("identifiant : "+ id + " Libelle : "+libelle+" Marque : "+marque+" Prix :" + prix + "Date = " + dateExp);
  }
  public  String toString(){
        return  "ProduitElemtaire{"+"id = " +id +", Libelle =" +libelle +", marque ="+marque+", prix = " +prix+ "Date = " + dateExp;
    }
  
  
  private static boolean comparer(Produit p, Produit prods) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

           public boolean Comparer(Produit p) {
        if(this.id == p.getId() && this.libelle == p.getLibelle() && this.prix == p.getPrix()) {
            
         return true;
        }
        return false;
    }
           
          // public boolean Chercher(Produit p) {
             //  for(int i=0;i<this.produits.length;i++){
                //   return this.Comparer(this.produits[i]);
                   
             //  }
             //  return false;
          // }
}
