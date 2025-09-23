import java.util.Scanner;

public class MetodoLengthSubstring {
    public static void main(String args[]){

        String cadena_original = "";
        String cadena_sub = "";
        int num_caracteres = 0;
        int desde = 0;
        int hasta = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce la cadena de caracteres: ");
        cadena_original = entrada.nextLine();
        num_caracteres = cadena_original.length();

        System.out.println("La cadena contiene: " + cadena_original + " posee " + num_caracteres + " caracteres");

        System.out.print("¿Desde que caracter deseas obtener la cadena?: ");
        desde = entrada.nextInt();
        System.out.print("¿Hasta que caracter deseas obtener la cadena?: ");
        hasta = entrada.nextInt();

        cadena_sub = cadena_original.substring(desde, hasta);

        System.out.println("La nueva cadena es: " + cadena_sub);
    }
}
