// AUTOR: Bryan David Ortiz Arteaga
// TEMA: Ejercicios de programación en Java

import java.util.*;

public class EjercicioNo29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
            // Ejercicio No.29
        System.out.println("Introduce texto (Ctrl+D para finalizar en Linux/Mac o Ctrl+Z en Windows): ");
        while (s.hasNext()) {
            String entrada = s.nextLine();
            System.out.println("Has introducido: " + entrada);
        }            
    }
}