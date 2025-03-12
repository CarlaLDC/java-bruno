import java.util.Scanner;

public class exercicioDois {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
    
        System.out.println("Informe a cor do farol:");
        String cor = leitor.next();

        if ( cor.equals("Vermelho") ) {
            System.out.println("Espere");
        }

        else if ( cor.equals("Verde") ) {
            System.out.println("Atravesse");
        }

        else {
            System.out.println("Farol Inoperante");
        }

    }
}
