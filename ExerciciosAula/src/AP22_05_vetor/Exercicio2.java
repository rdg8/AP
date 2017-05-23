/*
 * Faça uma função que some o conteúdo de dois vetores e armazene o resultado em um terceiro vetor.

 */
package AP22_05_vetor;

import java.util.Scanner;


public class Exercicio2 {
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
    static int[] recebe(int[] vetor,int t){
        int[] vetor2=new int[t];
        for(int i=0;i<vetor.length;i++){
            vetor2[i]=vetor[i];
        }
        return vetor2;
    }
    static void imprimirVetor(int[] vetor){
        for(int i=0;i<vetor.length;i++){
            System.out.println("["+i+"]: "+vetor[i]);
           
        }
    }
    static int[] soma (int[] vetor,int t,int[] vetor2){
        int[] soma= new int[t];
        for(int i=0;i<vetor.length;i++){
           soma[i]= vetor[i]+vetor2[i];
        }
        return soma;
    }
    public static void main(String[] args) {
        int t=tamanhoVetor();
        int[] vetor=Vetor(t);
        vetor=lotaVetor(vetor);
        System.out.println("vetor2");
        int[] vetor2=Vetor(t);
        vetor2=lotaVetor(vetor);
        System.out.println("Soma do vetor 1 com o vetor 2  é");
        int[] soma=soma(vetor, t, vetor2);
        imprimirVetor(soma);
        
       
        
    }    
    
}
