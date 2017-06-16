/*
 * Fazer um programa que verifica se determinado número dado está dentro de um 
 * vetor também dado. Caso esteja, imprimir a posição em que o número foi
 * encontrado.
 */
package Lista4;

import java.util.Scanner;


public class Exercicio18 {
    static Scanner input =  new Scanner(System.in);
    
    static void numero(int []vetor,int n){
        boolean esta=false;
        for(int i=0;i<vetor.length;i++){
          if(n==vetor[i]){
              System.out.println(vetor[i]+" posição "+i);
              esta=true;
          }  
        }
        if(esta){}
        else{
            System.out.println(n+" Não esta no vetor");
        }
    }
    
    public static void main(String[] args) {
        System.out.print("Tamanho vetor: ");
        int tamanho=Exercicio1.entrada();
        int vetor[]=Exercicio1.vetor(tamanho);
        vetor=Exercicio1.populaVetor(vetor);
        System.out.print("Numero que deseja encontra: ");
        int n=Exercicio1.entrada();
        numero(vetor, n);
    }
}
