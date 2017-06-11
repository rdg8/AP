/*
 * Dado um vetor de números inteiros e um número inteiro, fazer um programa que 
 * verifique se o número está presente no vetor.
 */
package Lista4;

import java.util.Scanner;


public class Exercicio8 {
    static Scanner input = new Scanner(System.in);
    
    static boolean vereficaVetor(int vetor[], int n){
        boolean verifica=false;
        for(int i=0;i<vetor.length;i++){
            if(n==vetor[i]){
                verifica=true;
            }
        }
        return  verifica;
    }
    
    public static void main(String[] args) {
        System.out.print("Tamanho do vetor: ");
        int tamanho=Exercicio1.entrada();
        int vetor[]=Exercicio1.vetor(tamanho);
        vetor=Exercicio1.populaVetor(vetor);
        System.out.print("ver se o número esta no vetor: ");
        int n=Exercicio1.entrada();
        boolean estar=vereficaVetor(vetor, n);
        System.out.println(estar);
    }
    
}
