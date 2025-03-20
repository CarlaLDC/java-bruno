
import java.util.Scanner;

public class oito {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a base: ");
        int base = ler.nextInt();

        System.out.println("Informe a altura : ");
        int altura = ler.nextInt();

        for ( int cont2 = 1; cont2 <= altura; cont2++ ) {
            for ( int cont = 1; cont <= base; cont++ ) {
            System.out.print(" * ");
        }

        System.out.println();

    }

}

}
