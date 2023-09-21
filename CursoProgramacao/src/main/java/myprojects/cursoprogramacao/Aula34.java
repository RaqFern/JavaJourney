// if-else structure //

package myprojects.cursoprogramacao;

import java.util.Scanner;

public class Aula34 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int hora;
         
         System.out.println("Quantas horas?");
         hora = sc.nextInt(); 
         
         if (hora < 12) {
             System.out.println("Bom dia");
         }
         else {
             System.out.println("Boa tarde");
         }
         sc.close();
    }
    
}
