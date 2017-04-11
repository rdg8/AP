/*
 * Crie um laço que imprima uma contagem regressiva de 100 a 0, mas que 
 * decremente de 5 em 5. Use o laço for.
 */
package AP10_04;

import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        
        int contagem=100;
        //100/5=20
        for(int i=0;i<21;i++){
            System.out.println(contagem);
            contagem=contagem-5;
            
        }

        
            


        
        
    }
    
}
