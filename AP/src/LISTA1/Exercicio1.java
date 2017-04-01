/*
 * 1- Fazer um algoritmo que leia dois números e imprima na tela o produto 
 * (multiplicação) dos dois números.
 */
package LISTA1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        //variaveis
        float n1,n2,produto;
        //entrada
        System.out.print("Escreva o primeiro número: ");
        n1 = console.nextFloat();
        System.out.print("Escreva o segundo número: ");
        n2 = console.nextFloat();
        //processamento
        produto = n1*n2;
        //saida
        System.out.println("Produto= "+ produto);
                        
        
        
    }
    
}
