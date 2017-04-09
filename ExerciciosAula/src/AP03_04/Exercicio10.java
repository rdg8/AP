/*
 * 10- Crie um programa que simule uma calculadora simples capaz de realizar as operações
básicas. O programa deve receber 3 dados: dois números e um caractere. Este caractere
poderá ser '+', '-', ‘*' ou '/' , e representarão a operação matemática que você deseja
realizar entre os números.
 */
package AP03_04;

import java.util.Scanner;


public class Exercicio10 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Escreva o primeiro número: ");
        double n1 = console.nextDouble();
        System.out.print("Escreva o segundo número: ");
        double n2 = console.nextDouble();
        System.out.print("Escreva o operador matemático: ");
        String operador = console.next();
        double r=0;
        
        switch(operador){
            case ("+"):
            r = n1 + n2;
            break;
            case ("-"):
            r = n1 - n2;
            break;
            case ("*"):
            r = n1 * n2;
            break;
            case ("/"):
            r = n1 / n2;
            break;
            default:
                System.out.println("Escreva um operador valido");
 
        }
        
        System.out.println("Resultado: "+ r);
        
        
        
    }
    
}
