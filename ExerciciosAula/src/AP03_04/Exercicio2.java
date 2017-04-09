/*
 * 2- Crie um programa que exibe se um dia é dia útil, fim de semana ou dia inválido dado
 * o número referente ao dia. Considere que domingo é o dia 1 e sábado é o dia 7. 
 */
package AP03_04;

import java.util.Scanner;


public class Exercicio2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Escreva o dia da semana: ");
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
