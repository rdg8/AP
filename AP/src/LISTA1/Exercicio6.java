/*
 * 6- Escreva um algoritmo que leia três números decimais: A, B e C. Em seguida,
 * calcule e mostre:
 *                                                                Area=(b*h)/2
 * a) a área do triângulo retângulo que tem A por base e C por altura.
 * b) a área do círculo de raio C. (π = 3.14159)          Area=Pi*r^2
 * c) a área do trapézio que tem A e B por bases e C por altura. Area=((B*b)*h)/2
 * d) a área do quadrado que tem lado B.                  Area=L*L
 * e) a área do retângulo que tem lados A e B.            Area=B*b  
 * f) o perímetro do retângulo que tem lados A e B.       Perimeto= B+L+B+L
 */
package LISTA1;

import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        
        //Variaveis
          //h= c(altura)       
        double a,b,c,P;
        //Variaveis resultados
        double aRetangulo,aCirculo,aTrapezio,aQuadrado,aTriangulo,pRetangulo;
        
        P= 3.14159;
        
        System.out.print("Escreva A: ");
        a = console.nextDouble();
        System.out.print("Escreva B: ");
        b = console.nextDouble();
        System.out.print("Escreva C: ");
        c = console.nextDouble();
        
        
        //A- a área do triângulo retângulo que tem A por base e C por altura.
        aTriangulo = (a*c)/2;
        
        //B- a área do círculo de raio C.
        aCirculo =  P*(c*c);
        
        //C- a área do trapézio que tem A e B por bases e C por altura.
        aTrapezio = (a*b*c)/2;
        
        //D-  a área do quadrado que tem lado B.    
        aQuadrado = b*b;
        
        //E- a área do retângulo que tem lados A e B.
        aRetangulo = a*b;
        
        //F- o perímetro do retângulo que tem lados A e B.
        pRetangulo = (a*2)+(b*2);
        
        
        System.out.println("Area do Triângulo Retângulo = "+ aTriangulo);
        System.out.println("Area do Círculo = "+ aCirculo);
        System.out.println("Area do Trapézio = "+ aTrapezio);
        System.out.println("Area do Quadrado = "+ aQuadrado);
        System.out.println("Area do Retângulo = "+ aRetangulo);
        System.out.println("Perimetro do Retângulo = "+ pRetangulo);
     
        
    }
    
}
