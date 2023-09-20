/* Create a program to read the radius of a circle, and next show the value of 
the area of this circle with four decimal places. area = pi.radius^2  */
package myprojects.solvingproblems;

import java.util.Locale;
import java.util.Scanner;

public class SolvingProblems3 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US); //to use the . in the decimal// 
        Scanner sc = new Scanner(System.in);
        
        double R = sc.nextDouble();
        double pi = 3.14159;
        double area = pi * R * R;
        
        System.out.printf("area=%.4f%n", area); //use =%.2f%n to define how many decimal places//    
              
         sc.close();
    }
    
}
