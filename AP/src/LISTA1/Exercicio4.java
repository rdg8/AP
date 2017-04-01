/*
 * 4- Fazer um algoritmo que lê dois números inteiros e imprime os números 
 * consecutivos desses números.(Por exemplo: se o usuário digitar 2 e 9,
 * a saída deverá ser 3 e 8, porque 3 é consecutivo de 2. –8 éconsecutivo de –9)
 */
package LISTA1;

import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        
        
        int n1,n2,consecutivo1,consecutivo2;
        
        System.out.print("Escreva primeiro número: ");
        n1 = console.nextInt();
        System.out.print("Escreva o segundo número: ");
        n2 = console.nextInt();
        
        consecutivo1 = n1+1;
        consecutivo2 = n2+1;
        
        System.out.println("consecutivo do primeiro número: "+ consecutivo1);
        System.out.println("consecutivo do segundo número: " + consecutivo2);
        
    }
    
}
