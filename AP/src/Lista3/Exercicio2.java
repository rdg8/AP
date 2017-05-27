/*
 * Fazer uma função chamada somatoria que tem como parâmetro de entrada um 
número inteiro positivo N e fornece como saída a soma de todos os números 
inteiros positivos menores ou iguais a N.
Exemplo: se N for 3, a função deve retornar 6, que é a soma de 1 + 2 + 3.
 */
package Lista3;

import java.util.Scanner;


public class Exercicio2 {
    static Scanner input = new Scanner(System.in);
    
    static int entrada(){
        System.out.print("Número: ");
        int n = input.nextInt();
        return n;
    }
    static int somatoria(int n){
        int soma=0;
        for(int i=1; i<=n; i++){
            soma=soma+i;
        }
        return soma;
    }
    static void imprimir(int Soma){
        System.out.println("Somatoria ="+Soma);
    }
    
    public static void main(String[] args) {
        int n=entrada();
        int soma= somatoria(n);
        imprimir(soma);
    }
    
}
