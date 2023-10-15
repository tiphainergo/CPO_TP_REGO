/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_rego;

/**
 *
 * @author regotiphaine
 */
public class Personne {

    String Nom;
    String Prenom;//on creer les variables
    int nbVoitures = 0;
    Voiture[] liste_voitures;

    public Personne(String unNom, String unPrenom) {
        Nom = unNom;
        Prenom = unPrenom;
        liste_voitures = new Voiture[3]; // création d'un tableau 3 cases (car 3 voitures max)
    }

    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
     boolean x = true;
     if (nbVoitures == 3){
         x = false;
     }
     if (voiture_a_ajouter.Proprietaire != null){
         x = false;
     }
     liste_voitures[nbVoitures] = voiture_a_ajouter;
     nbVoitures ++;
     voiture_a_ajouter.Proprietaire = this ;
     return x;
    }
}