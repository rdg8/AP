/*
 * 6- Criar um programa para identificar se um dia da semana (numerados de 1 a 7) é dia de
semana, fim de semana ou um dia inválido. 
 */
package AP03_04;

import java.util.Scanner;


public class Exercicio6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Escreva o dia da semana");
        int semana = console.nextInt();
        
        
        switch (semana){
            
            case 2:
            case 3:
            case 4:                  
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
            case 1:     
            case 7:
                System.out.println("Não é dia util");
                break;
            default:
                System.out.println("Dia da semana invalido");
        }
        
        
    }
    
}
