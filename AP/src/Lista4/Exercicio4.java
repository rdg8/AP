/*
 * Dado um vetor de números reais, fazer um programa que imprima o menor 
 * elemento do vetor
 */
package Lista4;

import java.util.Scanner;


public class Exercicio4 {
    static Scanner input = new Scanner(System.in);
    
    static double menor(double vetor[]){
        double menor=vetor[0];
        for(int i=0;i<vetor.length;i++){
            if(vetor[i]<menor){
                menor=vetor[i];
            }
        }
        return menor;
    }
    
    public static void main(String[] args) {
        System.out.print("Escreva o tamanho do vetor: ");
        int tamanho=input.nextInt();          
        double vetor[] = Exercicio2.vetor(tamanho);
        vetor=Exercicio2.populaVetor(vetor);
        double menor=menor(vetor);
        System.out.println("Menor número= "+menor);
    }
    
}
