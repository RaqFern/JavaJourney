/*Faca um algoritmo que receba um numero e diga se este numero esta no intervalo 
    entre 100 e 200 */

package myprojects.projetoexercicios;

import java.util.Scanner;

public class ProjetoExercicios4 {

    
    public static void main(String[] args) {
        int numero;
        
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("Digite um valor");
                
        numero = leitorScanner.nextInt();
        
        if(numero >= 100 && numero <= 200) {
            System.out.println("O numero esta no intervalo 100 - 200");
        } else {
            System.out.println("O numero nao esta no intervalo");
        }
    }
    
}
