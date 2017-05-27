/*
 * Faça uma função que recebe por parâmetro o raio (R) de uma esfera e calcula o seu volume, onde o
volume é dado por:
 */
package Lista3;

import java.util.Scanner;


public class Exercicio7 {
    static Scanner input = new Scanner(System.in);
    
    static double entrada(){
        System.out.print("Raio: ");
        double r=input.nextInt();
        return r;
    }
    static double volumeEsfera(double raio){
        double volume= (4*Math.PI* Math.pow(raio, 3))/3;
        return volume;
    }
    static void imprimir(double volume){
        System.out.println("Volume da Esfera ="+volume);
    }
    
    public static void main(String[] args) {
        double raio=entrada();
        double volume=volumeEsfera(raio);
        imprimir(volume);
    }
    
}
