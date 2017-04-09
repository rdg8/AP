/*
 * 5- Criar um programa para identificar se um mês digitado pelo usuário é de alta ou baixa
temporada (considerar os seguintes meses como alta temporada: dezembro a fevereiro,
junho e julho).
 */
package AP03_04;

import java.util.Scanner;


public class Exercicio5 {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        
        System.out.print("Escreva o mês: ");
        String mes = console.next();
        
        switch (mes){
            case "dezembro":
            case "janeiro":
            case "fevereiro":
            case "junho":
            case "julho":
                System.out.println("Alta temporada");
            
                default:
                    System.out.println("Baixa temporada");
                
        }
        
    }
    
}
