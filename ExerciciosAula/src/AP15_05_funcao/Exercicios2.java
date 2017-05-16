/*Crie uma função com dois parâmetros numéricos capaz de verificar qual número é
o maior e retorná-lo
 */
package AP15_05_funcao;

import java.util.Scanner;


public class Exercicios2 {
    static Scanner input = new Scanner(System.in);
       
    static int ler(){
        System.out.print("Número: ");
        int n = input.nextInt();
        return n;
    }
    static void maior(int n1,int n2){
        if(n1>n2){
            System.out.println("Maior número: "+ n1);
        }
        else{
            System.out.println("Maior número: "+ n2);            
        }
    }
    
    public static void main(String[] args) {
        int n1 = ler();
        int n2 = ler();
        maior(n1, n2);
        
    }
    
}
