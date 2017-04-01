/*
 * 5- Fazer um algoritmo que leia um valor L e calcula a área de um 
 * quadrado de lado L.
 */
package LISTA1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        
        float l,area;
        System.out.print("Escreva o Lado do quadrado: ");
        l = console.nextFloat();
        
        area = l*l;
        
        System.out.println("Area do quadrado= "+ area);
        
    }
    
}
