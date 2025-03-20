
import java.util.Scanner;

public class seis {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a quantidade de * : ");
        int quantidade = ler.nextInt();

        for ( int i = 1; i <= quantidade; i++ ) {
            System.out.print(" * ");
        }

}

}
