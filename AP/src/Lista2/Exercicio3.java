/*
 * 3- Escreva um programa que leia um conjunto de 10 números inteiros positivos. 
 * Seu programa deve determinar e imprimir o maior deles. 
​ * Use o laço FOR.
 */
package Lista2;

import java.util.Scanner;


public class Exercicio3 {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        int maior=0;
        
        for(int i=1;i<=10;i++){
        System.out.print("Escreva o "+i+"º número: ");
        int numero = console.nextInt();
            if(maior<numero){
                maior=numero;
            }
        }
        
        System.out.println("O maior número é: "+ maior);
        
    }
    
}
