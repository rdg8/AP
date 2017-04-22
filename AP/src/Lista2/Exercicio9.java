/*
 *9-Escreva um programa para ler a quantidade de alunos existentes em uma turma.
 * Depois disso, o programa deve ler as notas de cada um destes alunos, calcular
 * e mostrar na tela a média aritmética destas notas. Utilize o laço WHILE.
 */
package Lista2;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        
        System.out.print("Qual é a quantidade de alunos? ");
        int alunos = console.nextInt();
        
        double somaNota=0;
        int i=1;
        
        
        while(i<=alunos){
            System.out.print("nota "+i+"º aluno: ");
            double nota = console.nextDouble();
            somaNota=somaNota+nota;
            
            i++;
        }
        
        double media=somaNota/alunos;
        
        System.out.println("Media= "+media);
    }
    
}
