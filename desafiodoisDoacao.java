import java.util.Scanner;

public class desafiodoisDoacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o nome do projeto: ");
        String nomeProjeto = ler.nextLine();

        System.out.println("Informe a meta do projeto: ");
        int metaProjeto = ler.nextInt();

        int i = 0;

        boolean verdade = true;

        int [] vetorDoacoes = new int[50];

        System.out.println("Informe a doação: ");

        while ( verdade ) {
            int doacao = ler.nextInt();

            if ( doacao == -1 ){
                break;
            }

            else if ( i < vetorDoacoes.length ){
                vetorDoacoes[i] = doacao;
                i++;
            }

            else {
                break;
            }

        }

        int somaDoacoes = 0;

        for ( int soma = 0; soma < i; soma++ ){
            somaDoacoes += vetorDoacoes[soma];
        }

        System.out.println("\nO projeto " + nomeProjeto + " recebeu " + i + " doações, totalizando " + somaDoacoes + " reais. " );

        System.out.println("As doações recebidas foram: ");

        for (int cont = 0; cont < i; cont++) {
            System.out.print(vetorDoacoes[cont]);
            if (cont < i - 1) {
                System.out.print(" - ");
            }
        }

        System.out.println("");

        if (somaDoacoes >= metaProjeto) {

            int maiorQuantia = vetorDoacoes[0];

            for (int cont = 1; cont < i; cont++) {
                if (vetorDoacoes[cont] > maiorQuantia) {
                    maiorQuantia = vetorDoacoes[cont];
                }
            }

            System.out.println("A maior doação foi " + maiorQuantia + " reais.");
            System.out.println("A meta foi atingida!");
        } 

        else {
            System.out.println("A meta da doação não foi atingida. ");
        
        }



    }

}
