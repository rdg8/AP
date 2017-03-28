/*
 * Dado um número, verificar se ele é maior que 100. Se for, o algoritmo deve 
 * somar 150 a esse número. No final, imprimir o resultado da soma.
 */
package exerciciosaula;

import java.util.Scanner;


public class ExerciciosIf1 {

    
    public static void main(String[] args) {
        Scanner console =  new Scanner(System.in);
        
        System.out.print("Escreva um número:");
        float numero = console.nextFloat();
        
        if (numero>100){
            float numero1= numero+150;
            System.out.println("numero soma = "+ numero1);
        }
        
    }
    
}
