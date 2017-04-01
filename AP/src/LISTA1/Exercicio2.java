/*
 * 2- Fazer um algoritmo que lê dois números, a base e o expoente, e 
 * imprime a potência
 */
package LISTA1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        
        double base,expoente,potencia;
        //entrada
        System.out.print("Escreva a base: ");
        base = console.nextDouble();
        System.out.print("Escreva expoente: ");
        expoente = console.nextDouble();
        //processamento
        potencia = Math.pow(base,expoente);
        //saida
        System.out.println("potencia= "+ potencia);
        
    }    
    
}
