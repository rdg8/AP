/*
 * Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, um valor 
 * por linha, inclusive o X, se for o caso. Use o laço for.
 */
package AP10_04;

import java.util.Scanner;


public class Exercicio2 {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        
        System.out.print("Escreva até que número você que saber que são impares: ");
        int x = console.nextInt();
        
        System.out.println("Esse são os números impares entre 1 e "+ x);
        for(int i=1;i<=x;i++){
            int div=i%2;
            if(div!=0){
                System.out.println(i);
            }
        }
        
        
    }
    
}
