/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP15_05_funcao;

import java.util.Scanner;


public class Calculadora {
    static Scanner input = new Scanner(System.in);
    
    static int menu(){
        System.out.println("1 adição");
        System.out.println("2 subtração");
        System.out.println("3 multiplicação");
        System.out.println("4 divisão");
        System.out.println("5 area triângulo");
        System.out.println("6 potencia");        
        System.out.println("7 raiz");        
        int opcao=input.nextInt();
        return opcao;
    }
    static int leitura(){
        System.out.print("Número: ");
        int n = input.nextInt();
        return n;
    }
    static void imprimir(double resultado){
        System.out.println("Resultado: "+ resultado);
    }
    
    static int add(int n1, int n2){
        int resultado = n1 + n2;
        return resultado;
    }
    static int sub(int n1, int n2){
        int resultado = n1 - n2;
        return resultado;
    }
    static int mult(int n1, int n2){
        int resultado = n1 * n2;
        return resultado;
    }
    static double div(int n1, int n2){
        double resultado = n1 / n2;
        return resultado;
    }
    static double atriangulo(int n1,int n2){
        double resultado = (n1*n2)/2;
        return resultado;
    }
    static double potencia(int n1, int n2){
        double resultado = 1;
        for(int i=0;i<n2;i++){   
            resultado = resultado*n1;
        }      
            return resultado;
    }
    static double raiz(int n){
        double resultado = Math.sqrt(n);
        return resultado;
        
    }
    static double op(int opcao, int n1, int n2 ){
        double r=0;
        switch(opcao){ 
            case 1:
                r = add(n1,n2);
                break;
            case 2:
                r = sub(n1,n2);
                break;
            case 3:
                r = mult(n1,n2);
                break;
            case 4:
                r = div(n1,n2);
                break;
            case 5:
                r = atriangulo(n1, n2);
                break;
            case 6:
                r = potencia(n1, n2);
            case 7 :
                r = raiz(n1);
        }
        return r;
    }
    
    
    
    
    public static void main(String[] args) {
        int opcao = menu();
        int n1 = leitura();
        int n2 = leitura();
        double resultado = op(opcao, n1, n2);
        imprimir(resultado);
        
        
        
    }
    
}
