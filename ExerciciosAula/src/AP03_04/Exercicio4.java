/*
 * 4- Construir um programa para identificar quantos dias há em um mês, sabendo o mês e
  o ano.
 */
package AP03_04;

import java.util.Scanner;


public class Exercicio4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Escreva o mes: ");
        int mes = console.nextInt();
        System.out.print("Escreva o ano: ");
        int ano = console.nextInt();
        int B;
        
        int bisesto = ano%4;
        
        if(bisesto==0){
            bisesto=ano%100;
            if(bisesto==0){
                //nao bisesto
                if(mes==2){
                    System.out.println("fevereiro tem 28 dias");
                }     
            }
            else{//bisesto
                System.out.println("fevereiro tem 29 dias");
                
            }
            
        }
        else{
            System.out.println("fevereiro tem 28 dias");
        }
        
        
           
        switch(mes){
            case 1:
                System.out.println("Janeiro tem 31 dias");
                break;
            case 3:
                System.out.println("Março tem 31 dias");
                break;
            case 4:
                System.out.println("Abril tem 30 dias");
                break;
            case 5:
                System.out.println("Maio tem 31 dias");
                break;
            case 6:
                System.out.println("Junho tem 30 dias");
                break;
            case 7:
                System.out.println("Julho tem 31 dias");
                break;
            case 8:
                System.out.println("Agosto tem 31 dias"); 
                break;
            case 9:
                System.out.println("Setembro tem 30 dias");
                break;
            case 10:
                System.out.println("Outubro tem 31 dias");
                break;
            case 11:
                System.out.println("Novembro tem 30 dias");
                break;
            case 12:
                System.out.println("Dezembro tem 31 dias");  
                break;
                }
       
                
    }
    
}
