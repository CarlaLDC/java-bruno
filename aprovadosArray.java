
import java.util.Scanner;

public class aprovadosArray {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

    System.out.println("Informe a quantidade de notas: ");
    double qtd = ler.nextDouble();

    double[] vetor = new double[(int) qtd];

    for ( int posicao = 0; posicao < vetor.length; posicao++ ){
        System.out.println("Informe a nota: ");
        vetor[posicao] = ler.nextDouble();
    }

    System.out.println("Notas digitadas: ");

    for ( double item : vetor ){
        System.out.print(item + " - ");

    }

    System.out.println("");

    for ( int i = 0; i < vetor.length; i++ ){
        if ( vetor[i] >= 6 ){
            System.out.println("Todos alunos passaram.");
            break;
        } 

        else if ( vetor[i] < 6 ) {
            System.out.println("Não foram todos alunos passaram.");
            break;            
        }
    }

    }

}