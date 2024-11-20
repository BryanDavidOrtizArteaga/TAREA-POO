// AUTOR: Bryan David Ortiz Arteaga
// TEMA: Ejercicios de programación en Java

import java.util.*;

public class EjercicioNo18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
            // Ejercicio No.18
        System.out.println("\\Ejercicio No.18\\");
        System.out.print("Ingrese un número entero: ");
        int numero = s.nextInt();
        int buenashh = 0;
        for (int i = 1; i <= 100; i++) {
            buenashh += numero + i;
        }
        System.out.println(buenashh);        
        System.out.println();        
        
    }
}