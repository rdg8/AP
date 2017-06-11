/*
 * Dado um vetor de números inteiros, fazer um programa que imprima a média dos 
 * elementos do vetor.
 */
package Lista4;

import java.util.Scanner;

public class Exercicio5 {
    static Scanner input = new Scanner(System.in);
    
    static int media(int vetor[]){
        int media=0;
        for(int i=0;i<vetor.length;i++){
            media=media+vetor[i];
        }
        media=media/vetor.length;
        return media;
    }
    
    public static void main(String[] args) {
        System.out.print("Escreva o tamanho do vetor: ");
        int tamanho=Exercicio1.entrada();
        int vetor[] = Exercicio1.vetor(tamanho);
        vetor=Exercicio1.populaVetor(vetor);      
        int media=media(vetor);
        System.out.println("Media= "+media);
    }
            
    
}
