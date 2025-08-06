import java.util.Scanner;

public class CocaColaExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nombre;
        int clave;
        int antiguedad;

        String titulo = "Bienvenido al Sistema Vacacional de Coca-Cola Company";
        String nombreTrabajador = "¿Cual es el nombre del trabajador?";
        String anosTrabajador = "¿Cuantos años de servicio tiene el trabajador?";
        String departamento = "¿Cual es la clave de su departamento?";
        String noVacaciones = "No tiene derecho a vacaciones";
        String noClaveValida = "Error, la clave de departamento no es valida";

        System.out.println(titulo);
        System.out.println();
        System.out.println(nombreTrabajador);
        nombre = scanner.nextLine();
        System.out.println();
        System.out.println(anosTrabajador);
        antiguedad = scanner.nextInt();
        System.out.println();
        System.out.println(departamento);
        clave = scanner.nextInt();

        if (clave == 1) {
            if (antiguedad == 1) {
                System.out.println(nombre + ", tienes derecho a 6 dias de vacaciones");
            } else if (antiguedad >= 2 && antiguedad <= 6) {
                System.out.println(nombre + ", tienes derecho a 14 dias de vacaciones");
            } else if (antiguedad >= 7) {
                System.out.println(nombre + ", tienes derecho a 20 dias de vacaciones");
            } else {
                System.out.println(noVacaciones);
            }
        } else if (clave == 2) {
            if (antiguedad == 1) {
                System.out.println(nombre + ", tienes derecho a 7 dias de vacaciones");
            } else if (antiguedad >= 2 && antiguedad <= 6) {
                System.out.println(nombre + ", tienes derecho a 15 dias de vacaciones");
            } else if (antiguedad >= 7) {
                System.out.println(nombre + ", tienes derecho a 22 dias de vacaciones");
            } else {
                System.out.println(noVacaciones);
            }
        } else if (clave == 3) {
            if (antiguedad == 1) {
                System.out.println(nombre + ", tienes derecho a 10 dias de vacaciones");
            } else if (antiguedad >= 2 && antiguedad <= 6) {
                System.out.println(nombre + ", tienes derecho a 20 dias de vacaciones");
            } else if (antiguedad >= 7) {
                System.out.println(nombre + ", tienes derecho a 30 dias de vacaciones");
            } else {
                System.out.println(noVacaciones);
            }
        } else {
            System.out.println(noClaveValida);
        }
        scanner.close();
    }

}
