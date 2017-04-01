/*
 * Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D
 * for maior do que A, e a soma de C com D for maior que a soma de A e B e se C 
 * e D, ambos, forem positivos e se a variável A for par escrever a mensagem 
 * "Valores aceitos", senão escrever "Valores nao aceitos".
 */
package LISTA1;

import java.util.Scanner;


public class Exercicio17 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Escreva o 1º numero: ");
        int A = console.nextInt();
        System.out.print("Escreva o 2º numero: ");
        int B = console.nextInt();
        System.out.print("Escreva o 3º numero: ");
        int C = console.nextInt();
        System.out.print("Escreva o 4º numero: ");
        int D = console.nextInt();
        
        
        
        if((C + D > A + B) && (D>0)&&(C>0)&&(A%2==0)) {
            if((B>C) && (D>A)){
                System.out.println("Valores aceitos");
            
            }
        }
        else{
            System.out.println("Valores nao aceitos");
        
        }
        
        
        
        
    }
    
}
