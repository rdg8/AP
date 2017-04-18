/*
 * Faça um programa para ler e escrever dados de uma turma de 5 alunos. O 
 * programa deve pedir dados como nome, idade e sexo. O programa deve imprimir 
 * os dados do aluno mais velho. 
​ * Use o laço DO-WHILE.
 */
package Lista2;

import java.util.Scanner;


public class Exercicio6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int i=0,Idade=0;
        String Nome="o",Sexo="Masculino";
        
        do{
            System.out.print("Escreva o nome do aluno: ");
            String nome = console.next();
            System.out.print("Escreva a idade do aluno: ");
            int idade = console.nextInt();
            System.out.print("Escreva o sexo do aluno: ");
            String sexo = console.next();
            
            if(idade>Idade){
               Nome=nome;
               Idade=idade;
               Sexo=sexo;
               
            
            }    
            
            i++;
        }
            
            while(i<5);
                
            System.out.println("O aluno mais velho é: " +Nome+ 
                    "\n" +Idade+"\n" +Sexo );
        
        
        
    }
    
}
