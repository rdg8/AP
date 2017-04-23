/*
 *11- Faça um programa que leia um número natural N e calcule a soma abaixo 
 * (lembre-se de que tanto as divisões quanto o resultado devem ser decimais). 
 * Utilize o laço que lhe for mais conveniente.
s=1-1/2+1/3-1/4+1/5-...+1/n
 */
package Lista2;

import java.util.Scanner;


public class Exercicio11 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        double n = console.nextDouble();
        double soma=1;
        
        for(double i=2;i<=n;i++){
            soma=soma-(1/i);
            
            if(i<n){
                i++;
                soma=soma+(1/i);
                
            }
           
        }
        System.out.println("resultado= "+ soma);
                
    
    
    
    
    
    }
    
}
