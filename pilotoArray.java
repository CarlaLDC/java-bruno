import java.util.Scanner;

public class pilotoArray {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

    System.out.println("Informe a quantidade de pilotos:");
    int qtd = ler.nextInt();

    int[] vetorInicial = new int[qtd];

    System.out.println("Informe a posição inicial: ");

    for ( int i = 0; i < vetorInicial.length; i++ ){
        vetorInicial[i] = ler.nextInt();
    }

    int[] vetorChegada = new int[qtd];

    System.out.println("Informe a posição final: ");    

    for ( int i = 0; i < vetorChegada.length; i++ ){
        vetorChegada[i] = ler.nextInt();
    }

    int[] posicaoFinal = new int[qtd];

    System.out.println();

    for ( int i = 0; i < posicaoFinal.length; i++ ){
        posicaoFinal[i] = vetorChegada[i] - vetorInicial[i];

        if ( posicaoFinal[i] < 0 ){
            System.out.println("O piloto " + i + " retrocedeu " + Math.abs(posicaoFinal[i]) + " posições");
        }

        else if ( posicaoFinal[i] > 0 ){
            System.out.println("O piloto " + i + " avançou " + posicaoFinal[i] + " posições");
        }

        else {
            System.out.println("O piloto " + i + " manteve " + posicaoFinal[i] + " posições");
        }


    }

    }
    
}
