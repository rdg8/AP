/*
 * Use o laço while para ler 06 valores do usuário. Ao final do laço, imprimir:
 * 1. Soma de todos os valores digitados que foram positivos;
 * 2. Quantidade de valores digitados que foram positivos.
 * 3. Média (decimal) de todos os valores digitados que foram positivos
 */
package AP10_04;

import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        
        int i=1,soma=0,quantidade=0;
        
        while(i<=6){
            System.out.print("Escreva o "+ i +" valor: ");
            int numero = console.nextInt();
            i++;  
            if(numero>0){
                soma=soma+numero;
                quantidade++;
            }
        }
            int media=soma/quantidade;
            System.out.println("Soma dos valores positivos digitatos: "+ soma);
            System.out.println("Quantidade de valores digitados positivos:"+ quantidade);
            System.out.println("Media dos valores digitados positivos:"+ media);
        
        
    }
    
}
