// AUTOR: Bryan David Ortiz Arteaga
// TEMA: Ejercicios de programación en Java

public class EjercicioNo28 {
    public static void main(String[] args) {
        
            // Ejercicio No.28
         for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0 -> System.out.println("Caso 0");
                case 1 -> System.out.println("Caso 1");
                case 2 -> System.out.println("Caso 2");
                case 3 -> System.out.println("Caso 3");
                case 4 -> System.out.println("Caso 4");
                default -> System.out.println("Caso por defecto");
            }
        }
        
        // Prueba sin break
        System.out.println("Prueba sin break:");
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    System.out.println("Caso 0");
                case 1:
                    System.out.println("Caso 1");
                case 2:
                    System.out.println("Caso 2");
                case 3:
                    System.out.println("Caso 3");
                case 4:
                    System.out.println("Caso 4");
            }
        }     
    }
}