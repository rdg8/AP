/*
 * Dados dois vetores A e B de mesma dimensão, fazer um programa que calcule e 
 * imprima o produto de cada elemento de A pelo correspondente elemento de B. 
 * O resultado deve ser armazenado em um vetor C.
 */
package Lista4;

import AP03_04.Exercico7;
import java.util.Scanner;


public class Exercicio9 {
    static Scanner input = new Scanner (System.in);
    
    static int[] produtoVetores(int []vetorA, int []vetorB, int tamanho){
        int []vetorC=Exercicio1.vetor(tamanho);
        for(int i=0;i<tamanho;i++){
            vetorC[i]=vetorA[i] * vetorB[i];
        }
        return vetorC;
    }
    
    public static void main(String[] args) {
        System.out.print("tamanho vetor: ");
        int tamanho=Exercicio1.entrada();
        int []vetorA=Exercicio1.vetor(tamanho);
        int []vetorB=Exercicio1.vetor(tamanho);
        System.out.println("Vetor A");
        vetorA=Exercicio1.populaVetor(vetorA);
        System.out.println("Vetor B");
        vetorB=Exercicio1.populaVetor(vetorB);
        int []vetorC=produtoVetores(vetorA, vetorB, tamanho);
        Exercicio1.imprimirVetor(vetorC);
        
    }
    
}
