/*
 * Dado um vetor de números inteiros, fazer um programa que imprima o maior 
 * elemento do vetor.
 */
package Lista4;

import java.util.Scanner;

public class Exercicio3 {
    static Scanner input = new Scanner(System.in);
    
    static int maior(int vetor[]){
        int maior=0;
        for(int i=0;i<vetor.length;i++)
            if(vetor[i]>maior){
                maior=vetor[i];
            }
        return maior;
    }
    
    public static void main(String[] args) {
        System.out.print("Tamanho vetor: ");  
        int n=Exercicio1.entrada();
        int vetor[] = Exercicio1.vetor(n);
        vetor=Exercicio1.populaVetor(vetor);
        int maior=maior(vetor);
        System.out.println("Maior número= "+maior);      
    }
    
}
