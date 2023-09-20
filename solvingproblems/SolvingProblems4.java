/*Create a program that reads a employee number, its worked hours, payment per hour
and calculates the salary of the employee (payment per hour * hours worked). Next, 
show the no. and salary of the employee, with 2 decimal places. */

package myprojects.solvingproblems;

import java.util.Locale;
import java.util.Scanner;

public class SolvingProblems4 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US); //to use the . in the decimal// 
        Scanner sc = new Scanner(System.in);
        
        int employeeNo = sc.nextInt();
        double workedHours = sc.nextDouble();
        double perHour = sc.nextDouble();
        
        double salary = workedHours * perHour; 
        
        System.out.println("Employee No. = " + employeeNo);
        System.out.printf("Salary U$ = %.2f%n", salary); //use =%.2f%n to define how many decimal places//    
              
         sc.close();
    }
    
}
