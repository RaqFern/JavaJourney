/*
Create a program to check if the 6th bit of N is true or false
 */
package myprojects.projetoexercicios;

import java.util.Scanner;

public class PracticingBitwise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int mask = 32; //is given that 32 in binary has the 6th bit is 1// 
        int n = sc.nextInt();
        
        if ((n & mask) !=0) {
            System.out.println("6th bit is true!");
        } else {
            System.out.println("6th bit is false!");
        }
        
        sc.close();
    }
    
}
