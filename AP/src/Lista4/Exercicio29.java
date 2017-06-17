/*
 * Dada uma matriz de tamanho N x M e um vetor de M elementos, fazer um programa
 * que preencha cada linha da matriz com os elementos do vetor..
 */
package Lista4;

import java.util.Scanner;


public class Exercicio29 {
    static Scanner input = new Scanner(System.in);
    
    static int[][] polularMatriz(int matriz[][],int vetor[]){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j]=vetor[j];     
            }
        }    
        return matriz;
    }
    
    public static void main(String[] args) {
        System.out.print("Linhas: ");
        int linha=Exercicio1.entrada();
        System.out.print("Colunas: ");
        int coluna=Exercicio1.entrada();
        int matriz[][]=Exercicio28.matriz(linha, coluna);
        int vetor[]=Exercicio1.vetor(coluna);
        vetor=Exercicio1.populaVetor(vetor);
        matriz=polularMatriz(matriz, vetor);
        Exercicio27.imprimiMatiz(matriz); 
    }
    
}
