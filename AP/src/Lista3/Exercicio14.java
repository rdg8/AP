/*
 * Faça uma função que receba dois números inteiros: um valor A e um valor N. 
Imprimir a soma dos N números a partir de A (inclusive). Se N for negativo ou 
ZERO, a função deve retornar -1. Exemplo: se A for 3 e N for 2, o resultado 
deverá ser 7, pois é a soma de 3 + 4.
 */
package Lista3;

import java.util.Scanner;


public class Exercicio14 {
    static Scanner input = new Scanner(System.in);
    
    static int entrada(){
        int x = input.nextInt();
        return x;
    }
    static int calculo(int A, int N){
        int resultado=0;
        if(N>0){
            for(int i=0;i<N;i++){
                resultado=resultado+(A+i);
            }
        }
        else{
            resultado=-1;
        }
        return resultado;
}
    static void imprimir(int resultado){
        System.out.println("Resultado ="+resultado);
    }
    
    public static void main(String[] args) {
        System.out.print("Escreva o A: ");
        int a=entrada();
        System.out.print("Escreva o N: ");
        int n=entrada();
        int resultado=calculo(a, n);
        imprimir(resultado); 
    }
}
