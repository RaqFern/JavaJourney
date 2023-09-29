/* Write a program to read the coordinates (X,Y) of an indeterminate number of
points in the Cartesian coordinate system. For each point, write the quadrant to 
which it belongs. The algorithm will terminate when at least one of two coordinates 
is NULL (in this situation without writing any message)
 */
package myprojects.solvingproblems;

import java.util.Scanner;

public class SolvingProblems8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        while (x != 0 && y !=0){
            if(x > 0 && y > 0) {
                System.out.println("Primeiro quadrante/First quadrant");}
            else if (x < 0 && y > 0) {
                System.out.println("Segundo quadrante/Second quadrant");}
            else if (x < 0 && y < 0) {
                System.out.println("Terceiro quadrante/Third quadrant");}
            else if (x > 0 && y < 0){
                System.out.println("Quarto quadrante/Fourth quadrant");}
                
            x = sc.nextInt();
            y = sc.nextInt();
                
            }
        sc.close();
    }
    
}
