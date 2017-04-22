/*
 *15-Faça um programa que leia um número inteiro N maior do que zero e calcule o 
 * fatorial desse número.
 * Fatorial de N é representado por N! e calculado da seguinte maneira:
 */
package Lista2;

import java.util.Scanner;


public class Exercicio15 {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        
        System.out.print("Escreva um numero inteiro e maior que zero: ");
        int n = console.nextInt();
        int Fatorial=n,x=n;
        
        while(n<=0){
            System.out.print("Escreva um numero inteiro e maior que zero: ");
            n = console.nextInt();
        }
            
        
        for(int i=1;i<n;i++){
            x=x-1;
            Fatorial=Fatorial*(x);        
            
        }
        System.out.println(Fatorial);     
       
        
    }
    
}
