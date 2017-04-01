/*
 * Fazer um algoritmo que leia os dois lados A e B de um triângulo retângulo e 
 * calcula a hipotenusa do triângulo. Para esse caso, considere que hipotenusa =
 * √A²+B². Dica: nesse programa, você deve usar a função matemática Math.sqrt(). 
 * Por exemplo, a raiz de 121 ficaria Math.sqrt(121) .
 */
package LISTA1;

import java.util.Scanner;


public class Exercicio7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Escreva lado A do triângulo: ");
        double A = console.nextDouble();
        System.out.print("Escreva lado B do triângulo: ");
        double B = console.nextDouble();
        
        double hipotenusa = Math.sqrt((A*A)+(B*B));
        
        System.out.println("\nHipotenusa= "+ hipotenusa);
        
        
        
        
    }
    
}
