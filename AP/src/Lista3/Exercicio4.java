/*
 * Fazer um programa que lê um número inteiro positivo N e imprime a divisão do 
produto dos n primeiros números positivos pela soma dos n primeiros números 
positivos.
Em outras palavras, você deve dividir o fatorial pela somatoria do número. 
Obrigatório utilizar as funções elaboradas nos exercícios 2 e 3.
 */
package Lista3;

import java.util.Scanner;


public class Exercicio4 {
    static Scanner input =  new Scanner(System.in);
    
    static int somatoria(int n){
    int soma=0;
    for(int i=1; i<=n; i++){
        soma=soma+i;
    }
    return soma;
}
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
    static boolean positivo(int n){
        boolean positivo;
        if(n>0){
            positivo=true;           
        }
        else{
            positivo=false;
        }
        return positivo;
    }
    static int soma(int n1,int n2){
        int soma;
        soma= n1+n2;
        return soma;
    }
    
    public static void main(String[] args) {
        boolean positivo=false;
        int n;
        do{
        n = entrada();
        positivo=positivo(n);
        }while(positivo==false);
        int fatorial=fatorial(n);
        int somatoria=somatoria(n);
        int soma=soma(fatorial, somatoria);
        System.out.println("Produto="+soma);
    }
    
}
