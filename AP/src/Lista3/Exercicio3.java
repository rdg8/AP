/*
 * Fazer uma função chamada fatorial que tem como parâmetro de entrada um 
número inteiro positivo n e fornece como saída o fatorial desse número.
Exemplo: se N for 5, a função deve retornar 120, que é a multiplicação de 
1 * 2 * 3 * 4 * 5
 */
package Lista3;

import java.util.Scanner;


public class Exercicio3 {
    static Scanner input = new Scanner(System.in);
    
    static int entrada(){
        System.out.print("Número: ");
        int n=input.nextInt();
        return n;
    }
    static int fatorial(int n){
        int soma=1;
        for(int i=1; i<=n; i++){
            soma=soma*i;
        }
        return soma;
    }
    static void imprimir(int fat){
            System.out.println("Fatorial ="+fat);
    }
    
    public static void main(String[] args) {
        int n=entrada();
        int fatorial= fatorial(n);
        imprimir(fatorial);
        
    }
    
}
