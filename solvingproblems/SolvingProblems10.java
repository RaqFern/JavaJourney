/*
Create a program to read an integer value X (1 <= X <= 1000). Then show the odd 
numbers from 1 to X, one value per line, including the X, if applicable.
 */
package myprojects.solvingproblems;

import java.util.Scanner;

public class SolvingProblems10 {
   
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);

	int x = sc.nextInt();
        
        if  (x >=1000 || x < 1) 
             {System.out.println("Insira um número dentro do intervalo 1 a 1000");}
             x = sc.nextInt();
            
            for (int i=1; i<=x; i++) {
                if (x <=1000 && x >= 1 && i % 2 != 0) {
		System.out.println(i);
               
            }
	}
		
	sc.close();
    }
    
}
