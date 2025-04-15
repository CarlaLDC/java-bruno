import java.util.Scanner;

public class numerosInvertidos {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

    System.out.println("Informe a quantidade de numeros: ");
    int qtd = ler.nextInt();

    int[] vetorNumeros = new int[qtd];

    for ( int posicao = 0; posicao < vetorNumeros.length; posicao++ ){
        System.out.println("Informe o numero: ");
        vetorNumeros[posicao] = ler.nextInt();
    }

    System.out.println("Voce digitou: ");

    for (int i = qtd - 1; i >= 0; i--) {
        System.out.println(vetorNumeros[i]);
    }

    }

}
