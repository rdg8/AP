/*
 * 3- Dada a altura e o peso de uma pessoa, determinar seu grau de obesidade. 
 * O grau de obesidade é determinado pelo índice da massa corpórea 
 * (Massa = Peso / Altura2 ) através da tabela abaixo:
 */
package exerciciosaula;

import java.util.Scanner;


public class ExercicioIf3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Escreva a altura: ");
        float altura = console.nextFloat();
        System.out.print("Escreva a peso: ");
        float peso = console.nextFloat();
        
        float IMC = (peso)/(altura*2);
        
        if(IMC>=26){
            if(IMC<30){
                System.out.println("Obeso IMC: "+ IMC);
                
            }
            else {
               System.out.println("Obeso Mórbido IMC: "+ IMC); 
            }
        }
        else {
            System.out.println("Normal IMC: "+ IMC); 
        }
    }
}
