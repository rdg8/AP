/*
 * 12- Fazer um algoritmo que leia dois números L e R. O programa deve verificar
 * a maior área entre um quadrado de lado L e um círculo de raio R. Imprimir na
 *  tela qual o maior: "Quadrado" ou "Circulo".
 */
package ap;

import java.util.Scanner;


public class Exercicio12 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Escreva lado do quadrado: ");
        double l = console.nextDouble();
        System.out.print("Escreva o radio do círculo: ");
        double r = console.nextDouble();
        
        double aQ = l * l;
        //System.out.println(aQ);
        double aC = 3.14 * (r*r);
        //System.out.println(aC);
        
        
        if(aQ>aC){
            System.out.println("Quadrado é maior"); 
        }
        else{
            System.out.println("Círculo é maior");
        }
        
    }
    
}
