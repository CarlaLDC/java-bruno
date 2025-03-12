import java.util.Scanner;

public class exercicioUm {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
    
        System.out.println("Informe o tipo do ingresso:");
        String tipo = leitor.next();

        System.out.println("Informe a quantidade dos ingressos:");
        double qtd = leitor.nextDouble();

        if ( tipo.equals("Meia") ) {
            double ingresso = 28.50 / 2;
            double contaTotal = qtd * ingresso;

            System.out.println("O total a pagar é: " + contaTotal);
        }

        else {
            double ingresso = 28.50;
            double contaTotal = qtd * ingresso;

            System.out.println("O total a pagar é: " + contaTotal);
        }

    }
}
