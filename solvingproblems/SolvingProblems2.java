/*
 Create a program to read 2 values, and next show on screen the sum of these values.
 */
package myprojects.solvingproblems;

import java.util.Scanner;

public class SolvingProblems2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();
        
        int soma = valor1 + valor2;
        
        System.out.println("SOMA = " + soma);
        
        sc.close();
    }
    
}
