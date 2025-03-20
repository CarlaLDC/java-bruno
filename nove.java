
import java.util.Scanner;

public class nove {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o numero:");
        int numero = ler.nextInt();

        for ( int i = 0; i <= 10; i++ ){
            int conta = numero * i;
            System.out.println( numero + " X " + i + " = " + conta );

        }



    }
}
