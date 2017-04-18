 /*permitir a entrada de informçoes pelo usuario
 *Dia, hora, minutos e segundos 
 * imprimir ate a condiçao parar
 */
package AP17_04;

import java.util.Scanner;


public class Exercicio2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
       int c=1; 
       
        System.out.print("Digite o alarme Horas: ");
        int H = console.nextInt();
        System.out.print("Digite o alarme Minutos: ");
        int M = console.nextInt();
        System.out.print("Digite o alarme Segundos: ");
        int S = console.nextInt();
   
       while(c==1){
        for(int h=0;h<=23;h++){
            for(int m=0;m<=59;m++){
                for(int s=0;s<=59;s++){
                    System.out.printf("%d:%d:%d:\n",h,m,s);                         
                    if((h==H)&&(m==M)&&(s==S)){
                                System.out.println("ALARME!!!");
                                break;      
                    }
                     
                 }
                if ((h==H)&&(m==M)){
                    break;      
                }
             }
            if(h==H){
                        
                        break;      
            }
            
           
        }
           //para saber se vai rodar denovo ou nao
           System.out.println("digite 1 para continuar e 0 para PARAR ");
           c = console.nextInt();
           //condiçao se for diferente de 1 e 0 vai rodar ate dar 1 ou 0
           while((c!=0)&&(c!=1)){
               System.out.println("digite 1 para continuar e 0 para PARAR ");
               c = console.nextInt();
               
           }

        }  
       
       
        
        
        
        
    }
    
}
