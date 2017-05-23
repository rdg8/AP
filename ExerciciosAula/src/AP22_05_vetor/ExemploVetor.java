
package AP22_05_vetor;

import java.util.Scanner;


public class ExemploVetor {
    static Scanner input = new Scanner(System.in);
    static int tamanhoVetor(){
        System.out.print("Digite o tamnaho do vetor: ");
        int t=input.nextInt();
        return t;
    }
    static int[] Vetor(int t){
        int vetor[] = new int [t];
        return vetor;
    }
    static int[] lotaVetor(int[] vetor){
        for(int i=0;i<vetor.length;i++){
        System.out.print("digite um número: ");
        vetor[i] = input.nextInt();
        }
        return vetor;
    }
    static void imprimirVetor(int[] vetor){
        int menor=vetor[0];
        int maior=vetor[0];
        for(int i=0;i<vetor.length;i++){
        if(vetor[i]<menor){
                menor=vetor[i];
            }
        else if(vetor[i]>maior){
                maior=vetor[i];                
            }
            System.out.print("["+i+"]: "+vetor[i]);
            /*if(menor==vetor[i]){
                System.out.print("<-------menor");
            }
            if(maior==vetor[i]){
                System.out.print("<-------maior");
            }*/
        System.out.println("");
        }
        
    }    
    
    
    public static void main(String[] args) {
        int t=tamanhoVetor();
        int[] vetor=Vetor(t);
        vetor=lotaVetor(vetor);
        imprimirVetor(vetor);
        
        
        
        
    }
    
}
