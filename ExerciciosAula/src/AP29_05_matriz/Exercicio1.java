/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP29_05_matriz;

import java.util.Scanner;


public class Exercicio1 {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int soma=0;
        System.out.println("número de linhas: ");
        int linha = input.nextInt();
        System.out.println("número de colunas: ");
        int coluna = input.nextInt();
    int[][] matriz1 =new int[linha][coluna];
        System.out.println("valores primeira matriz");
    for(int i=0; i<matriz1.length; i++){
            for(int j=0; j<matriz1[i].length; j++){
                System.out.printf("Matriz[%d][%d]: ", i,j);
                matriz1[i][j] = input.nextInt();
            } 
    }
    int[][] matriz2 =new int[linha][coluna];
        System.out.println("valores segunda matriz");
    for(int i=0; i<matriz2.length; i++){
            for(int j=0; j<matriz2[i].length; j++){
                System.out.printf("Matriz[%d][%d]: ", i,j);
                matriz2[i][j] = input.nextInt();
            }
    }
    
    int[][] matrizsoma =new int[linha][coluna];
    for(int i=0; i<matriz1.length; i++){
            for(int j=0; j<matriz1[i].length; j++){
               matrizsoma[i][j]=matriz1[i][j] + matriz2[i][j];
                       soma=matriz1[i][j] + matriz2[i][j]; 
            }
    }  
        for(int i=0; i<matrizsoma.length; i++){
            for(int j=0; j<matrizsoma[i].length; j++){
                System.out.printf("\nSoma=[%d][%d]: %d", i,j, matrizsoma[i][j]);               
            }
            System.out.println("");
        }
        
    }
  
}
