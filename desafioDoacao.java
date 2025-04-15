import java.util.Scanner;

public class desafioDoacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o nome do projeto: ");
        String nomeProjeto = ler.nextLine();

        System.out.println("Informe a quantidade de doações recebidas: ");
        int qtdDoacoes = ler.nextInt();

        System.out.println("Informe a meta do projeto: ");
        int metaProjeto = ler.nextInt();

        int[] vetorDoacoes = new int[qtdDoacoes];
        int somaDoacoes = 0;


        for ( int i = 0; i < vetorDoacoes.length; i++ ){
            System.out.println("Informe a " + ( i + 1 ) + "º doação: ");
            vetorDoacoes[i] = ler.nextInt();

            somaDoacoes = somaDoacoes + vetorDoacoes[i];

        }

        System.out.println("\nO projeto " + nomeProjeto + " recebeu " + qtdDoacoes + " doações, totalizando " + somaDoacoes + " reais. " );

        System.out.println("As doações recebidas foram: ");

        for ( int item : vetorDoacoes ){
            System.out.print(item + " - ");
        }

        if (somaDoacoes >= metaProjeto) {

            int maiorQuantia = vetorDoacoes[0];

            for (int i = 0; i < vetorDoacoes.length; i++) {
                if (vetorDoacoes[i] > maiorQuantia) {
                    maiorQuantia = vetorDoacoes[i];
                }
            }

            System.out.println("\nA maior doação foi " + maiorQuantia + " reais.");
            System.out.println("A meta foi atingida!");
        } 

        else {
            System.out.println("A meta da doação não foi atingida. ");
        
        }

    }
}

