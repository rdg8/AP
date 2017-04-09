/*
 * 3- Crie um programa para informar quais e quantas notas são necessárias para entregar o
mínimo de cédulas para um determinado valor informado pelo usuário, Considere
notas de R$ 100, R$ 50, R$ 10 e R$ 5 e R$ 1. Seu programa deve mostrar apenas as notas
utilizadas. Por exemplo, ao solicitar R$18, o programa deve informar apenas a seguinte
informação (note que não foram exibidas informações sobre as demais cédulas):
1 nota(s) de R$ 10.
1 nota(s) de R$ 5.
3 nota(s) de R$ 1. 
 */
package AP03_04;

import java.util.Scanner;


public class Exercicio3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Escreva o valor: R$");
        int valor = console.nextInt();
        int nota50=0,nota100=0,nota10=0,nota5=0,nota1=0;

        if(valor>=100){
            nota100=valor/100;
            valor=valor%100;
            System.out.println("nota de R$100: "+ nota100);
        }
        if(valor>=50){
           nota50=valor/50;
           valor=valor%50; 
            System.out.println("nota de R$50: "+nota50);
        }
        if(valor>=10){
           nota10=valor/10;
           valor=valor%10; 
            System.out.println("nota de R410: "+ nota10);
        }
        if(valor>=5){
           nota5=valor/5;
           valor=valor%5; 
            System.out.println("nota de R$5: "+ nota5);
        }
        if(valor>=1){
           nota1=valor/1; 
            System.out.println("nota de R$1: "+ nota1);
        }
        
        
    }
    
}
