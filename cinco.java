
import java.util.Scanner;

public class cinco {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o inicio:");
        int inicio = ler.nextInt();

        System.out.println("Informe o fim:");
        int fim = ler.nextInt();

        for ( int i = inicio ;  i <= fim ; i++ ) {

            if ( i % 2 == 0 ) {
                System.out.println(i);
            }

        } 

    }
}
