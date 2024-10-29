import java.util.Scanner;
import java.util.ArrayList;

public class Cleopatra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroCasos = scanner.nextInt();

        // Lista para almacenar los resultados
        ArrayList<String> resultados = new ArrayList<>();

        // Procesar cada caso de prueba
        for (int i = 0; i < numeroCasos; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();

            // Verificación del año 0
            if (A == 0 || B == 0 || C == 0) {
                System.out.println("El año 0 no existe.");
                continue;
            }

            // Calcular la distancia entre A y B
            int distanciaA = Math.abs(A - B);
            if ((A < 0 && B > 0) || (A > 0 && B < 0)) {
                distanciaA -= 1;  // Ajuste por la ausencia del año 0
            }

            // Calcular la distancia entre C y B
            int distanciaC = Math.abs(C - B);
            if ((C < 0 && B > 0) || (C > 0 && B < 0)) {
                distanciaC -= 1;  // Ajuste por la ausencia del año 0
            }

            // Comparar las distancias y almacenar el resultado en la lista
            if (distanciaA < distanciaC) {
                resultados.add(String.valueOf(A));
            } else if (distanciaC < distanciaA) {
                resultados.add(String.valueOf(C));
            } else {
                resultados.add("EMPATE");
            }
        }

        // Cerrar el scanner
        scanner.close();

        // Imprimir todos los resultados al final
        for (String resultado : resultados) {
            System.out.println(resultado);
        }
    }
}
