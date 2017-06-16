/*
 * Dado um vetor de números reais e um número real, fazer um programa que 
 * multiplique todos os elementos do vetor pelo número real dado e 
 * imprima o resultado.
 */
package Lista4;

import java.util.Scanner;


public class Exercicio17 {
    static Scanner input =  new Scanner(System.in);
    
    static double[] mult(double vetor[], double m){
        for(int i=0;i<vetor.length;i++){
            vetor[i]=vetor[i]*m;
        }
        return vetor;
    }
    
    public static void main(String[] args) {
        System.out.println("Tamanho vetor");
        int tamanho=input.nextInt();
        double vetor[]=Exercicio2.vetor(tamanho);
        vetor=Exercicio2.populaVetor(vetor);
        System.out.print("Numero que sera o multiplicador: ");
        double m=Exercicio2.entrada();
        vetor=mult(vetor, m);
        Exercicio2.imprimirVetor(vetor);
    }
}
