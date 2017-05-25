/*
 * Faça uma função que recebe, por parâmetro, um valor inteiro e positivo e 
retorna o número de divisores desse valor.
 */
package Lista3;

import java.util.Scanner;


public class Exercicio13 {
    static Scanner input = new Scanner(System.in);
    
    static int entrada(){
        int x=input.nextInt();
        return x;
    }
    static boolean posistivo(int x){
        boolean positivo=false;
        if(x>0){
            positivo=true;
        }
        return positivo;
    }
    static int divisor(int x){
        int divisor=1,ndivisor=0;
        for(int i=1;i<=x;i++){
            divisor=x%i; 
            if(divisor==0){
                ndivisor++;
            }           
        }
        return ndivisor;
    }
    static void imprimir(int resultado){
        System.out.println("Número de divisores ="+resultado);
    }
    
   public static void main(String[] args) {
       boolean positivo;
       do{ 
           
           System.out.print("Digite um número para ver seu número de divisores: ");
           int n=entrada();
           positivo=posistivo(n);
           if(positivo){
           int ndivisor=divisor(n);
           imprimir(ndivisor);
           }
       }while(positivo==false);
    }
    
}
