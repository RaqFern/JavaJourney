/* Practicing Operators
 * 1 - Create a program to read an integer, and next show if this number is negative or not
 * 2 - Create a program to read an integer, and next show if this number even or odd
 */
package myprojects.cursoprogramacao;

import java.util.Scanner;

public class Aula36 {


    public static void main(String[] args) {
        //1
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        
        if (A > 0) {
            System.out.println("este número é positivo");
        } 
        else { System.out.println("este número é negativo");
        }
              
        //2 
              
        int B = sc.nextInt();
        
        if (B % 2 == 0) {
            System.out.println("este número é par");
        } 
        else { System.out.println("este número é ímpar");
        }
        
        sc.close();
    }
    
}
