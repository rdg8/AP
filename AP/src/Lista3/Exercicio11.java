/*
 *Faça uma função que recebe a média final de um aluno por parãmetro e retorna o seu conceito, conforme
a tabela abaixo:
de 0,0 a 4,9 D
de 5,0 a 6,9 C
de 7,0 a 8,9 B
de 9,0 a 10,0 A
 */
package Lista3;

import java.util.Scanner;


public class Exercicio11 {
    static Scanner input = new Scanner(System.in);
    
    static double entrada(){
        System.out.print("Nota: ");
        double nota = input.nextDouble();
        return nota;
    }
    static String conceito(double nota){
        String conceito="";
        if(nota<=4.9){
            conceito="D";
        }
        else if((nota>=5)&(nota<=6.9)){
            conceito="C";
        }
        else if((nota>=7)&(nota<=8.9)){
            conceito="B";
        }
        else if((nota>=9)&(nota<=10)){
            conceito="A";
        }
        return conceito;
        }   
    
    static void imprimir(String conceito){
        System.out.println(conceito);
    }
    public static void main(String[] args) {
        double nota=entrada();
        String conceito=conceito(nota);
        imprimir(conceito);
    
    }
}
