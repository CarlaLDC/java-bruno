
import java.util.Scanner;

public class numeroArray {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

    System.out.println("Informe a quantidade de numeros: ");
    double qtd = ler.nextDouble();

    double[] vetorNumeros = new double[(int) qtd];

    for ( int posicao = 0; posicao < vetorNumeros.length; posicao++ ){
        System.out.println("Informe o numero: ");
        vetorNumeros[posicao] = ler.nextDouble();
    }

    System.out.println("Voce digitou: ");

    for ( double item : vetorNumeros ){
        System.out.println(item);
    }

    }

}