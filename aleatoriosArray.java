import java.util.Scanner;

public class aleatoriosArray {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

    System.out.println("Informe quantos numeros serão:");
    int qtd = ler.nextInt();

    int[] vetorNumeros = new int[qtd];

    for ( int posicao = 0; posicao < vetorNumeros.length; posicao++ ){
        vetorNumeros[posicao] = (int) (Math.random() * 100);
    }

    System.out.println("Os números gerados aleatoriamente foram: ");

    for ( int item : vetorNumeros ){
        System.out.println(item);
    }


    }
    
}
