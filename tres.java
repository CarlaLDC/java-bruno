
import java.util.Scanner;

public class tres {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o inicio:");
        int inicio = ler.nextInt();

        System.out.println("Informe o fim:");
        int fim = ler.nextInt();

                
        for ( int i = inicio ;  i <= fim ; i++  ) {
            System.out.println(i);
        } 



    }
}
