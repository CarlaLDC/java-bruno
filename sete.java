
import java.util.Scanner;

public class sete {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a quantidade de * : ");
        int quantidade = ler.nextInt();

        for ( int cont2 = 1; cont2 <= quantidade; cont2++ ) {
            for ( int cont = 1; cont <= quantidade; cont++ ) {
            System.out.print(" * ");
        }

        System.out.println();

    }

}

}
