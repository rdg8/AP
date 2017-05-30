/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP29_05_matriz;

import java.util.Scanner;

public class Exercicio2 {
    static Scanner input = new Scanner(System.in);
    
    static int tamanhoMatriz(){
        int t;
        t = input.nextInt();
        return t;
    }
    static int[][] criaMatriz(int linhas, int colunas){
        int[][] matriz = new int[linhas][colunas];
        return matriz;
    } 
    static int[][] populaMatriz(int[][] matriz){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.printf("Matriz[%d][%d]: ", i,j);
                matriz[i][j] = input.nextInt();
            }
        }
        return matriz;
    }
    static void imprimir(int[][] matriz){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){         
                System.out.print(matriz[j][i]);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        System.out.println("tamanho:");
        int t=tamanhoMatriz();
        int[][] matriz=criaMatriz(t, t);
        matriz=populaMatriz(matriz);
        imprimir(matriz);
    }
}
