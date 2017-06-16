/*
 * Dado um vetor de números reais, fazer um programa que imprima os números 
 * maiores do que a média dos elementos que estão nas posições pares do vetor.
 */
package Lista4;

import java.util.Scanner;


public class Exercicio11 {
    static Scanner input = new Scanner(System.in);
    
    static double mediaPar(double vetor[]){
        double media=0,resto,P=0;
        for(int i=0;i<vetor.length;i++){
            resto=vetor[i]%2;
            if(resto==0){
                media=media+vetor[i];
                P++;
            }
        }
        media=media/P;
        return media;
    }
    static void maiorMedia(double vetor[],double media){
        for(int i=0;i<vetor.length;i++){
            if(vetor[i]>media){
                System.out.println(vetor[i]);             
            }
        }
    }
    
    public static void main (String[]args){
        System.out.print("tamanho do vetor: ");
        int tamanho=input.nextInt();
        double vetor[]=Exercicio2.vetor(tamanho);
        vetor=Exercicio2.populaVetor(vetor);
        double media=mediaPar(vetor);
        System.out.println("Números maior que a media"+media+":");
        maiorMedia(vetor, media);
        
    }
    
}
