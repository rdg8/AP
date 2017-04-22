/*
 * 10- Faça um programa que calcule e imprima o resultado da soma abaixo
 * (lembre-se de que tanto as divisões quanto o resultado devem ser decimais). 
 * Utilize o laço que lhe for mais conveniente.
 * S=1+1/2+1/3+1/4+...+1/20
 */
package Lista2;

import java.util.Scanner;


public class Exercicio10 {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        double soma=1;
        
        
        for(int i=2;i<=20;i++){
            double n = 1/i;
            soma=soma+n;
            System.out.println( i);
            System.out.println( n);
        }
        System.out.println(soma);
        
        
        
        
    }
    
}
