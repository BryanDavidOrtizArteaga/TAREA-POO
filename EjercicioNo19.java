// AUTOR: Bryan David Ortiz Arteaga
// TEMA: Ejercicios de programación en Java

import java.util.*;

public class EjercicioNo19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
            // Ejercicio No.19
        System.out.println("\\Ejercicio No.19\\");   
        System.out.print("Ingrese cantidad de euros: ");
        double euros = s.nextDouble();
        double calculo = 1.06;
        System.out.println("En dólares es: " + (euros * calculo));
        System.out.println();        
        
    }
}