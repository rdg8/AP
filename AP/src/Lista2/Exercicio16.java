/*
 * Leia um valor inteiro N. Este valor será a quantidade de valores que serão 
 * lidos em seguida do usuário. Para cada valor lido, mostre uma mensagem em 
 * português dizendo se este valor lido é par (PAR), ímpar (ÍMPAR), 
 * positivo (POSITIVO) ou negativo (NEGATIVO). No caso do valor ser igual a zero
 * (0), seu programa deverá imprimir apenas NULO. Utilize o laço DO-WHILE.
 */
package Lista2;

import java.util.Scanner;


public class Exercicio16 {
    public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    
        System.out.print("Escreva um numero: ");
        int quantidade = console.nextInt();
        int i=0;
        
        do{
            System.out.println("Escreva um numero");
            int n=console.nextInt();
            int par=n%2;
            
            if(n!=0){
                if((n>0) & (par==0)){
                    System.out.println(n+" É par e positivo");
                }
                else if((n<0)&&(par==0)){
                    System.out.println(n+" É par e negativo");
                }
                else if((n<0)&&(par!=0)){
                    System.out.println(n+" É impar e negativo");
                }
                else if((n>0)&&(par!=0)){
                    System.out.println(n+" É impar e positivo");
                }
                
                
            }
            else{
                System.err.println("NULO");
            }
            
            i++;        
        }while(i<quantidade);
    
    
       
                
    }
    
}
