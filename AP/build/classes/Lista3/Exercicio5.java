/*
 * Fazer uma função que tem como parâmetros de entrada três números reais a, b, 
c e fornece como saída a maior raiz da equação do 2º grau:Nesta ax^2+bx+c
questão, você deverá utilizar a fórmula de Báskara. Se não houver raízes reais, 
a função deve retornar o número −1.bx^2-4*a+c 
 */
package Lista3;

import java.util.Scanner;


public class Exercicio5 {
    static Scanner input = new Scanner(System.in);
    
    static double entrada(){
        double x = input.nextDouble();
        return x;
    }
    static double delta(double a, double b, double c){
        double delta = 0;
        delta=(b*b)-4*a*c;
        return delta;
    }
    static double raizP(double delta, double a, double b){
        double raizP=0;
        raizP=(-b+(Math.sqrt(delta)))/(2*a);
        return raizP;
    }
    static double raizN(double delta, double a, double b){
        double raizN=0;
        raizN=(-b-(Math.sqrt(delta)))/(2*a);
        return raizN;
    }
    static void imprimir(double resultado){
        System.out.println("Maior Raiz: "+resultado);
    }
    static double maior(double raizP, double raizN){
        double maior;
        if(raizP>raizN){
            maior=raizP;
        }             
        else{
            maior=raizN;      
        }
        return maior;
    }
    public static void main(String[] args) {
        System.out.print("Digite a: ");
        double a=entrada();
        System.out.print("Digite b: ");
        double b=entrada();
        System.out.print("Digite c: ");
        double c=entrada();
        double delta=delta(a, b, c);
        if(delta>=0){
            double raizP=raizP(delta, a, b);
            double raizN=raizN(delta, a, b);
            double maior=maior(raizP, raizN);
            imprimir(maior);
        }
        else{
            System.out.println("Não há Raizes reais, Delta=-1");
        }       
    }
    
}
