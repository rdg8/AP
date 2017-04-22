/*
 * Na matemática, um número perfeito é um número inteiro para o qual a soma de 
 * todos os seus divisores positivos próprios (excluindo ele mesmo) é igual ao
 * próprio número. Por exemplo o número 6 é perfeito, pois 1+2+3 é igual a 6. 
 * Sua tarefa é escrever um programa que imprima se um determinado número é
 * perfeito ou não. Utilize o laço que lhe for mais conveniente.

 */
package Lista2;

import java.util.Scanner;


public class Exercicio21 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Escreva um número para saber se ele é perfeito: ");
        int n = console.nextInt();
        
        int perf=0;
        for(int i=1;i<n;i++){
            int divisor=n%i;
            if(divisor==0){
                perf=perf+i;
            }           
        }
        
        if(perf==n){
            System.out.println(n+ " Número PERFEITO");
        }
        else{
            System.out.println(n+ " Não é perfeito");
        }
        
    }
    
}
