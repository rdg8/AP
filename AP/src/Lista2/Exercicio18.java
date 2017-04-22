/*
 * A seguinte sequência de números 0, 1, 1, 2, 3, 5, 8, 13, 21... é conhecida 
 *como série de Fibonacci. Nessa sequência, cada número, depois dos 2 primeiros,
 * é igual à soma dos 2 anteriores. Escreva um algoritmo que leia um inteiro N 
 * (onde N < 46) e mostre os N primeiros números dessa série. Utilize o laço que
 * lhe for mais conveniente.
 */
package Lista2;

import java.util.Scanner;


public class Exercicio18 {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        
        System.out.print("Escreva um numero interiro menor que 46: ");
        int n = console.nextInt();
        int atual=0,anterior=1;
        while(n>46){
            System.err.print("Escreva um numero valido! MENOR QUE 46: ");
            n = console.nextInt();
        }            
        //0+1+1+2+3+5+8+13+21
        /*for(int i=1;i<n;i++){
            int proximo=atual+ anterior;
                        
                 System.out.println(proximo);
                atual=proximo;
                anterior=proximo;
        }
        */
       
		for(int a=0, b=1, i=0; i<n; b+=a, a=b-a, i++) {
			
                        System.out.print(a+", ");
		}  
		
	

        System.out.println("");
        
        
    }
    
}
