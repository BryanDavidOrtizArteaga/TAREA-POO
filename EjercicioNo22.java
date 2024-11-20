// AUTOR: Bryan David Ortiz Arteaga
// TEMA: Ejercicios de programación en Java

import java.util.*;

public class EjercicioNo22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // Ejercicio No.22
        System.out.println("\\Ejercicio No.22\\");   
        System.out.print("Ingrese un número entero: ");
        int buena = s.nextInt();
        for (int i = 1; i < buena; i += 2) {
            System.out.println(i);
        System.out.println();        
        }
    }
}