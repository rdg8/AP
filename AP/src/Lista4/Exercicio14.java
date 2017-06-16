/*
 * Dados dois vetores A e B de mesma dimensão, fazer um programa que monte o 
 * vetor C, o qual deve ser composto, alternadamente , por um elemento do vetor A
 * e outro do vetor B. Imprimir o vetor C.
 */
package Lista4;

import java.util.Scanner;


public class Exercicio14 {
    static Scanner input = new Scanner(System.in);
    static int[] populaC(int vetorA[],int vetorB[],int vetorC[]){
        int j=0;
        for(int i=0;i<vetorA.length;i++){           
            vetorC[j]=vetorA[i];               
            j++;
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
