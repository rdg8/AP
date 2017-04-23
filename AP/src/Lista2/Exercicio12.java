/*
 * Faça um programa que leia um número natural N e calcule a soma abaixo 
 * (lembre-se de que tanto as divisões quanto o resultado devem ser decimais).
 * Utilize o laço que lhe for mais conveniente.
 * S=(1/n)+(2/n-1)+(3/n-2)+...+(n-1/2)+(n/1) 
 */
package Lista2;

import java.util.Scanner;


public class Exercicio12 {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        
        System.out.print("Escreva um número natural: ");
        int n = console.nextInt();
        
        while(n<=0){
            System.out.println("INVALIDO \nEscreva um número Natural: ");
            n = console.nextInt();
        }
        
        double N=n;
        double soma=0;
        for(double i=1;i<=n;i++){
            soma=soma+(i/N);
            N--;
            
        }
        
        System.out.println("Resulstado= "+soma);
        
    }
    
}
