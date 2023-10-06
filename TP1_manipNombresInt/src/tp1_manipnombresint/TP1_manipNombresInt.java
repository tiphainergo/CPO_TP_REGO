/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint;

import java.util.Scanner;

/**
 *
 * @author regotiphaine TDC TP1 26/09/2023
 */
public class TP1_manipNombresInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here2
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n Entrer un premier nombre :");
        int nb1 = sc.nextInt(); // on demande à l'utilisateur de saisir un permier nombre entier 
       
        System.out.println("\n Entrer un deuxième nombre :");
        int nb2 = sc.nextInt(); // on demande à l'utilisateur de saisir un deuxième nombre entier 
        System.out.println("Les nombres choisi sont : " + nb1 + " et " + nb2); // on affiche les 2 nombres choisi par l'utilisateur
        
        System.out.println("La somme des deux nombres choisis est: " + (nb1+nb2)); // on effectue les calculs 
        System.out.println("La différence des deux nombres choisis est: " + (nb1-nb2));
        System.out.println("La multiplication des deux nombres choisis est: " + (nb1*nb2));
        System.out.println("La différence des deux nombres choisis est: " + (nb1/nb2));
        System.out.println("Le reste de la division des deux nombres choisis est: " + (nb1%nb2));
    }    
}