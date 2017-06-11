/*
 * Dado um vetor de números reais, fazer um programa que some todos os elementos
 * do vetor e imprima o resultado.
 */
package Lista4;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Exercicio2 {
    static Scanner input = new Scanner(System.in);
    
    static double[] populaVetor(double vetor[]){
        for(int i=0;i<vetor.length;i++){
            System.out.print("Número: ");
            vetor[i]=entrada();
        }
        return vetor;
    }
    static double entrada(){
    double n= input.nextDouble();
    return n;
    }
    static double[] vetor(int n){
        double []vetor = new double[n];
        return vetor;
    }
    static double somaVetor(double vetor[]){
        double soma=0;
        for(int i=0;i<vetor.length;i++){
            soma=soma+vetor[i];
        }
        return soma;
    }
    static void imprimirVetor(double vetor[]){
        for(int i=0;i<vetor.length;i++){
            System.out.println("posição "+i+" "+(vetor[i]));
        }
    }
    
    public static void main(String[] args) {
        System.out.print("Escreva o tamanho do vetor: ");
        int tamanho=input.nextInt();          
        double vetor[] = vetor(tamanho);
        vetor=populaVetor(vetor);
        double soma=somaVetor(vetor);
        System.out.println("soma= "+soma);
    }
    
    
}
