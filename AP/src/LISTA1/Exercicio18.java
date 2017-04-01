/*
 * Leia 3 números decimais A, B e C e ordeneos em ordem decrescente, de modo que
 * o lado A representa o maior dos 3 lados. A seguir, determine o tipo de 
 * triângulo que estes três lados formam, com base nos seguintes casos, sempre 
 * escrevendo uma mensagem adequada:
● se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
● se A^2 = B^2 + C^2 , apresente a mensagem: TRIANGULO RETANGULO
● se A^2 > B^2 + C^2 , apresente a mensagem: TRIANGULO OBTUSANGULO
● se A^2 < B^2 + C^2 , apresente a mensagem: TRIANGULO ACUTANGULO
● se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
● se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
 */
package LISTA1;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Escreva primeiro numero: ");
        double n1 = console.nextDouble();
        System.out.print("Escreva segundo numero: ");
        double n2 = console.nextDouble();
        System.out.print("Escreva terceiro numero: ");
        double n3 = console.nextDouble();
        
        double a,b,c;
        
        if((n1>n2)&&(n1>n3)){
            a = n1;
            b = n2;
            c = n3;
        }
        else if(n2>n3){
            a = n2;
            b = n1;
            c = n3;
        }
        else {
            a = n3;
            b = n1;
            c = n2;
        }
 
        double A= a*a;
       
        double bc= (b*b)+(c*c);
        
        
        if(a>=b+c){
            System.out.println("Nao forma um triangulo");
        }
        
        if(A==bc){
            System.out.println("TRIANGULO RETANGULO");
        }
        if(A>bc){
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        if(A<bc){
         System.out.println("TRIANGULO ACUTANGULO");
        }
       
        if((a==b)&&(b==c)){
            System.out.println("TRIANGULO EQUILATERO");
        }
        if((a==b)|(b==c)|(a==c)){
            System.out.println("TRIANGULO ISOSCELES");
        }
        
        
            
        

    }
    
}
