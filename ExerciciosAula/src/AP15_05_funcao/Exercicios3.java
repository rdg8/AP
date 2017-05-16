/*
Crie uma função com parâmetro capaz de verificar se um 
número é par ou ímpar
*/


package AP15_05_funcao;

import java.util.Scanner;


public class Exercicios3 {
    static Scanner input = new Scanner(System.in);
    
    static int ler(){
        System.out.print("Número: ");
        int n = input.nextInt();
        return n;
    }
    static void parImpar(int n){
        n=n%2;
        if(n==0){
            System.out.println("Numero é Par");
        }
        else{
            System.out.println("Numero é Impar");        
        }        
    }
    
    
    public static void main(String[] args) {
        int n = ler();
        parImpar(n);
        
    }
    
}
