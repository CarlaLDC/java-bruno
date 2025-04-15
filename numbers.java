import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

    double[] vetorNumeros = new double[5];

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