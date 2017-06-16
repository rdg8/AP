/*
 * Fazer um programa que lê uma sequência de N números inteiros positivos e 
reordena os elementos da sequência de modo que todos os números pares venham 
primeiro e todos os ímpares em seguida. Por exemplo, para a sequência 
[3, 6, 7, 8, 1, 2, 5, 3, 9], a saída deverá ser: [6, 8, 2, 3, 7, 1, 5, 3, 9].
 */
package Lista4;

import java.util.Scanner;


public class Exercicio16 {
    static Scanner input =  new Scanner(System.in);
    
    static void paresImpar(int vetor[]){
        int resto;
        System.out.println("Pares");
        for(int i=0;i<vetor.length;i++){
            resto=vetor[i]%2;
            if(resto==0){
                System.out.println(vetor[i]);
            }
        }
        System.out.println("Impares");
        for(int i=0;i<vetor.length;i++){
            resto=vetor[i]%2;
            if(resto!=0){
                System.out.println(vetor[i]);
            }
        }    
    }
    
    public static void main(String[] args) {
        System.out.print("Tamanho  vetor: ");
        int tamanho=Exercicio1.entrada();
        int vetor[]=Exercicio1.vetor(tamanho);
        vetor=Exercicio1.populaVetor(vetor);
        paresImpar(vetor);
    }
}
