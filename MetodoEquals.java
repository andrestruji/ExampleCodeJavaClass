import java.util.Scanner;

public class MetodoEquals {
    public static void main(String[] args){

        String primerNomnre = "";
        String segundoNombre = "";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer nombre: ");
        primerNomnre = scanner.nextLine();

        System.out.print("Ingresa el segundo noombre: ");
        segundoNombre = scanner.nextLine();

        if(primerNomnre.equalsIgnoreCase(segundoNombre)){
            System.out.println("Los nombres son iguales");
        }else{
            System.out.println("Los nombres son diferentes");
        }
    }
}
