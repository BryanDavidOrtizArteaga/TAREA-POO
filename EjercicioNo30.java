// AUTOR: Bryan David Ortiz Arteaga
// TEMA: Ejercicios de programación en Java

public class EjercicioNo30 {
    public static void main(String[] args) {
        
            // Ejercicio No.30
        System.out.println("Números primos entre 1 y 100:");
            for (int num = 2; num <= 100; num++) {
                boolean esPrimo = true;
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            if (esPrimo) {
                System.out.println(num);
            }
        }
    }
}