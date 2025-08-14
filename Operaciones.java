import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int operacion = 0;
        double numUno;
        double numDos;
        double res;

        System.out.println("**********************************");
        System.out.println("* Que operacion quieres realizar *");
        System.out.println("**********************************");
        System.out.println();

        while (operacion != 5) {

            System.out.println("1- Suma");
            System.out.println("2- Resta");
            System.out.println("3- Multiplicacion");
            System.out.println("4- Division");
            System.out.println("5- Salir");
            System.out.println();

            System.out.println("Ingresa la opcion seleccionada: ");
            operacion = entrada.nextInt();
            System.out.println();

            if (operacion >= 1 && operacion <= 4) {

                System.out.println("Ingresa el primer numero");
                numUno = entrada.nextDouble();
                System.out.println();

                System.out.println("Ingresa el numero dos");
                numDos = entrada.nextDouble();
                System.out.println();

                switch (operacion) {
                    case 1:
                        res = numUno + numDos;
                        System.out.println("El resultado de tu suma es: " + res);
                        System.out.println();
                        break;
                    case 2:
                        res = numUno - numDos;
                        System.out.println("El resultado de la resta es: " + res);
                        System.out.println();
                        break;
                    case 3:
                        res = numUno * numDos;
                        System.out.println("El resultado de la multiplicacion es: " + res);
                        System.out.println();
                        break;
                    case 4:
                        res = numUno / numDos;
                        System.out.println("El resultado de la division es: " + res);
                        System.out.println();
                        break;
                    default:
                        break;
                }
            }

            System.out.println("Ingresa un numero del 1 al 4 para continuar o un 5 para salir: ");
            operacion = entrada.nextInt();
            System.out.println();
        }

        System.out.println("************************");
        System.out.println("* Saliste del programa *");
        System.out.println("************************");
    }
}
