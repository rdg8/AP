/*
 * Fazer um programa que lê o nome e a nota de cada aluno de uma sala de aula. 
 * O programa deve calcular e imprimir a média da sala e os nomes dos alunos que 
 * tiveram notas acima da média. Sugestão: utilizar um vetor para os nomes e
 * outro para as notas.
 */
package Lista4;

import java.util.Scanner;


public class Exercicio21 {
    static Scanner input =  new Scanner(System.in);
    
    static void medias(String alunos[], double notas[]){
        for(int i=0;i<alunos.length;i++){
            System.out.print("Aluno: ");
            alunos[i]=input.next();
            System.out.print("Nota: ");
            notas[i]=input.nextDouble();
        }
        double soma=0;
        for(int i=0;i<alunos.length;i++){
          soma=soma+notas[i];
        }
        double media=soma/alunos.length;
        System.out.println("\nMeida da Sala: "+media);
        System.out.println("Notas acima da media: ");
        for(int i=0;i<alunos.length;i++){
            if(notas[i]>media){
                System.out.println(alunos[i]+": "+notas[i]);   
            }
        }        
    }
    
    public static void main(String[] args) {
        System.out.print("Quatidade de alunos: ");
        int tamanho=Exercicio1.entrada();
        String alunos[]= new String[tamanho];
        double notas[]=Exercicio2.vetor(tamanho);
        medias(alunos, notas);
    }
}
