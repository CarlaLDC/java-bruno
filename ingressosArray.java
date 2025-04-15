import java.util.Scanner;

public class ingressosArray {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

    System.out.println("Informe a quantidade de ingressos: ");
    int qtd = ler.nextInt();    

    String cupom =  "ING_PITTY";

    int[] vetorNumeros = new int[qtd];

    System.out.println("Os ingressos gerados foram: ");

    for ( int posicao = 1; posicao < vetorNumeros.length; posicao++ ){
        System.out.println(cupom + "_" + posicao);

    }


    }

}
