import java.util.Scanner;

public class Login {
    public static void main(String[] args){

        String usuario = "";
        String password = "";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre de usuario: ");
        usuario = scanner.nextLine();




        
        System.out.print("Ingresa el password: ");
        password = scanner.nextLine();

        if(usuario.equals("tomas")){
            if(password.equals("tomas19")){
                System.out.println("Inicio de sesion activo");
            }else{
                System.out.println("El password es incorrecto");
            }
        }else{
            System.out.println("Nombre de usuario incorrecto");
        }
    }
}
