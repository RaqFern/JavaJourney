/*
 A telephone operator charges 50 on a basic plan that entitles you to 100
minutes of telephone time. Each excess minute is charged 2. Create a program 
to read the number of minutes a person consumed and show the amount to be paid.
 */
package myprojects.cursoprogramacao;

import java.util.Locale;
import java.util.Scanner;

public class Aula37 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); 
        
        int minutos = sc.nextInt();
        
        double conta = 50.0;
        
        if (minutos > 100) {
            conta += (minutos - 100) * 2.0; 
        } 
        
        System.out.printf("Valor da conta = R$ %.2f%n", conta);
        
        sc.close();
    }
    
}
