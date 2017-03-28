/*
 * 2- Dados dois números, verificar se a divisão do primeiro número pelo segundo é 
 * exata (o resto da divisão deve ser igual a 0). Se for, o algoritmo deve 
 * imprimir a mensagem “A divisão de (número 1) por (número 2) é exata”.
 */
package exerciciosaula;

import java.util.Scanner;


public class ExercicioIf2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Escreva o primeiro numero: ");
        float numero1 = console.nextInt();
        System.out.print("Escreva o segundo numero: ");
        float numero2 = console.nextInt();
        
        float divisaoResto = numero1 % numero2; 
        
        //teste divisao System.out.println(divisaoResto);
        
        if(divisaoResto==0){
            System.out.println("A divisão de "+numero1+" por "+numero2+" é exata");
        }
        
        
    }
}
