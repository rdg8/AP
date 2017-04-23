/*
 *13- Faça um programa que leia um número natural N e calcule a soma abaixo 
 * (lembre-se de que tanto as divisões quanto o resultado devem ser decimais).
 * Utilize o laço que lhe for mais conveniente.
 *S=1+((1*2)/(1*3))+((1*2*3)/(1*3*5))+((1*2*3*4)/(1*3*5*7))+...
 *                                       ...+((1*2*3*...*N)/(1*3*5*...*(2n-1))0
 */
package Lista2;

import java.util.Scanner;


public class Exercicio13 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double n;
        
        do{
            System.out.print("Escreva um número Natural: ");
            n = console.nextDouble();
            
        }while(n<1);
        
        double soma=1,x=1;
        double impar=3;
        if(n>1){
        for(double i=1;i<=n;i++){ 
            System.out.println(i);
            soma=soma+(x*((i+1)/(impar)));
            x=soma;
            impar=impar+2;
                    
        }
       }
        
        
        System.out.println(soma);
        
    
    
    
    
    
    
    
    
    
    }
    
}
