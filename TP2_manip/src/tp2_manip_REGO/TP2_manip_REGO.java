/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_REGO;

/**
 *
 * @author regotiphaine
 */
public class TP2_manip_REGO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2;
        assiette2 = assiette1;
        assiette1 = assiette3;

        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);
        // 2 lignes fausses une tartiflette ne devient pas une moussaka
        // reponse question : non

        Moussaka[] tab = new Moussaka[10]; // tableau de moussaka vide a la base contenant 10 places
            for (int i = 0; i < 10; i++) { //bloucle
            Moussaka a = new Moussaka(342+ i*100); //creeer des moussakas
            tab[i]=a;  }//permet de le mettre dans le tableau
            for (int i=0; i < 10; i++){
            System.out.println("Objet Moussaka " + i + " a " + tab[i].nbCalories + " calories"); //pour comprendre le tableau
        }

    }

}