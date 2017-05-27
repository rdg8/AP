/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista3;

import java.util.Scanner;

public class Exercicio8 {
    static Scanner input = new Scanner(System.in);
   
    static int entrada(){
        System.out.print("Número: ");
        int n= input.nextInt();
        return n;
    }
    static boolean primo(int n){
        boolean primo=false;
        int resto,verifica=0;
        for(int i=1; i<=n;i++){
            resto=n%i;
            if(resto==0){
                verifica++;
                if(verifica==2){
                    primo=true;
                }
                else{
                    primo =false;
                }
            }
                    
        }
        
        return primo;
    }
    static void imprimir(boolean primo){
        System.out.println("Primo ="+primo);
    }
    
    public static void main(String[] args) {
        int n = entrada();
        boolean primo=primo(n);
        imprimir(primo);
    }
    
}
