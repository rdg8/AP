/*
 * 4- Calcular a conta de consumo de energia elétrica de um consumidor, dado 
 * o kWh consumido, de acordo com a tabela abaixo:
 */
package exerciciosaula;

import java.text.ChoiceFormat;
import java.util.Scanner;


public class ExercicioIf4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double conta=0;
        
        System.out.print("kWh consumido: ");
         double kwh = console.nextDouble();
         
         if (kwh>=150){
             if(kwh<500){
                 conta= kwh * 0.25;
                 
             }
             
             else{
                 conta = kwh * 0.30;
             }
               
         }
         else{
             conta = kwh * 0.20 ;
             
         }
         
         if(conta<11.90){
             conta = 11.90;
         }
         
         System.out.println("Valor da conta: R$"+ conta);
         
        
         
         
         
    }
}
