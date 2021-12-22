/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication2.Produit;

/**
 *
 * @author Walid Boulima
 */
public class javaapplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Produit p = new Produit(1021, "Lait" , "Delice");
            Produit p1 = new Produit(2510, "Yaourt" , "Vuitalait");
            Produit p2 = new Produit(3250, "Tomate" , "Sicam" , 1.200f);
            /*p.Afficher();
            p1.Afficher();
            p2.Afficher();
            p.prix = 0.700f;
            p1.prix = 0.700f;
            p.Afficher();
            p1.Afficher();
            System.out.println(p2.toString());
            Date d1 = new Date();
            p1.dateExp = d1;
            System.out.println(p2);*/
            
            Magasin m = new Magasin(01,"monplaisir","Carrefour");
            Magasin m1 = new Magasin(02,"manzah 6","Géant");
            Magasin m2 = new Magasin(1,"Carrefour","centre ville");
            Magasin m3 = new Magasin(2,"Monoprix","menzeh 6");
            m.afficher();
            m1.afficher();
            try {
                m.ajouterProduit(p1);
            } catch (MagasinPleinException ex) {
                Logger.getLogger(javaapplication2.class.getName()).log(Level.SEVERE, null, ex);
            }
            m.afficher();
            
            Caissier c1 = new Caissier(1000,"mohamed", "Carrefour",8,1);
            Caissier c2 = new Caissier(1001,"ali", "Carrefour",8,2);
            Vendeur v1 = new Vendeur(1002,"ahmed", "Carrefour",8,50.1f);
            Responsable r1 = new Responsable(1003,"dali", "Carrefour",8,36.8f);
            m2.ajouter_employe(c1);
            m2.ajouter_employe(c2);
            m2.ajouter_employe(v1);
            m2.ajouter_employe(r1);
            
            Caissier c3 = new Caissier(1004,"hama", "Monoprix",8,3);
            Vendeur v2 = new Vendeur(1005,"hedi", "Monoprix",8,52.3f);
            Vendeur v3 = new Vendeur(1006,"morad", "Monoprix",8,53.4f);
            Vendeur v4 = new Vendeur(1007,"anis", "Monoprix",8,55.8f);
            Responsable r2 = new Responsable(1008,"amir", "Monoprix",8,30.1f);
            m3.ajouter_employe(c3);
            m3.ajouter_employe(v2);
            m3.ajouter_employe(v3);
            m3.ajouter_employe(v4);
            m3.ajouter_employe(r2);
            
            
            //affichage des employes:
            System.out.println(c1);
            System.out.println(c2);
            System.out.println(c3);
            System.out.println(v1);
            System.out.println(v2);
            System.out.println(v3);
            System.out.println(v4);
            System.out.println(r1);
            System.out.println(r2);
            
            //creation des produits
            
            Produit p111 = new Produit(1,"lait","delice",0.8f);
            Produit p222 = new Produit(1,"jus","delice",0.5f);
            
            try {
                //ajout des produits
                m2.ajouterProduit(p111);
            } catch (MagasinPleinException ex) {
                Logger.getLogger(javaapplication2.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                m3.ajouterProduit(p222);
            } catch (MagasinPleinException ex) {
                Logger.getLogger(javaapplication2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            //affichage des magasins
            System.out.println(m2);
            System.out.println(m3);
            
            //affichage salaire employe
            
            System.out.println("Salaire " + c1.getNom() + " :" + c1.calculerSalaireEmploye());
            System.out.println("Salaire " + c2.getNom() + " :" + c2.calculerSalaireEmploye());
            System.out.println("Salaire " + c3.getNom() + " :" + c3.calculerSalaireEmploye());
            System.out.println("Salaire " + v1.getNom() + " :" + v1.calculerSalaireEmploye());
            System.out.println("Salaire " + v2.getNom() + " :" + v2.calculerSalaireEmploye());
            System.out.println("Salaire " + v3.getNom() + " :" + v3.calculerSalaireEmploye());
            System.out.println("Salaire " + v4.getNom() + " :" + v4.calculerSalaireEmploye());
            System.out.println("Salaire " + r1.getNom() + " :" + r1.calculerSalaireEmploye());
            System.out.println("Salaire " + r2.getNom() + " :" + r2.calculerSalaireEmploye());
            
            // Prosit4
            
            ProduitAgricole pag1 = new ProduitFruit(1254,"fruit","fraise",12.3f,"mars");
            ProduitAgricole pag2 = new ProduitFruit(1224,"fruit","pasteque",50f,"juin");
            ProduitAgricole pag3 = new ProduitFruit(7896,"fruit","mandarine",25.6f,"decembre");
            ProduitAgricole pag4 = new ProduitLegume(8521,"legumes","artichaux",14f,"janvier");
            
            try {
                m1.ajouterProduit(pag1);
            } catch (MagasinPleinException ex) {
                Logger.getLogger(javaapplication2.class.getName()).log(Level.SEVERE, null, ex);
            }
            m1.ajouterProduit(pag2);
            m1.ajouterProduit(pag3);
            m1.ajouterProduit(pag4);
            
        } catch (MagasinPleinException ex) {
            Logger.getLogger(javaapplication2.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
