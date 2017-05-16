/*Modifique a função imprimirNota do exemplo anterior para retornar uma String.
Se aluno aprovado, retorna "Aprovado". Caso contrário, retorna "Reprovado".
Perceba que você que terá que modificar a função main
*/

package AP15_05_funcao;

import java.util.Scanner;


public class Exercicios1 {
    static Scanner input = new Scanner(System.in);
    
    static String status;
    static double ler(){
        System.out.print("Nota: ");
        double nota = input.nextInt();
        return nota;
    }
    static void imprimirNota(double nota){
        if(nota>=6){
            status = "Aprovado";
        }
        else{
            status = "Reprovado";
        }
    }
    
    
    public static void main(String[] args) {
        double n = ler(); 
        imprimirNota(n);
        System.out.println(status);
    }
    
}
