import java.util.Scanner;

public class cinemaTotal {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
    
        System.out.println("Informe quantos ingressos do tipo Meia serão:");
        double qtdMeia = leitor.nextDouble();

        System.out.println("Informe quantos ingressos do tipo Inteira serão:");
        double qtdInteira = leitor.nextDouble();

        System.out.println("Informe o dia da semana:");
        String semana = leitor.next();

        System.out.println("O filme é nacional? ");
        boolean nacional = leitor.nextBoolean();

        if ( nacional == true ) {
            double ingresso = 5;
            double contaTotal = ( qtdInteira * ingresso ) + ( qtdMeia * ingresso );

            System.out.println("O total a pagar é: " + contaTotal);
        }


        else if ( semana.equals("Quarta-feira") ) {
            double ingresso = 14.25;
            double contaTotal = ( qtdMeia * ingresso ) + ( qtdInteira * ingresso );

            System.out.println("O total a pagar é: " + contaTotal);
        }

        else {
            double contaTotal = ( qtdMeia * 14.25 ) + ( qtdInteira * 28.50 );

            System.out.println("O total a pagar é: " + contaTotal );
        }


    }
}
