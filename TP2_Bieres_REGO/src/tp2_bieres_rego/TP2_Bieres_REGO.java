/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_rego;

/**
 *
 * @author regotiphaine
 */
public class TP2_Bieres_REGO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0 ,"Dubisson"); //creer une biere de classe bouteillebiere
        uneBiere.lireEtiquette(); //applique fonction lire etiquette sur unebiere
   
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe") ;
        autreBiere.lireEtiquette();
        
        BouteilleBiere B3 = new BouteilleBiere("BTITI 1", 5.8 ,"Brasserie Mont TITI") ;
        B3.Décapsuler(); //fonction  decapsuler 
        BouteilleBiere B2 = new BouteilleBiere("BTITI 2", 6.3 ,"Brasserie TITI ") ;
        BouteilleBiere B1 = new BouteilleBiere("BTITI 3", 5.6 ,"Brasserie TITI") ;
        B1.Décapsuler();
        
        System.out.println(B1 + "\n" + B2 + "\n" + B3); //permet de lire avec toString()
    }
}
    
