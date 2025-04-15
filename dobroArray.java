import java.util.Scanner;

public class dobroArray {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.println("Informe a quantidade de números:");
        int qtd = ler.nextInt();

        int[] vetorNumeros = new int[qtd];

        for ( int repetir = 0; repetir < vetorNumeros.length; repetir++ ){
            System.out.println("Informe os números:");
            vetorNumeros[repetir] = ler.nextInt();
        }

        System.out.println("Você digitou os números:");

        for ( int item : vetorNumeros ){
            System.out.println(item);
        }

        System.out.println("O dobro de cada número é:");

        for ( int item : vetorNumeros ){
            System.out.println(item * 2);
        }

    }
}
