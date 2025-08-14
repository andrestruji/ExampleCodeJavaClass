import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int operacion;
        double numUno;
        double numDos;
        double res;

        System.out.println("**********************************");
        System.out.println("* Que operacion quieres realizar *");
        System.out.println("**********************************");
        System.out.println();

        System.out.println("1- Suma");
        System.out.println("2- Resta");
        System.out.println("3- Multiplicacion");
        System.out.println("4- Division");
        System.out.println();

        System.out.println("Ingresa la opcion seleccionada: ");
        operacion = entrada.nextInt();
        System.out.println();

        System.out.println("Ingresa el primer numero");
        numUno = entrada.nextDouble();
        System.out.println();

        System.out.println("Ingresa el numero dos");
        numDos = entrada.nextDouble();

        switch (operacion) {
            case 1:
                res = numUno + numDos;
                System.out.println("El resultado de tu suma es: " + res);        
                break;
            case 2:
                res = numUno - numDos;
                System.out.println("El resultado de la resta es: " + res);
                break;
            case 3:
                res = numUno * numDos;
                System.out.println("El resultado de la multiplicacion es: " + res);
                break;
            case 4: 
                res = numUno / numDos;
                System.out.println("El resultado de la division es: " + res);
                break;    
            default:
                System.out.println("Sistema cerrado");
                break;
        }
    }
}
