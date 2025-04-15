
import java.util.Scanner;

public class mediaArray {
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

    double soma = 0;

    for ( double item : vetor ){
        soma = soma + item;
    }

    double media = soma / vetor.length;

    System.out.println();
    System.out.println("A média é: " + media);

    }

}