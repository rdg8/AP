/*
 * Dado um vetor de números inteiros, fazer um programa que imprima o produto 
 * dos elementos do vetor.
 */
package Lista4;

import java.util.Scanner;


public class Exercicio6 {
    static Scanner input = new Scanner(System.in);
    
    static int produto(int vetor[]){
        int produto=1;
        for(int i=0;i<vetor.length;i++){
            produto=produto * vetor[i];
        }
        return produto;
    }
    
    public static void main(String[] args) {
        System.out.print("Escreva o tamanho do vetor: ");
        int tamanho=Exercicio1.entrada();
        int vetor[] = Exercicio1.vetor(tamanho);
        vetor=Exercicio1.populaVetor(vetor);
        int produto=produto(vetor);
        System.out.println("Produto do vetor = "+produto);
    }
    
}
