/*
 * Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa que
 * preenche os elementos da matriz com a soma do número da linha com o número da 
 * coluna em que se encontra. Imprimir a matriz.
 */
package Lista4;


public class Exercicio27 {
    static int[][] matriz(int linha, int coluna){
        int matriz[][]= new int[linha][coluna];
        return matriz;
    }
    static int[][] pupulaMatriz(int matriz[][]){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j]=i+j;
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
