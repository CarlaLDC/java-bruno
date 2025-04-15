import java.util.Scanner;

public class caractereArray {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.println("Informe uma frase: ");
        String frase = ler.nextLine();

        char[] caractereArray = frase.toCharArray(); 

        for ( char item : caractereArray ){
            System.out.println(item);
        }

    }
    
}
