/*
 * Dado um vetor de números inteiros, fazer um programa que copie para outro 
 * vetor os número que são múltiplos de 3. Caso existam, imprimir os elementos 
 * que estão nas posições ímpares desse vetor.
 */
package Lista4;

import java.util.Scanner;

public class Exercicio20 {
    static Scanner input =  new Scanner(System.in);
    
    static int [] mult3(int vetor[],int vetorB[]){
        int resto;
        for(int i=0;i<vetor.length;i++){
            resto=vetor[i]%3;
            if(resto==0){
                vetorB[i]=vetor[i];
            }
        }
        return vetorB;
    }
    
    public static void main(String[] args) {
        System.out.print("Tamanho vetor: ");
        int tamanho=Exercicio1.entrada();
        int vetor[]=Exercicio1.vetor(tamanho);
        vetor=Exercicio1.populaVetor(vetor);
        int vetorB[]=Exercicio1.vetor(tamanho);
        vetorB=mult3(vetor, vetorB);
        Exercicio19.posicaoimpar(vetorB);
    }
}
