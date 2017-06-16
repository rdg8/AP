/*
 * Dados dois vetores A e B de mesma dimensão, fazer um programa que verifica a 
 * soma e a média de cada vetor, e imprime a maior soma e a menor média
 */
package Lista4;

import java.util.Scanner;


public class Exercicio12 {
    static Scanner input = new Scanner(System.in);
    
    static int soma(int vetor[]){
        int soma=0;
        for(int i=0;i<vetor.length;i++){
            soma=soma+vetor[i];
        }
        return soma;
    }
    
    public static void main(String[] args) {
        System.out.print("Tamanho Vetores: ");
        int tamanho=Exercicio1.entrada();
        System.out.println("Vetor A");
        int vetorA[]=Exercicio1.vetor(tamanho);
        vetorA=Exercicio1.populaVetor(vetorA);
        System.out.println("Vetor B");
        int vetorB[]=Exercicio1.vetor(tamanho);
        vetorB=Exercicio1.populaVetor(vetorB);
        int mediaA=Exercicio5.media(vetorA);
        int mediaB=Exercicio5.media(vetorB);
        System.out.println("Maior media: ");
        if(mediaA>mediaB){
            System.out.println("A="+mediaA);
        }
        else{
            System.out.println("B="+mediaB);
        }
        int somaA=soma(vetorA);
        int somaB=soma(vetorB);
        System.out.println("Maior soma: ");
        if(somaA>somaB){
            System.out.println("A="+somaA);
        }
        else{
            System.out.println("B="+somaB);
        }
            
    }
    
    
}
