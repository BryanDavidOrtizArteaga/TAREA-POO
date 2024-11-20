// AUTOR: Bryan David Ortiz Arteaga
// TEMA: Ejercicios de programación en Java

import java.util.*;

public class EjercicioNo24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
            // Ejercicio No.24
        System.out.print("Introduce el coeficiente a: ");
        double a = s.nextDouble();
        System.out.print("Introduce el coeficiente b: ");
        double b = s.nextDouble();
        System.out.print("Introduce el coeficiente c: ");
        double c = s.nextDouble();
        
        double discriminante = b * b - 4 * a * c;
        
        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones son: x1 = " + x1 + " y x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("La solución única es: x = " + x);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }    
        
    }
}