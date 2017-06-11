/*
 * Dado um vetor de números inteiros, fazer um programa que imprime todos os 
 * elementos do vetor.
 */
package Lista4;

import java.util.Scanner;


public class Exercicio1 {
    static Scanner input = new Scanner(System.in);
    
    static int[] populaVetor(int vetor[]){
        for(int i=0;i<vetor.length;i++){
            System.out.print("Número: ");
            vetor[i]=entrada();
        }
        return vetor;
    }
    static int entrada(){
    int n= input.nextInt();
    return n;
    }
    static int[] vetor(int n){
        int []vetor = new int [n];
        return vetor;
    }
    static void imprimirVetor(int vetor[]){
        for(int i=0;i<vetor.length;i++){
            System.out.println("posição "+i+" resultado= "+(vetor[i]));
        }
    }
    
    public static void main(String[] args) {
        System.out.print("Escreva o tamanho do vetor: ");
        int tamanho=entrada();
        int vetor[] = vetor(tamanho);
        vetor=populaVetor(vetor);
        imprimirVetor(vetor);
    }
    
}
