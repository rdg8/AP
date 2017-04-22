/*
 * 7- Escreva um programa que imprima todos os múltiplos de 7 menores que 200.
 * Use o laço WHILE .
 */
package Lista2;

public class Exercicio7 {
    public static void main(String[] args) {
        
        int i=1;
        
        while(i<200){
            int multiplo=i%7;
            
            if(multiplo==0){
                System.out.println(i);
            }
            i++;
            
        }
        
        
    }
    
}
