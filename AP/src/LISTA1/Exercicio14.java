/*
 * 14- Fazer um algoritmo que leia dois números e imprime a divisão do maior pelo 
 * menor
 */
package LISTA1;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Escreva o primeiro número: ");
        float n1 = console.nextFloat();
        System.out.print("Escreva o segundo número: ");
        float n2 = console.nextFloat();
        
        float divisao;
        
        if(n1>n2){
            divisao=n1/n2;
            System.out.println("Divisão= "+ divisao);
        }
        else{
            divisao=n2/n1;
            System.out.println("Divisão= "+ divisao);
        }
        
    }
    
}
