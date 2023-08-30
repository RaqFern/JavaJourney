
package myprojects.projetoexercicios;

import java.util.Scanner;
/**
 *
 * @author Raquel
 */
public class ProjetoExercicios {

    public static void main(String[] args) {
        
        int media = 4;
        
        if(media >= 7) {
                System.out.println("Aprovado.");
            if(media == 10) {
                System.out.println("Parabens! Aprovado com nota máxima");
            }
        } else {
            // REPROVADO
            System.out.println("Reprovado.");
        }   
    }
}
