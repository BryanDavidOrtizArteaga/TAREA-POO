// AUTOR: Bryan David Ortiz Arteaga
// TEMA: Ejercicios de programación en Java

import java.util.*;

public class EjercicioNo23 {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int a = s.nextInt();
        System.out.print("Introduce el segundo número: ");
        int b = s.nextInt();
        
        int resultado = gcd(a, b);
        System.out.println("El GCD de " + a + " y " + b + " es: " + resultado);
    }
}