/*
 * Fazer um programa que imprime os elementos que estão nas posições ímpares de
 * um vetor (começando na posição 1, que corresponde à posição 0 em Java). 
 * Por exemplo, para o vetor [6, 8, 2, 3, 7, 1, 5, 3, 9], seriam impressos os 
 * números: 6, 2, 7, 5, 9.
 */
package Lista4;

import java.util.Scanner;


public class Exercicio19 {
    static Scanner input =  new Scanner(System.in);
    
    static void posicaoimpar(int vetor[]){
        for(int i=0;i<vetor.length;i++){
            System.out.println(vetor[i]);
            i++;
        }
    }
    
    public static void main(String[] args) {
        System.out.print("Tamanho vetor: ");
        int tamanho=Exercicio1.entrada();
        int vetor[]=Exercicio1.vetor(tamanho);
        vetor=Exercicio1.populaVetor(vetor);
        posicaoimpar(vetor);
    }
    
    
}
