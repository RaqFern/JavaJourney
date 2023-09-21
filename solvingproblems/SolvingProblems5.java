/*
Create a program to read the code of 2 products, its unitary value and total no. 
of unities of each product. Next, calculate the total amount to pay. 
 */
package myprojects.solvingproblems;

import java.util.Locale;
import java.util.Scanner;

public class SolvingProblems5 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); //to use the . in the decimal// 
        Scanner sc = new Scanner(System.in);
        
        int cod1, cod2, qte1, qte2;
        double preco1, preco2, total;
       
            cod1 = sc.nextInt();
	    qte1 = sc.nextInt();
	    preco1 = sc.nextDouble();
	    
	    cod2 = sc.nextInt();
	    qte2 = sc.nextInt();
	    preco2 = sc.nextDouble();
            
            total = preco1 * qte1 + preco2 * qte2; 
            
            System.out.printf("Valor a pagar: R$ %.2f%n", total);
            System.out.printf("Amount to pay: R$ %.2f%n", total);
            
            sc.close();
    }
    
}
