/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author regotiphaine TDC Calculator 
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please enter the operator\n1) add\n2) substract\n3) multiply\n4) divide\n5) modulo");
 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer un nombre :");
        int operateur = sc.nextInt();
        
        while (operateur>5 || operateur<0) {
            System.out.println("ERREUR La valeur n'est pas comprise entre 0 et 5");
            System.out.println("\n Entrer un nombre :");
            operateur = sc.nextInt();
        }
        
        
                
        System.out.println("\n Entrer une première valeur :");
        float operande1 = sc.nextFloat();
        
        System.out.println("\n Entrer une deuxième valeur :");
        float operande2 = sc.nextFloat();
        
        float result;
        switch (operateur){
            case 1 :// addition
                result = operande1 + operande2;
                System.out.println("Le résultat est :" + result);
                break;
            case 2 ://sustraction
                result = operande1 - operande2;
                System.out.println("Le résultat est :" + result);
                break;
            case 3://multiplication
                result = operande1*operande2;
                System.out.println("Le résultat est :" + result);
                break;
            case 4://division
                result = operande1/operande2;
                System.out.println("Le résultat est :" + result);
                break;
            case 5://modulo
                result=operande1%operande2;
                System.out.println("Le résultat est :" + result);
                break;
                        
                        
                    
            
        }
    }
    
}