/*
 * Crie um programa que verifica se um número inteiro informado pelo usuário é
 * divisível por 3.
 */
package AP03_04;

import java.util.Scanner;


public class Exercicio1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Escreva um número: ");
        int n = console.nextInt();
        
        int divisao=n%3;
        
        switch (divisao){
            case 0:
                System.out.println("Numero divisivel por 3");
                break;
            default:
                System.out.println("Não é divisivel por 3");
               
                
        }
                
       
        
        
        
    }
    
}
