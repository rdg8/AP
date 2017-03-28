/*
 * 8- Fazer um algoritmo que leia quatro números e imprime a média aritmética​ 
 * dos quatro números
 */
package ap;

import java.util.Scanner;
public class Exercicio8 {
 
    public static void main(String[] args) {
       Scanner console = new Scanner(System.in);
       
        System.out.print("Escreva o 1º número: ");
        float n1 = console.nextFloat();
        System.out.print("Escreva o 2º número: ");
        float n2 = console.nextFloat();
        System.out.print("Escreva o 3º número: ");
        float n3 = console.nextFloat();
        System.out.print("Escreva o 4º número: ");
        float n4 = console.nextFloat();
        
        float media = (n1 + n2 + n3 + n4)/4;
        
        
        
        System.out.println("Média Aritmética​: "+ media);
        
        
        
    }
    
}
