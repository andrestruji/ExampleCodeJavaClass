public class Fifonnaci {
    public static void main(String[] args){

        int i = 0, a = 0, b = 1, c = 0;

        System.out.println("Serie Fibonnaci con For: ");
        for(i = 0; i < 10; i++){
            if(i < 9){
                System.out.print(a + ",");

                c = a + b;
                a = b;
                b = c;
            
            }else{
                System.out.print(a);
            }
        }
        System.err.println("");
        i = 0;
        a = 0;
        b = 1;
        c = 0;

        System.out.println("Serie Fibonnaci con While: ");
        while(i < 10){
            if(i < 9){
                System.out.print(a + ",");

                c = a + b;
                a = b;
                b = c;
            
            }else{
                System.out.print(a);
            }
            i++;
        }
        System.out.println("");
        i = 0;
        a = 0;
        b = 1;
        c = 0;

        System.out.println("Serie Fibonnaci con Do While: ");
        do {
            if(i < 9){
                System.out.print(a + ",");

                c = a + b;
                a = b;
                b = c;
            
            }else{
                System.out.print(a);
            }
            i++;
        } while (i < 10);
    }
}
