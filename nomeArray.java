import java.util.Scanner;

public class nomeArray {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

    String[] vetorNomes = new String[5];

    for ( int posicao = 0; posicao < vetorNomes.length; posicao++ ){
        System.out.println("Informe o nome: ");
        vetorNomes[posicao] = ler.next();
    }

    System.out.println("Voce digitou os nomes: ");

    for ( String item : vetorNomes ){
        System.out.println(item);
    }

    }

}