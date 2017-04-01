/*
 * Leia 3 números decimais A, B e C e efetue o cálculo das raízes da equação de 
 * Bhaskara.
 * Se não for possível calcular as raízes, ou seja, caso haja uma divisão por 0 
 * ou raiz de numero negativo, mostre a mensagem correspondente “ Impossivel 
 * calcular ”.
 */
package LISTA1;

import java.util.Scanner;

public class Exercicio15 {
     public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        double x=0,delta,x1=0,x2=0;
        
        System.out.print("Escreva o coeficiente a : ");
        float a = console.nextFloat();
        System.out.print("Escreva o coeficiente b : ");
        float b = console.nextFloat();
        System.out.print("Escreva o coeficiente c : ");
        float c = console.nextFloat();
    
        delta = (b*b)+((-4)* a * c);
        
        System.out.println("Delta ="+ delta);
        
        if (delta >= 0){
            if (delta==0){
               x= (-(b))/(2*a);
               System.out.println("x= "+ x);
            }
            else if(delta>0){
                double delta1 = Math.sqrt(delta);
                x1=(-(b)+ delta1)/(2*a);
                x2=(-(b)- delta1)/(2*a);
                
                System.out.println("Ha duas raizes reais: "+"\nx1= "+ x1+
                        "\nx2= "+ x2);
            }
        }
        else{
            System.out.println("Impossivel calcular");
        }
        
        
        
       
       
     
                
        
        
        
    }
    
}
