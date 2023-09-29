/*
Write a program that repeats reading a password until it is valid. For each 
password incorrectly entered, write the message "Invalid Password". When the password 
is entered correctly it must print "Access Allowed" and the algorithm is terminated. 
Consider that the correct password is the value 2002.
 */
package myprojects.solvingproblems;

import java.util.Scanner;

public class SolvingProblems7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int Senha = sc.nextInt();
        
        while (Senha != 2002) {
            System.out.println("Senha inválida/Invalid Password");
            Senha = sc.nextInt();
        }
        
        System.out.println("Acesso permitido/Access Allowed");
        
        sc.close();
    }
    
}
