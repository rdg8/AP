/*
 *14- Faça um programa que leia um número natural N e calcule a soma abaixo 
 *(lembre-se de que tanto as divisões quanto o resultado devem ser decimais). 
 * Utilize o laço que lhe for mais conveniente.
 * S=1+(2/3)+(4/5)+(6/7)+...+(2n/(2n+1))
 */
package Lista2;

import java.util.Scanner;


public class Exercicio14 {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        
        double soma=1;
        int n;
        do{
        System.out.print("Escreva um número Natural: ");
        n = console.nextInt();
        }while(n<1);
        if(n>1){
        double impar,x=2,par;   
            for(double i=1;i<=n;i++){
  
            par=x;
            impar=x+1; 
            soma=soma+((par)/(impar));
            x=x+2;
            }
        }
        
        System.out.println("Resultado= "+soma);
        
        
    }
    
}
