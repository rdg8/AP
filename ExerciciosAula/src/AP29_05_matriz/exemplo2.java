/*
 * imprimir as diagonais centrais
 */
package AP29_05_matriz;
import java.util.Scanner;
public class exemplo2 {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        int n=6;
        int[][]m= new int[n][n];
        
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){//diagonal primaria
                    m[i][j]=0;
                }
                    else if((i+j)==(n-1)){//diagonal segundaria
                        m[i][j]=1;                      
                    }
                    else{
                        m[i][j]=2;
                    }
            }
        }           
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(m[i][j]+" ");
                }
                System.out.println("");
            }
        
        
    }
    
}
