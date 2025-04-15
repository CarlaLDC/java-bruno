import java.util.Scanner;

public class inicialArray {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.println("Informe a quantidade de nomes: ");
        int qtd = ler.nextInt();

        String[] vetorNomes = new String[qtd];
        String[] vetorNomesL = new String[qtd];

        for ( int i = 0; i < vetorNomes.length; i++ ){
            vetorNomes[i] = ler.nextLine();

            if ( vetorNomes[i].length() > 0 && vetorNomes[i].charAt(0) == 'L') {
                vetorNomesL[i] = vetorNomes[i];
            }
        }

        System.out.println("Os nomes que iniciam com L são: ");

        for ( String item : vetorNomesL ){
            System.out.println(item);
        }
    }
}