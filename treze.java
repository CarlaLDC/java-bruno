
import java.util.Scanner;

public class treze {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        System.out.println("Informe a quantidade de * : ");
        int linhas = ler.nextInt();

        for (int i = 1; i <= linhas; i++) {

            for (int cont = 0; cont < linhas - i; cont++) {
                System.out.print("  ");
            }

            for (int cont2 = 0; cont2 < i; cont2++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    
}
}

