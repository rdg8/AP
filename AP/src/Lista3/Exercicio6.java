/*
 * Fazer uma função que tem como parâmetros de entrada três números reais a, b, 
c e fornece como saída a maior raiz da equação do 2º grau:Nesta ax^2+bx+c
questão, você deverá utilizar a fórmula de Báskara. Se não houver raízes reais, 
a função deve retornar o número −1.bx^2-4*a+c 
 */
package Lista3;

import java.util.Scanner;


public class Exercicio6 {
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
        double maior=0;
        if(raizP>raizN){
            maior=raizP;            
        } 
        if(raizN>raizP){
            maior=raizN;            
        } 
        return maior;
    }    
    static double menor(double raizP,double raizN){
        double menor=0;
        if(raizP<raizN){
            menor=raizP;
        }    
        if(raizN<raizP){
            menor=raizN;
        }    
        return menor;
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
            System.out.print(" *1 para maior raiz \n *2 para menor raiz: ");
            int escolha=input.nextInt();
            double raizP=raizP(delta, a, b);
            double raizN=raizN(delta, a, b);
            switch(escolha){
                case 1:    
                    double maior=maior(raizP, raizN);
                    imprimir(maior);
                    break;
                case 2:
                    double menor=menor(raizP,raizN);
                    System.out.println("Menor Raiz: "+menor);
                
            }        
        }
        else{
            System.out.println("Não há Raizes reais, Delta=-1");
        }       
    }
    
}
