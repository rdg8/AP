/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP29_05_matriz;

import java.util.Scanner;


public class Exercicio4 {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
       int[][] matriz=matriz();
       matriz=popular(matriz);
       int soma=soma(matriz);           
    }
    static int soma(int[][]matriz){
        int soma=0;
            for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                soma=soma+matriz[i][j];      
            } 
        }
            System.out.println("Soma:"+soma);
        return soma;
    }
    static int[][] matriz(){
        int[][] matriz =new int[4][4];
        return matriz;
        }
    static int[][] popular(int[][] matriz){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.printf("Matriz[%d][%d]: ", i,j);
                matriz[i][j] = input.nextInt();
            } 
        }
        return matriz;
    }
}
