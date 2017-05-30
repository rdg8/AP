/*
 * recebe e imprimir uma matriz com dados recebidos
 */
package AP29_05_matriz;

import java.util.Scanner;

public class exemplo {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] m=new int[2][4];
        
        for(int i=0;i<2;i++){
            System.out.println("Informe os elementos da linha "+(i+1)+": ");
            for(int j=0;j<4;j++){
                System.out.print("Coluna "+(j+1)+": ");
                m[i][j] = input.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            System.out.println("Linha "+(i+1)+": ");
            for(int j=0;j<4;j++){
                System.out.print("Coluna "+(j+1)+": ");
                System.out.println(m[i][j]);
                
            }           
        }
    }
    
}
