
import java.util.Scanner;

public class quatro {
    public static void main(String[] args) {
           Scanner ler = new Scanner(System.in);
           
        System.out.println("Informe o inicio:");
        int inicio = ler.nextInt();

        System.out.println("Informe o fim:");
        int fim = ler.nextInt();
                
        for ( int i = fim ;  i >= inicio ; i--  ) {
            System.out.println(i);
        } 

    }

}

