/* EN: Create a program to read the measurements of the width and length of a 
rectangular plot of land to one decimal place, as well as the value of the square
meter of the land to two decimal places. Then, the program must show the value 
of the land area.

PT-BR: Fazer um programa para ler as medidas da largura e comprimento de um terreno 
retangular com uma casa decimal, bem como o valor do metro quadrado do terreno
com duas casa decimais. Em seguida, o programa deve mostrar o valor da area do 
terreno. */

package myprojects.solvingproblems;

import java.util.Scanner;

public class SolvingProblems {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
             
        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();
        
        double area = largura * comprimento; 
        double preco = area * metroQuadrado;
        
        System.out.printf("Area = %.2f%n ", area);
        System.out.printf("Preço = %.2f%n", preco);
        
        sc.close();
                        
    }
}
