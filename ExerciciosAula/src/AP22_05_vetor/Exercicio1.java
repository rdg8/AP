/*
 * Faça uma função que copie o conteúdo de um vetor em um segundo vetor.


 */
package AP22_05_vetor;

import static AP22_05_vetor.ExemploVetor.input;
import java.util.Scanner;

/**
 *
 * @author rodrigo.rsantos17
 */
public class Exercicio1 {
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
    public static void main(String[] args) {
        int t=tamanhoVetor();
        int[] vetor=Vetor(t);
        vetor=lotaVetor(vetor);
        int[] vetor2=recebe(vetor, t);
        imprimirVetor(vetor2);
        
    }    
    
}
