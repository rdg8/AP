/*
 * 8- Criar um programa para calcular o valor da multa a ser paga de anuidade de uma
associação. A anuidade deve ser paga no mês de janeiro. Por mês, é cobrado 5% de
juros (com juros sobre juros). Por exemplo, uma associação de R$100 paga em janeiro,
custa R$ 100; em fevereiro, custa R$105; em março, custa R$110,25; e, em dezembro,
R$171,03. 
 */
package AP03_04;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Escreva o mês: ");
        String mes = console.next();
        double Associacao = 100;
        
        switch(mes){
            case "janeiro":
                System.out.println("Valor a ser pago é: R$"+ Associacao);
            case "fevereiro":
                double valor = 100*(Math.pow((1 + 0.05),2));;
                System.out.println("Valor a ser pago é: R$"+ valor);
                break;
            case "março":
                valor = 100*(Math.pow((1 + 0.05),3));
                //F = P.(1 + i)n
                System.out.println("Valor a ser pago é: R$"+ valor);
                break;
            case "abril":
                valor = 100*(Math.pow((1 + 0.05),4));
                System.out.println("Valor a ser pago é: R$"+ valor);
                break;
            case "maio":
                valor = 100*(Math.pow((1 + 0.05),5));;
                System.out.println("Valor a ser pago é: R$"+ valor);
                break;
            case "junho":
                valor = 100*(Math.pow((1 + 0.05),6));;
                System.out.println("Valor a ser pago é: R$"+ valor);
                break;
            case "julho":
                valor = 100*(Math.pow((1 + 0.05),7));;
                System.out.println("Valor a ser pago é: R$"+ valor);
                break;
            case "agosto":
                valor = 100*(Math.pow((1 + 0.05),8));;
                System.out.println("Valor a ser pago é: R$"+ valor);
                break;
            case "setembro":
                valor = 100*(Math.pow((1 + 0.05),9));;
                System.out.println("Valor a ser pago é: R$"+ valor);
                break;
            case "outubro":
                valor = 100*(Math.pow((1 + 0.05),10));;
                System.out.println("Valor a ser pago é: R$"+ valor);
                break;
            case "novembro":
                valor = 100*(Math.pow((1 + 0.05),11));;
                System.out.println("Valor a ser pago é: R$"+ valor);
                break;
            case "dezembro":
                valor = 100*(Math.pow((1 + 0.05),12));;
                System.out.println("Valor a ser pago é: R$"+ valor); 
                break;
                default:
                    System.out.println("Escreva um mês valido");
        }
        
        
        
    }
    
}
