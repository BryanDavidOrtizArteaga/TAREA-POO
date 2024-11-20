// AUTOR: Bryan David Ortiz Arteaga
// TEMA: Ejercicios de programación en Java

import java.util.*;

public class EjercicioNo27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
            // Ejercicio No.27
        while (true) {
            System.out.print("Introduce la temperatura en Fahrenheit (o 999 para salir): ");
            double fahrenheit = s.nextDouble();
            
            if (fahrenheit == 999) break;
            
            double celsius = 5.0 / 9.0 * (fahrenheit - 32);
            System.out.println("Temperatura en Celsius: " + celsius);
        }     
    }
}