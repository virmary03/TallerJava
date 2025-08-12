import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese su nacionalidad: ");
        String nacionalidad = scanner.nextLine();

        System.out.print("Ingrese su ocupación: ");
        String ocupacion = scanner.nextLine();

        System.out.print("Ingrese su salario mensual: ");
        double salarioMensual = scanner.nextDouble();

        int anioActual = 2025;
        int anioNacimiento = anioActual - edad;

        System.out.println("\n===== Perfil del Usuario =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Ocupación: " + ocupacion);
        System.out.println("Salario mensual: $" + salarioMensual);
        System.out.println("Año de nacimiento: " + anioNacimiento);

        scanner.close();
    }
}
