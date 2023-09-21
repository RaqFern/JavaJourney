/*
Make a program that reads three double-precision floating-point values: A, B, and C.
Then calculate and show:
a) the area of the right triangle that has A as its base and C as its height.
b) the area of the circle of radius C. (pi = 3.14159)
c) the area of the trapezoid that has A and B for bases and C for height.
d) the area of the square that has side B.
e) the area of the rectangle that has sides A and B
 */
package myprojects.solvingproblems;

import java.util.Locale;
import java.util.Scanner;

public class SolvingProblems6 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US); //to use the . in the decimal// 
        Scanner sc = new Scanner(System.in);
        
        double A, B, C, areaTri, areaCir, areaTrap, areaQuad, areaRet;
        
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        
        areaTri = A * C / 2.0;
        areaCir = 3.14159 * C * C;
        areaTrap = (A + B) / 2 * C; 
        areaQuad = B * B;
        areaRet = A * B;
        
        System.out.printf("Triangulo: %.3f%n", areaTri);
        System.out.printf("Circulo: %.3f%n", areaCir);
        System.out.printf("Trapezio: %.3f%n", areaTrap);
        System.out.printf("Quadrado: %.3f%n", areaQuad);
        System.out.printf("Retangulo: %.3f%n", areaRet);
        
        sc.close();
    }
    
}
