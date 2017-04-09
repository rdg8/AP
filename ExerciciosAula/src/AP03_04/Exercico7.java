/*
 * 7- Criar um programa para identificar o valor a ser pago por um plano de saúde dada a
idade do conveniado, considerando que todos pagam R$ 100 mais um adicional
conforme a seguinte tabela:
1) crianças com menos de 10 anos pagam R$80;
2) conveniados com idade entre 10 e 30 anos pagam R$50;
3) conveniados com idade entre 40 e 60 anos pagam R$ 95; e
4) conveniados com mais de 60 anos pagam R$130.
 */
package AP03_04;

import java.util.Scanner;


public class Exercico7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Escreva idade do conveniado: ");
        int idade = console.nextInt();
        String I="0";
        
        if(idade<10){
            I = "crianca";
        }
        else if(idade<40){
            I = "30";
        }
        else if(idade<=60){
            I = "60";
        }
       
                
          System.out.println(I);      
        switch (I){
            case "crianca":
                int valor = 100+80;
                System.out.println("Valor a pagar: R$"+ valor);
                break;
            case "30":
                valor = 100 + 50;
                System.out.println("Valor a pagar: R$"+ valor);
                break;
            case "60":
                valor = 100 + 95;
                System.out.println("Valor a pagar: R$"+ valor);
                break;
            default:
                valor = 100 + 130;
                System.out.println("Valor a pagar: R$"+ valor);
            
        }
        
    }
    
}
