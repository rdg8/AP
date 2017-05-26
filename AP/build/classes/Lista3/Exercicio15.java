/*
 * Escreva uma função que recebe, por parâmetro, dois valores X e Z e calcula e 
retorna X^Z (​sem utilizarfunções ou operadores de potência prontos).
 */
package Lista3;

import java.util.Scanner;


public class Exercicio15 {
    static Scanner input = new Scanner(System.in);
    
    static int entrada(){ 
        int x =input.nextInt();
        return x;
    }
    static int potencia(int x,int z){
        int potencia=1;
        for(int i=0;i<z;i++){
            potencia=potencia*x;
        }
        return potencia;
    }
    static void imprimir(int potencia){
        System.out.println("Resultado= "+potencia);
                
    }
    
    public static void main(String[] args) {
        System.out.print("Escreva a base: ");
        int base=entrada();
        System.out.print("Escreva o Expoente: ");
        int expoente=entrada();
        int resultado=potencia(base, expoente);
        imprimir(resultado);
        
    }
    
}
