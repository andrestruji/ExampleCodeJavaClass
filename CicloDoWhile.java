public class CicloDoWhile {
    public static void main(String[] args){

        int i = 1000;

        do{
            var res = i + ", ";
            System.out.print(res);
            i-=200;
        }while(i >= 0);

        System.out.println();
        System.out.println("Saliendo del ciclo Do While");
    }
}
