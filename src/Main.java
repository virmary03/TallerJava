import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        int nota1, nota2, nota3;

        System.out.print("Ingrese la primera calificación: ");
        nota1 = scanner.nextInt();

        System.out.print("Ingrese la segunda calificación: ");
        nota2 = scanner.nextInt();

        System.out.print("Ingrese la tercera calificación: ");
        nota3 = scanner.nextInt();

        // Calcular promedio usando casting a double
        double promedio = (double)(nota1 + nota2 + nota3) / 3;

        // Mostrar resultados
        System.out.println("\nEstudiante: " + nombre);
        System.out.println("Promedio: " + promedio);

        // Cerrar Scanner
        scanner.close();
    }
}