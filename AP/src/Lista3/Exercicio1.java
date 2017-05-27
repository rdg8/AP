/*
 * Fazer uma função que tem como parâmetro de entrada três números inteiros 
a, b, c e devolve (retorna) menor dentre os três números.
 */
package Lista3;

import java.util.Scanner;


public class Exercicio1 {
    static Scanner input = new Scanner(System.in);
    
    static int entrada(){
        int n;
        System.out.print("Número: ");
        n = input.nextInt();
        return n;
    }
    static int menor(int n1, int n2, int n3){
        int menor=0;
        if((n1<=n2) &(n1<=n3)){     
                menor = n1;        
        }    
        else if((n2<=n3) & (n2<=n1)){
            menor = n2;
        }
        else if((n3<=n2) & (n3<=n1)){
            menor = n3;     
        }
        
        return menor;
    }
    static void imprimir(int menor){
        System.out.println("menor número ="+menor);
    }
    
    public static void main(String[] args) {
        int n1=entrada();
        int n2=entrada();
        int n3=entrada();
        int m = menor(n1, n2, n3);
        imprimir(m);
        
        
    }
            
    
}
