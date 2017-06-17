/*
 * Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa que
 * imprime a soma dos elementos de cada linha da matriz.
 */
package Lista4;

import java.util.Scanner;


public class Exercicio28 {
    static Scanner input = new Scanner(System.in);
    
    static int somaMatriz(int matriz[][]){
        int soma=0;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                soma=soma+matriz[i][j];
            }
        }    
        return soma;
    }
    static int[][] matriz(int linha, int coluna){
        int matriz[][]= new int[linha][coluna];
        return matriz;
    }
    static int[][] pupulaMatriz(int matriz[][]){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print("Numero["+i+"]["+j+"]: ");
                matriz[i][j]=input.nextInt();
            }
        }
        return matriz;
    }
    public static void main(String[] args) {
        System.out.print("Linhas: ");
        int linha=Exercicio1.entrada();
        System.out.print("Colunas: ");
        int coluna=Exercicio1.entrada();
        int matriz[][]=matriz(linha, coluna);
        matriz=pupulaMatriz(matriz);
        int soma=somaMatriz(matriz);
        System.out.println("Soma="+soma);
        
    }
    
}
