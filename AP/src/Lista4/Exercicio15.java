/*
 * Dado um vetor de números inteiros, fazer um programa que imprima o vetor em 
 * ordem crescente.
 */
package Lista4;

import java.util.Scanner;


public class Exercicio15 {
    static Scanner input =  new Scanner(System.in);
    
    static int[] crecenteVetor(int vetor[]){
        for(int i=0;i<vetor.length;i++){
            if(vetor[i]<vetor[i]){
                
            }
        }
        return vetor;
    }
    
    public static void main(String[] args) {
        System.out.print("Tamanho  vetor: ");
        int tamanho=Exercicio1.entrada();
        int vetor[]=Exercicio1.vetor(tamanho);
        vetor=crecenteVetor(vetor);
        Exercicio1.imprimirVetor(vetor);
    }
    
}
