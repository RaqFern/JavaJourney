/*Write an algorithm to read the type of fuel supplied (coded as follows: 1.Alcohol 
2.Gasoline 3.Diesel 4.End). If the user enters an invalid code (outside the range 1 to 4), 
a new code must be requested (up to that is valid). The program will be terminated 
when the code entered is number 4. It must print "THANK YOU" and the number of customers 
who filled each type of fuel
 */
package myprojects.solvingproblems;

import java.util.Scanner;

public class SolvingProblems9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       int Alcool = 0;
       int Gasolina = 0;
       int Diesel = 0;
       
       int tipo = sc.nextInt();
       
       while(tipo != 4){
           if (tipo == 1){
               Alcool = Alcool + 1;} 
           
           else if (tipo == 2){
                Gasolina = Gasolina + 1;}
           
           else if (tipo == 3){
                Diesel = Diesel + 1;}
           
           tipo = sc.nextInt();
       }
        System.out.println("MUITO OBRIGADO/THANK YOU");
        System.out.println("Alcool: " + Alcool);
        System.out.println("Gasolina: " + Gasolina);
	System.out.println("Diesel: " + Diesel);
       
        sc.close();
    }
    
}
