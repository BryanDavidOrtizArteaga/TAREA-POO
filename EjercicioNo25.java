// AUTOR: Bryan David Ortiz Arteaga
// TEMA: Ejercicios de programación en Java

public class EjercicioNo25 {
    
            // Ejercicio No.25
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static int ackermann(int m, int n) {
        if (m == 0) return n + 1;
        else if (m > 0 && n == 0) return ackermann(m - 1, 1);
        else return ackermann(m - 1, ackermann(m, n - 1));
    }

    public static void main(String[] args) {
        System.out.println("Factorial de 5: " + factorial(5));
        System.out.println("Ackermann(2, 3): " + ackermann(2, 3));   
            
    }
}