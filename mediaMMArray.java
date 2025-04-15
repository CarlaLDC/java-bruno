
import java.util.Scanner;

public class mediaMMArray {
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

    System.out.println("");

    double menorNota = vetor[0];
    double maiorNota = vetor[0];
    double soma = 0;

    for ( double item : vetor ){
        soma = soma + item;
    }

    double media = soma / vetor.length;

    for (int i = 1; i < vetor.length; i++) {
        if (vetor[i] > maiorNota) {
            maiorNota = vetor[i];
        }
    }

    for (int i = 1; i > vetor.length; i--) {
        if (vetor[i] < menorNota) {
            menorNota = vetor[i];
        }
    }

    System.out.println("A média é: " + media);
    System.out.println("A maior nota é " + maiorNota);
    System.out.println("A menor nota é " + menorNota);

    }

}