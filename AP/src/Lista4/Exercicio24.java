/*
 * Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa que 
 * preenche e imprime cada elemento da matriz com o número 7, se a coluna for 
 * ímpar, e com 4 se a coluna for par.
 */
package Lista4;

import java.util.Scanner;


public class Exercicio24 {
    static Scanner input = new Scanner(System.in);
    
    static int[][] matriz(int linha, int coluna){
        int matriz[][]= new int[linha][coluna];
        return matriz;
    }
    static int[][] pupulaMatriz(int matriz[][]){
        int resto;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
            resto=j%2;
                if(resto==0){
                    matriz[i][j]=4;
                }
                else{
                    matriz[i][j]=7;   
                }
            }
        }
        return matriz;
    }
    static void imprimiMatiz(int matriz[][]){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
                System.out.println("");
        }
    }       
    public static void main(String[] args) {
        System.out.print("Linhas: ");
        int linha=Exercicio1.entrada();
        System.out.print("Colunas: ");
        int coluna=Exercicio1.entrada();
        int matriz[][]=matriz(linha, coluna);
        matriz=pupulaMatriz(matriz);
        imprimiMatiz(matriz);
        
    }
    
}
