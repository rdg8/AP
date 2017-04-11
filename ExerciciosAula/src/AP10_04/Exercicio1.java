/*1- Faça um programa que mostre os números pares entre 1 e 100, inclusive. 
 * Use o laço while.
*/
package AP10_04;


public class Exercicio1 {
    public static void main(String[] args) {
        
        System.out.println("Os números pares entre 1  e 100 são:");
        int i=1;
        
        while(i<=100){
            
            int div=i%2;
            if(div==0){
                System.out.print(i+", ");
            }
            i++;
        }
        
    }
    
}
