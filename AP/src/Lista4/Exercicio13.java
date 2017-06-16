/*
 * Dados dois vetores A e B de mesma dimensão, fazer um programa que monte o 
 * vetor C, o qual deve ser composto pelos elementos do vetor A e depois pelos 
 * elementos do vetor B. Imprimir o vetor C.
 */
package Lista4;

import java.util.Scanner;


public class Exercicio13 {
    static Scanner input = new Scanner(System.in);

    static int[] populaC(int vetorA[],int vetorB[],int vetorC[]){
        for(int i=0;i<vetorA.length;i++){
            vetorC[i]=vetorA[i];
        }
        int j=vetorB.length;
        for(int i=0;i<vetorB.length;i++){          
            vetorC[j]=vetorB[i];
            j++;
        }
        return vetorC;
    }
    
    public static void main(String[] args) {
        System.out.print("Tamanho vetor: ");
        int tamanho=Exercicio1.entrada();
        int []vetorA=Exercicio1.vetor(tamanho);
        System.out.println("Vetor A:");
        vetorA=Exercicio1.populaVetor(vetorA);
        
        int []vetorB=Exercicio1.vetor(tamanho);
        System.out.println("Vetor B:");
        vetorB=Exercicio1.populaVetor(vetorB);
        int vetorC[]=Exercicio1.vetor(tamanho*2);
        vetorC=populaC(vetorA, vetorB, vetorC);
        Exercicio1.imprimirVetor(vetorC);
        
    }
    
}
