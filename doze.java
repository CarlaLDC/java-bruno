
import java.util.Scanner;

public class doze {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        System.out.println("Informe a quantidade de * : ");
        int linhas = ler.nextInt();

        for ( int cont = 1;  cont <= linhas; cont++ ) {
            for ( int cont2 = 0; cont2 < cont; cont2++ ) {
                System.out.print(" * ");

            }

            System.out.println();
        }
    
}
}
