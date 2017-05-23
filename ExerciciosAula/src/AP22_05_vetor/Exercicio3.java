/*
 * Crie uma função para unir dois vetores de mesmo tamanho e mesmo tipo em um terceiro vetor com dobro do tamanho.


 */
package AP22_05_vetor;

import java.util.Scanner;


public class Exercicio3 {
    static Scanner input = new Scanner (System.in);
    
    static int tamanhoVetor(){
        System.out.print("Digite o tamnaho do vetor: ");
        int t=input.nextInt();
        return t;
    }
    static int[] Vetor(int t){
        int vetor[] = new int [t];
        return vetor;
    }
    static int[] lotaVetor(int[] vetor){
        for(int i=0;i<vetor.length;i++){
        System.out.print("digite um número: ");
        vetor[i] = input.nextInt();
        }
        System.out.println("");
        return vetor;
    }
    static int[] recebe(int[] vetor,int t,int[] vetor2){
        int[] vetor3=new int[t*2];
        for(int i=0;i<vetor.length;i++){
            vetor3[i]=vetor[i];
        }
        for(int i=0;i<vetor2.length;i++){
           vetor3[i+vetor2.length]=vetor2[i];
        }
        return vetor3;
    }
    static void imprimirVetor(int[] vetor){
        for(int i=0;i<vetor.length;i++){
            System.out.println("["+i+"]: "+vetor[i]);
           
        }
    }
    public static void main(String[] args) {
        int t=tamanhoVetor();
        int[] vetor=Vetor(t);
        vetor=lotaVetor(vetor);
        System.out.println("vetor2");
        int[] vetor2=Vetor(t);
        vetor2=lotaVetor(vetor);
        int[] vetor3=recebe(vetor, t, vetor2);
        imprimirVetor(vetor3);
        
        
       
        
    }    
    
}
