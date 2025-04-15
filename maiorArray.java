
import java.util.Scanner;

public class maiorArray {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

    System.out.println("Informe a quantidade de notas: ");
    double qtd = ler.nextDouble();

    double[] vetor = new double[(int) qtd];

    for ( int posicao = 0; posicao < vetor.length; posicao++ ){
        System.out.println("Informe a nota: ");
        vetor[posicao] = ler.nextDouble();
    }

    System.out.println("Notas digitadas: ");

    for ( double item : vetor ){
        System.out.print(item + " - ");

    }

    double maiorNota = vetor[0];

    for (int i = 1; i < vetor.length; i++) {
        if (vetor[i] > maiorNota) {
            maiorNota = vetor[i];
        }
    }

    System.out.println("A maior nota é " + maiorNota);

    }

}
