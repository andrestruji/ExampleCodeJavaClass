public class CicloWhile {
    public static void main(String[] args){

        int i = 1;
        
        while (i < 10) {
            var res = i + ", ";
            System.out.print(res);
            i+=2;
        }

        System.out.println();
        System.out.println("Saliendo del ciclo");
    }
}
