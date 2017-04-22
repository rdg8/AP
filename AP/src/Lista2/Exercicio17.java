/*
 * Ler um número inteiro N e calcular e imprimir todos os seus divisores. 
 * Exemplo: para o número 6, temos os seguintes divisores 1, 2, 3, 6. 
 * Utilize o laço que lhe for mais conveniente.
 */
package Lista2;

import java.util.Scanner;


public class Exercicio17 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Escreva um numero para saber seus divisores: ");
        int n = console.nextInt();
        int i=n;
        
        System.out.print(n+" é divisivel por: ");
        do{
            int divisores=n%i;
            if(divisores==0){
                System.out.print(i+", ");
            }
                
            i=i-1;
        }while(i>0);
        
                
        
        System.out.println("");
        
        
    }
    
}
