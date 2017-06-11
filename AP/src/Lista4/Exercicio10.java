/*
 * Dado um vetor de números reais e um número real, fazer um programa que 
 * multiplique os elementos de posição ímpar do vetor pelo número real dado e 
 * imprima o resultado.
 */
package Lista4;

import java.util.Scanner;


public class Exercicio10 {
    static Scanner input = new Scanner (System.in);
    
    static void multiplicaImpar(double vetor[], double n){
        double resultado,resto;
        for(int i=0;i<vetor.length;i++){
            resto=i%2;
            if(resto!=0){
                resultado=vetor[i]*n;
                System.out.println("posição "+i+" = "+resultado);  
            }
        }
        
    }
    
    public static void main(String[] args) {
        System.out.print("tamanho vetor: ");
        int tamanho=input.nextInt();
        double vetor[]=Exercicio2.vetor(tamanho);
        vetor=Exercicio2.populaVetor(vetor);
        System.out.print("Número que o vetor vai ser multiplicado: ");
        double n=Exercicio2.entrada();
        multiplicaImpar(vetor, n);
        
        
    }
    
}
