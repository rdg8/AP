/*
 * Escreva um programa que leia o número de cadastro de um funcionário, seu 
 * número de horas trabalhadas, o valor que recebe por hora e calcula o salário 
 * desse funcionário. A seguir, mostre na tela o número e o salário do 
 * funcionário
 */
package LISTA1;

import java.util.Scanner;


public class Exercicio9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Escreva o número de casdatro do funcionário: ");
        int cadastro = console.nextInt();
        System.out.print("Escreva o número de horas trabalhadas: ");
        float horasTrabalhadas = console.nextFloat();
        System.out.print("Escreva o Salário por hora: R$");
        float salarioHora = console.nextFloat();
        
        
        float salario = salarioHora * horasTrabalhadas;
        
        System.out.println("\nNúmero de cadastro do funcionário: "+ cadastro +
                "\nSalário do funcionário: R$"+ salario);
        
        
        
        
        
        
        
    }
}
