import java.util.Random;
import java.util.Scanner;

public class parJogo {
    public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);

    System.out.println(" | Jogo do Par ou Ímpar |");

    System.out.println("Par ou ímpar? ");
    String escolha = leitor.next();

    System.out.println("Informe um número de 1 a 5: ");
    int numeroUsuario = leitor.nextInt();

    Random rand = new Random();
    int maquina = rand.nextInt(1, 6);

    int contaFinal = numeroUsuario + maquina;

    if ( contaFinal % 2 == 0 ) {
        System.out.println("Jogador pediu " + escolha);
        System.out.println("Jogador jogou " + numeroUsuario + " X " + maquina + " Máquina" );
        System.out.println("Jogador venceu.");
        System.out.println("Resultado: " + contaFinal);
    }

    else {
        System.out.println("Jogador pediu " + escolha);
        System.out.println("Jogador jogou " + numeroUsuario + " X " + maquina + " Máquina" );
        System.out.println("Máquina venceu");
        System.out.println("Resultado: " + contaFinal);
    }

    }
}
