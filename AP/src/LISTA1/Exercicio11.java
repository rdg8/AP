/*
 * 11- Fazer um algoritmo que lê um número e verifica se ele é negativo. Se for 
 * negativo, imprimir na tela a mensagem "Numero negativo".
 */
package LISTA1;

import java.util.Scanner;


public class Exercicio11 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Escreva um número: ");
        float numero = console.nextFloat();
        
        if(numero<0){
            System.out.println("Número negativo");
        }
        
    }
}
