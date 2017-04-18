/*
 * 2- Faça um programa que leia um número N do usuário, some todos os números 
 * inteiros de 1 a N, e mostre o resultado obtido. Use o laço WHILE
 */
package Lista2;

import java.util.Scanner;


public class Exercicio2 {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        
        System.out.print("Escreva um número: ");
        int numero=console.nextInt();
        
        int i=1,soma=0;
        while(i<=numero){
            soma=soma+i;
            i++;
            
        }
        System.out.println("Resultado= "+ soma);
        
    }
    
}
