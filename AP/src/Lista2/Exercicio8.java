/*
 * 8- Calcular e mostrar a média aritmética dos números pares compreendidos entre 
 * 13 e 73. Utilize o laço que lhe for mais conveniente.
 */
package Lista2;


public class Exercicio8 {
    public static void main(String[] args) {
        
        for(int i=13;i<73;i++){
            int pares= i%2;
            
            if(pares==0){
                System.out.println(i);
            }
        }
        
        
        
    }
    
}
