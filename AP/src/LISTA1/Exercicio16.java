/*
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do 
 * jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo 
 * uma duração mínima de 1 hora e máxima de 24 horas.
 */
package LISTA1;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Escreva a hora inicial do jogo: ");
        float horaInicial = console.nextFloat();
        System.out.print("Escreva a hora final do jogo: ");
        float horaFinal = console.nextFloat();
        
        if (horaInicial>12){
            horaInicial = horaInicial - 12;
            
        }
        if (horaFinal>12){
            horaFinal = horaFinal - 12;
            
        }
        
        float total = horaFinal-horaInicial;
        
        
        if (total<0){
            total = -(total)+ 12 ;
            
        }
        
        if((total<1) | (total>24)){
            total=1;
            
            
        }
        
        System.out.println("O jogo duro: "+ total +" horas");
        
        
        
        
                
        
        
        
        
    }
    
    
}
