/*
 * 13- Fazer um algoritmo que leia três números e imprime o maior deles
 */
package LISTA1;

import java.util.Scanner;


public class Exercicio13 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Escreva o primeiro número: ");
        float n1 = console.nextFloat();
        System.out.print("Escreva o segundo número: ");
        float n2 = console.nextFloat();
        System.out.print("Escreva o terceiro número: ");
        float n3 = console.nextFloat();
        
        if(n1>n2){
            if(n1>n3){
                System.out.println("O maior número é o primeiro número: "+ n1);
            }
        }
        else if(n2>n3){
            System.out.println("O maior número é o seguno número: "+ n2);     
        }
        else {
            System.out.println("O maior número é o terceiro número: "+ n3); 
        }
        
        
        
    }
    
}
