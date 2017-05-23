/*
 * Leia um valor inteiro N do usuário, onde N é maior ou igual a 2 e menor ou 
 * igual a 1000.
 * A seguir, usando o laço DO-WHILE, mostre a tabuada de N no seguinte formato:
 * 1 x N = N 2 x N = 2N ... 10 x N = 10N
 */
package AP10_04;

import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args){
        Scanner console= new Scanner(System.in);
        
        System.out.print("Escreva um valor: ");
        int n = console.nextInt();
        int i=1;
        
        if((n>=2)&(n<=1000)){
            do{
                int tabuada=n*i;
                System.out.println(i+"x"+n+"="+tabuada);
                i++;
            }
            while(i<=10);
                    
            
            
        }
        
        else{
            System.err.println("Valor INVALIDO \n Digite um valor >=2 & <=1000");
        }
        
        
        
        
        
    }
    
}
