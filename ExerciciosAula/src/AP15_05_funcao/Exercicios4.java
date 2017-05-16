/*
 Crie uma função capaz de calcular o resultado para a função matemática abaixo 
(a função deve receber “x” e retornar a resposta)
 */
package AP15_05_funcao;

import java.util.Scanner;


public class Exercicios4 {
    static Scanner input = new Scanner(System.in);
    
    static double ler(){
        System.out.print("X: ");
        double x = input.nextDouble();
        return x;
    }
    static double fucMat(double x){  
        double resultado = 0;
        if(x<-1){
            resultado = x+2;          
        }
        else if(x<=2){
            resultado = (x*x)-4;
        }
        else if(x>2){
            resultado = (2*x)-1;
        }
        return resultado;
    }
    static void imprimir(double resultado){
        System.out.println("Resultado da função =" +resultado);
    }
    
    public static void main(String[] args) {
       double x = ler();
       double resultado = fucMat(x);
       imprimir(resultado);
        
    }
    
}
