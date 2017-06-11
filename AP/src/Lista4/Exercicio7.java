/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista4;

import java.util.Scanner;


public class Exercicio7 {
    static Scanner input = new Scanner(System.in);
    
    static int[] multipliqueVetor(int vetor[], int n){
        for(int i=0;i<vetor.length;i++){
         vetor[i]=n * vetor[i];            
        }
        return vetor;
    }
    
    public static void main(String[] args) {
        System.out.print("Escreva o tamanho do vetor: ");
        int tamanho=Exercicio1.entrada();
        int vetor[] = Exercicio1.vetor(tamanho);
        vetor=Exercicio1.populaVetor(vetor);
        System.out.print("Número que o vetor vai ser multiplicado: ");
        int n=Exercicio1.entrada();
        vetor=multipliqueVetor(vetor, n);
        Exercicio1.imprimirVetor(vetor);
    }
    
}
