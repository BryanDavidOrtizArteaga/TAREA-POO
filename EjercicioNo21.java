// AUTOR: Bryan David Ortiz Arteaga
// TEMA: Ejercicios de programación en Java

import java.util.*;

public class EjercicioNo21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
            // Ejercicio No.21
        System.out.println("\\Ejercicio No.21\\");   
        System.out.print("Ingrese el primer número: ");
        int numero1 = s.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = s.nextInt();
        if (numero1 > numero2) {
            System.out.println("El número mayor es: " + numero1 + " y el menor es: " + numero2);
        } else {
            System.out.println("El mayor es: " + numero2 + " y el menor es: " + numero1);
        }
        System.out.println();        
        
    }
}