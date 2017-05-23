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
        int nota=0;
        
        nota=valor%100;
        
        
        
        
        switch(nota){
            
        }
            
        
        
        
        
    }
    
}
