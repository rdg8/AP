/*
 * Faça uma função que recebe a idade de uma pessoa em anos, meses e dia s e retorna essa idade
expressa em dias .
 */
package Lista3;

import java.util.Scanner;


public class Exercicio9 {
    static Scanner input = new Scanner(System.in);
    
    static int entrada(String texto){
        System.out.print(texto);
        int n=input.nextInt();
        return n;
    }
    static int dias(int ano,int mes,int dia){
        int M=ano*12;
        mes=mes+M;
        int D=mes*30;
        D=dia+D;
        return D;
    }
    static void imprimir(int dias){
        System.out.println(dias+"dias");
    }
    
    public static void main(String[] args) {
      String  A="ano: ",M="mes: ",D="dia: ";
      int ano=entrada(A);
      int mes=entrada(M);
      int dia=entrada(D);
      int totalDia=dias(ano, mes, dia);
      imprimir(totalDia);
      
    }
    
}
