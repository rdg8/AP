/*
 * Fazer um algoritmo que lê dois números e imprime a soma dos 
 * quadrados dos dois números. 
 * O quadrado de um número A é representado por A 2 = A * A.
 */
package LISTA1;

import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        //variaveis
        int n1,n2,soma;
        //entrada
        System.out.print("Escreva o primeiro número: ");
        n1 = console.nextInt();
        System.out.print("Escreva o segundo número: ");
        n2 = console.nextInt();
        //processamento
        n1 = n1*n1;
        n2 = n2*n2;
        soma = n1+n2;
        //saida
        System.out.println("soma= "+ soma);
        
         
    }
    
}
