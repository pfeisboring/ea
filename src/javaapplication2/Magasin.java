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
public class Magasin {
     private int id;
    private String adresse;
    private int capacite = 50;
    private Produit[] produits;
    private int nbProduit;
    private String nom;
    private employe[] employes;
    private String libelle;
    
    
   
    public Magasin(){
        produits = new Produit[capacite];
    }
    
    public Magasin(int id, String adresse , String nom){
        this.id=id;
        this.adresse=adresse;
        //this.capacite=capacite;
        this.nom=nom;
        produits  = new Produit[capacite];
        this.employes = new employe[20];
        
    }

    Magasin(String carrefour, String centre_ville) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getNom(){
        return nom;
    }
    
    public int getId(){
        return id;
    }
    public String getLibelle(){
        return libelle;
    }
    public String getAdresse(){
        return adresse;
    }
    public int getCapacite(){
        return capacite;
    }
    /*public int getProduits(){
        return EnsembleProd;
    
   }*/
    public void setId(int id){
        this.id=id;
    }
    public void setAdresse(String adresse){
        this.adresse=adresse;
    }
    public void setCapacite(int capacite){
        this.capacite=capacite;
    }
    /*public void setProduits(int ensembleProd){
        this.produits=ensembleProd;
    }*/
     public int getNbrProd() {
        int j = 0;
        for (int i = 0; i < capacite; i++) {
            if (produits[i] != null) {
                j++;

            }
        }
        return j;

    }
    
public boolean comparee(Produit p) {
    for (int i = 0; i < this.capacite; i++) {
      if (p.Comparer(this.produits[i])) {
        return true;
      }
    }
    return false;
  }
        
    
   
  public void ajouterProduit(Produit p)throws MagasinPleinException {
    if (this.capacite == 2) {
      throw (new MagasinPleinException("Exception: Plein"));
    }
    if (!comparee(p)) {
      produits[capacite] = p;
      this.capacite++;
    }
  }

   /* public boolean exist(Produit p){
        for(Produit prods : this.produits ){
            if(prods != null){
                if(Produit.comparer(p , prods)){
                    return true;
                }
            }
        }
            return false;
    }*/
    public void afficher(){
        String x = "" ;
        for(int i=0 ; i < capacite ; i++){
            if(produits[i] != null){
                x += "\n" + produits[i];
            }
        }
        System.out.println("identifiant = " +this.id +"\n Adresse= "+ this.adresse + "Produit = " +x);
    }
    
    public String toString(){
        String ch1,ch2="" ,res;
        ch1="id : " + id + "Adresse : " + adresse+"nombre de produits : " + nbProduit;
        for(int i= 0 ; i< nbProduit ; i++){
            ch2+=produits[i].toString()+"\n";
        }
        return res = ch1+ch2 ;
    }
    public static boolean Comparer (Produit p1, Produit p2){
        return p1.getId() == p2.getId() && p1.getLibelle() == p2.getLibelle() && p1.getPrix() == p2.getPrix();

    }
               public boolean Chercher(Produit p) {
               for(int i=0; i<this.produits.length ;i++){
                   return this.Comparer(p,this.produits[i]);
                   
               }
               return false;
           }
               //public void ajouterproduit(Produit p){
                  // if(this.Chercher(p) == false) {
                   //    produits[capacite]=p;
                     //  this.capacite++;
                  // }
             //  }
               public void supprimer(Produit p){
                   int indice = 1;
                   for(int i=0; i<this.capacite ;i++){
                   if(Comparer(produits[i],p)) {
                       indice = i;
                       
                   }
                       
                   }
                   if(indice != -1){
                       for(int i=indice; i<this.capacite; i++) {
                           produits[i]=produits[i+1];
                       }
                   }
               }
               public Magasin Comparer(Magasin m) {
                   if(this.capacite>m.getCapacite()) {
                       return this;
                       
                   }
                   return m;
               }
               public void ajouter_employe(employe employe) {
                   this.employes[capacite] = employe;
                   capacite++;
               }
              // public void afficher_employe() {
                  // if(employes[0] instanceof employes)
               //}
}
