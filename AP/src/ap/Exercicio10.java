/*
 * 10- Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total 
 * de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor 
 * ganha 15% de comissão sobre suas vendas efetuadas, calcular e imprimir o 
 * total a receber no final do mês.
 */
package ap;

import java.util.Scanner;


public class Exercicio10 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double Porcentagem=0.05d;
                
        System.out.print("Escreva o nome do Vendedor: ");
        String vendedor = console.nextLine();
        
        System.out.print("Escreva Salário fixo: R$");
        double salarioFixo = console.nextDouble();
        System.out.print("Escreva as Vendas efetuadas no mês: R$");
        double vendas = console.nextDouble();
        
        double salarioTotal = salarioFixo + (vendas *  Porcentagem);
        
        System.out.println("Salario total: R$"+salarioTotal);
        
        
    }
}
