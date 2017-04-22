/*
 * 19- Escreva um programa que repita a leitura de uma senha até que ela seja 
 * válida. Para cada leitura de senha incorreta informada, escrever a mensagem 
 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
 * correta é o valor 2002. Utilize o laço que lhe for mais conveniente.
 */
package Lista2;

import java.util.Scanner;




public class Exercicio19 {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        int senha=2002;
        
        System.out.print("digite a Senha: ");
        int S = console.nextInt();        
        
        while(S!=senha){
        System.err.println("Senha Invalida");
            System.out.print("digite a SENHA ");
            S = console.nextInt();
        }
        
        System.out.println("Acesso Permitido");
        
        
    }
    
}

