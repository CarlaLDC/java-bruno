import java.util.Scanner;

public class tabuadaArray {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

    System.out.println("Informe um numero: ");
    int qtd = ler.nextInt();

    int[] vetorNumeros = new int[11];

    for ( int posicao = 0; posicao < vetorNumeros.length; posicao++ ){
        
       vetorNumeros[posicao] = qtd * posicao;

    }

    for ( double item : vetorNumeros ){
        System.out.println(item);
    }

    }

}