// AUTOR: Bryan David Ortiz Arteaga
// TEMA: Ejercicios de programación en Java

import java.util.*;

public class EjercicioNo26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
            // Ejercicio No.26
        System.out.print("Introduce el primer número: ");
        int num1 = s.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = s.nextInt();
        System.out.print("Introduce el tercer número: ");
        int num3 = s.nextInt();
        
        int mayor = num1;
        int menor = num1;
        
        if (num2 > mayor) mayor = num2;
        if (num3 > mayor) mayor = num3;
        
        if (num2 < menor) menor = num2;
        if (num3 < menor) menor = num3;
        
        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);    
        
    }
}